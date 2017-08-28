INPUT:-

import java.util.*;
class priority{
  public static void main(String[] args){
   Scanner sc= new Scanner(System.in);
   int i,j,time,sum_wait=0,sum_turnaround=0;
   int smallest,remain;
   int at[]=new int[10];
   int bt[]=new int[10];
   int priority[] =new int[10];
   System.out.println("Enter no of Processes : ");
   int n= sc.nextInt();
   remain=n;
   for(i=0;i<n;i++)
    {
      System.out.println("Enter arrival time, burst time and priority for process p"+(i +1)+":");
      at[i] =sc.nextInt();
      bt[i] =sc.nextInt();
      priority[i] =sc.nextInt();
    }
    priority[9]=11;
    System.out.println("\nProcess\t|Turnaround time|waiting time\n");
    for(time=0;remain!=0;)
    {
      smallest=9;
      for(i=0;i<n;i++)
      {
        if(at[i]<=time && priority[i]<priority[smallest] && bt[i]>0)
        {
          smallest=i;
        }
      }
     time+=bt[smallest];
     remain--;
     System.out.println("P "+(smallest+1)+"\t|  "+(time-at[smallest])+"\t\t|  "+(time-at[smallest]-bt[smallest]));
     sum_wait+=time-at[smallest]-bt[smallest];
     sum_turnaround+=time-at[smallest];
     bt[smallest]=0;
   }
   System.out.println("\nAvg waiting time = "+sum_wait*1.0/n);
   System.out.println("Avg turnaround time = "+sum_turnaround*1.0/n);
 }
}

OUTPUT:-

C:\Users\rishi\Desktop>javac priority.java

C:\Users\rishi\Desktop>java priority
Enter no of Processes :
5
Enter arrival time, burst time and priority for process p1:
0 10 2
Enter arrival time, burst time and priority for process p2:
1 3 3
Enter arrival time, burst time and priority for process p3:
2 2 1
Enter arrival time, burst time and priority for process p4:
3 4 5
Enter arrival time, burst time and priority for process p5:
4 5 4

Process |Turnaround time|waiting time

P 1     |  10           |  0
P 3     |  10           |  8
P 2     |  14           |  11
P 5     |  16           |  11
P 4     |  21           |  17

Avg waiting time = 9.4
Avg turnaround time = 14.2
