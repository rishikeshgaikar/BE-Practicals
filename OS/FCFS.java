Input:-

import java.util.*;

public class FCFS
{
	public static void main(String []args)
	{
		 int n;
		 float awt = 0, atat =0;
		 Scanner in = new Scanner(System.in);
		 System.out.print("Enter the number of processes:- ");
		 n = in.nextInt();
		 int at[] = new int[n];
		 int bt[] = new int[n];
		 int wt[] = new int[n];
		 int tat[] = new int[n];
		 System.out.println("Enter the Arrival Time and Burst Time for the processes:- ");
		 for(int i = 0; i<n; i++)
		 {
		 	System.out.print("Enter the Arrival Time and Burst Time for Process " + (i+1) + " :- ");
		 	at[i] = in.nextInt();
		 	bt[i] = in.nextInt();
		 }
		 wt[0]=0;
		 for(int i = 1; i<n ; i++)
		 {
		 	wt[i] = wt[i-1] + bt[i-1] + at[i-1];
		 	wt[i] = wt[i] - at[i];
		 	awt = awt + wt[i];
		 }
		 for(int i = 0; i<n ; i++)
		 {
		  tat[i] = wt[i] + bt[i];
		  atat = atat + tat[i];
		 }
		 System.out.println("Process\tBurst\tWaiting\tTurnaround");
		 for(int i = 0; i<n; i++)
		 {
		 	System.out.println("P" + (i+1) + "\t" + bt[i] + "\t" + wt[i] + "\t" + tat[i]);
		 }
		 awt = awt/n;
		 atat = atat/n;
		 System.out.println("Average Waiting Time :- " + awt + "\nAverage Turnaround Time :- " + atat);
	}
}


Output:-
**OUTPUT IS REMAINIG**
