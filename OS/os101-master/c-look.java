import java.util.*;
class clook
{
public static void main(String A[])
{
int max=20,cymax=199,temp;
int i,j,req,ttl_tracks=0,cp,np,cposn,nposn;
int cyposn[]=new int[20];
Scanner sc=new Scanner(System.in);
 do
 {
  System.out.print("\n Enter the number of requests : ");
   req=sc.nextInt();
 }while(req>max || req <=0);


 do
 {
  System.out.print("\n Enter the current header position : ");
   cposn=sc.nextInt();
 }while(cposn>cymax || cposn <=0);
 System.out.print("\n Enter the "+req +" I/O Requests : ");
 cyposn[0] = cposn;
 for(i=1;i<=req;i++)
   cyposn[i]=sc.nextInt();
for(i=0;i<=req;i++)
 {
  for(j=0;j<req-i;j++)
  {
   if(cyposn[j] > cyposn[j+1])
   {
    temp = cyposn[j];
    cyposn[j] = cyposn[j+1];
    cyposn[j+1] = temp;
   }
  }
 }
 cp=0;
 do
 {
  if(cyposn[cp] == cposn)
   break;
  cp++;
 }while(cp!=req);
i=0;j=cp;
 cposn = cyposn[cp];
 do
 {
  if(cp == req)
  { nposn = cyposn[0]; cp = 0; }
 












 else
   nposn = cyposn[++cp];
  ttl_tracks += (Math.abs(cposn-nposn));
  cposn = nposn == cyposn[req] ? cyposn[0] : nposn ;
 }while(nposn != cyposn[j-1]);
 System.out.printf(" Total Tracks Displaced : %d",ttl_tracks);
}


}




OUTPUT:


C:\Users\rishi\Desktop>javac clook.java


C:\Users\rishi\Desktop>java clook


 Enter the number of requests : 8


 Enter the current header position : 50


 Enter the 8 I/O Requests : 95
180
34
119
11
123
62
64
 Total Tracks Displaced : 153
C:\Users\rishi\Desktop>
