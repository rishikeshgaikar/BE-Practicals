Input:-

import java.util.*; 

public class SJF 
{ 
	public static void main(String []args) 
	{ 
		Scanner sc = new Scanner(System.in); 
		int time,sum_bt=0,smallest,n,i; 
		System.out.print("Enter the number of Processes:- "); 
		n = sc.nextInt(); 
		int bt[] = new int[10]; 
		int at[] = new int[10]; 
  		int sum_turnaround=0,sum_wait=0;	 
  		for(i=0;i<n;i++) 
  			{ 
    			System.out.print("Enter arrival time for process P"+(i+1)+": "); 
    			at[i] = sc.nextInt(); 
    			System.out.print("Enter burst time for process P"+(i+1)+": "); 
    			bt[i] = sc.nextInt(); 
    			sum_bt+=bt[i]; 
  			} 
  		bt[9] = 99; 
  		System.out.print("\n\nProcess\t|Turnaround Time| Waiting Time\n\n"); 
  		for(time=0;time<sum_bt;) 
  			{ 
    			smallest=9; 
    			for(i=0;i<n;i++) 
    				{ 
      					if(at[i]<=time && bt[i]>0 && bt[i]<bt[smallest]) 
        					smallest=i; 
    				} 
    			if(smallest==9) 
    				{ 
      					time++; 
      					continue; 
    				} 
    			System.out.print("P["+(smallest+1)+"]\t|\t"+(time+bt[smallest]-at[smallest])+"\t|\t"+(time-at[smallest])+"\n"); 
    			sum_turnaround+=time+bt[smallest]-at[smallest]; 
    			sum_wait+=time-at[smallest]; 
    			time+=bt[smallest]; 
    			bt[smallest]=0; 
  			} 
  		System.out.print("\n\n average waiting time = "+(sum_wait*1.0/n)); 
  		System.out.println("\n\n average turnaround time = "+(sum_turnaround*1.0/n)); 
	} 
}



Output:-
**OUTPUT is remaining**
