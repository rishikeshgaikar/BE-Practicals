Input:-

import java.util.*; 

public class SJFP 
{ 
  public static void main(String args[]) 
  { 
    Scanner sc = new Scanner(System.in); 
    int sumt=0,sumw=0,sum_bt=0,smallest,rem,n,i,time; 
    int bt[] = new int[10]; 
    int at[]= new int[10]; 
    int rt[] = new int[10]; 
    System.out.println("Enter the number of Processes:- "); 
    n = sc.nextInt(); 
    rem = n; 
    for(i=0;i<n;i++) 
      { 
        System.out.print("Arrival time for process P"+(i+1)+ ": "); 
        at[i] = sc.nextInt(); 
        System.out.print("Burst time for process P"+(i+1)+ ": "); 
        bt[i] = sc.nextInt(); 
        rt[i]=bt[i]; 
      } 
    rt[9]=bt[9]=9999; 
    System.out.print("\n\nProcess\t|Waiting Time| Turnaround Time\n\n"); 
    for(time=0;rem!=0;time++) 
        { 
          smallest=9; 
          for(i=0;i<n;i++) 
            { 
              if(at[i]<=time && rt[i]>0 && rt[i]<rt[smallest]) 
              smallest=i; 
              } 
          rt[smallest]--; 
          if(rt[smallest]==0) 
            { 
              rem--; 
              System.out.println("P["+(smallest+1)+"]"+"\t|\t"+(time+1-bt[smallest]-at[smallest])+"\t|\t"+(time+1-at[smallest])); 
              sumt+=time+1-bt[smallest]-at[smallest]; 
              sumw+=time+1-at[smallest]; 
            } 
        } 
  System.out.println("\nAverage waiting time = "+(sumw*1.0/n)); 
  System.out.println("\nAverage turnaround time = "+(sumt*1.0/n)); 
  } 
}


Output:-

**OUTPUT is remainig**
