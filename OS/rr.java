INPUT:-


import java.util.*;
public class rr
{
public static void main(String args[])
{
	Scanner sc =new Scanner(System.in);
	int i,j,n,t,r,flag=0,tq,wt=0,tat=0;
	int at[]=new int [10];
	int bt[]=new int[10];
	int rt[]=new int [10];
	System.out.print("Enter Total Process: ");
	n = sc.nextInt();
	r = n;
	for(i=0;i<n;i++)
	{
		System.out.print("Enter Arrival Time and Burst Time for Process Number "+(i+1)+": ");
		at[i] = sc.nextInt();
		bt[i] = sc.nextInt();
		rt[i] = bt[i];
	}
	System.out.print("Enter Time Quantum: ");
	tq = sc.nextInt();
	System.out.print("\n\nProcess\t Turnaround Time  Waiting Time\n\n");
	for(t=0,i=0;r!=0;)
	{
		if(rt[i]<=tq && rt[i]>0)
		{
			t+=rt[i];
			rt[i]=0;
			flag=1;  
		}
		else if(rt[i]>0)
		{
			rt[i]-=tq;
			t+=tq;
		}
		if(rt[i]==0 && flag==1)
		{  
			r--;
			System.out.println("  P["+(i+1)+"]\t\t"+(t-at[i])+"\t\t"+(t-at[i]-bt[i]));
			wt+=t-at[i]-bt[i];
			tat+=t-at[i];
			flag=0;
		}
		if(i==n-1)
		i=0;
		else if(at[i+1]<=t)
		i++;
		else
		i=0;
	}
	System.out.println("\nAverage Waiting Time = "+(wt*1.0/n));
	System.out.println("Average Turnaround Time = "+(tat*1.0/n));
}
}

Output:
nitin@NitinShinde:~$ java rr
Enter Total Process: 6
Enter Arrival Time and Burst Time for Process Number 1: 0 4
Enter Arrival Time and Burst Time for Process Number 2: 1 5
Enter Arrival Time and Burst Time for Process Number 3: 2 2
Enter Arrival Time and Burst Time for Process Number 4: 3 1
Enter Arrival Time and Burst Time for Process Number 5: 4 6
Enter Arrival Time and Burst Time for Process Number 6: 5 3
Enter Time Quantum: 4


Process	 Turnaround Time  Waiting Time

  P[1]		4		0
  P[3]		8		6
  P[4]		8		7
  P[6]		13		10
  P[2]		18		13
  P[5]		17		11

Average Waiting Time = 7.833333333333333
Average Turnaround Time = 11.333333333333334
