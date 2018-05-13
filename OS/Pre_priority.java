INPUT:-

import java.util.*;
class Pre_priority
{
int bt,at,process,pri,tat,wt,copy_of_bt;
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("enter no. of processes : ");
int n=sc.nextInt();
Pre_priority op[] = new Pre_priority[n+1];       // creatng array of objects
for(int i=0;i<=n;i++)
    op[i]= new Pre_priority();
int sum=0;
for(int m=1;m<=n;m++)
{
op[m].process=m;
System.out.println("enter burst time,arrival time  and  priority of process "+m);
op[m].bt=sc.nextInt();
op[m].at=sc.nextInt();
op[m].pri=sc.nextInt();
sum+=op[m].bt;
op[m].copy_of_bt=op[m].bt;
}
for(int t=1;t<=sum;t++)
    {
    int min=9999,index=0;
    for(int j=1;j<=n;j++)
        {
        if(op[j].at<t && op[j].pri<min && op[j].bt>0)
            {
            min=op[j].pri;
            index=j;
            }
        }
        op[index].bt-=1;
        if(op[index].bt==0)
            {
            op[index].tat=t-op[index].at;
            op[index].wt=op[index].tat-op[index].copy_of_bt;
          }
    }
int tot_turn=0,tot_wait=0;
for(int i=1;i<=n;i++)
    {
    tot_turn+=op[i].tat;
    tot_wait+=op[i].wt;
    }
float avg_turn=(float)tot_turn/n;
float avg_wait=(float)tot_wait/n;
for(int m=1;m<=n;m++)
    {
    System.out.println("\nprocess "+op[m].process);
    System.out.print("turn around time : "+op[m].tat);
    System.out.print("     waiting time : "+op[m].wt);
    }
System.out.println("\ntotal turn around time : "+tot_turn);
System.out.println("total waiting time : "+tot_wait);
System.out.println("avg turn around time : "+avg_turn);
System.out.println("avg waiting time : "+avg_wait);
}
}


OUTPUT:-
  OUTPUT  is remainig****
