import java.util.*;
import java.lang.*;
class log2phy
{
   public static void main(String args[])
   {
      int off[]=new int[20];
      int la[]=new int[20];
      int p[]=new int[10];
      int of,m=16,fn,i,j=0,l;
      long s=0;
      double d=0;
      Scanner scr=new Scanner(System.in);
      System.out.println("Enter 16-bit logic Address :");
      for(i=0;i<m;i++)
      {
      la[i]=scr.nextInt();
      }
      System.out.println("Logical Address :");
      for(i=0;i<m;i++)
      {
       System.out.print(la[i]);
      }
      System.out.print("\n\nEnter Number of Bits in Page :");
      int n=scr.nextInt();
      of=m-n;
      System.out.print("Offset :"+of);
      int pt[]=new int[10];
      pt[0]=5;
      pt[1]=9;
      pt[2]=3;
      pt[3]=2;
      pt[4]=6;
      pt[5]=1;
     System.out.print("\n\nPage Number :");
      for(i=0;i<n;i++)
      {
          p[i]=la[i];
          System.out.print(p[i]);
      }
      System.out.print("\n\nOffset Number :");
      for(i=n;i<m;i++)
      {
          off[j]=la[i];
          System.out.print(off[j]);
          j++;
      }
      j=0;
      for(i=n-1;i>=0;i--)
      {
          if(p[i]==1)
          
             d=d+Math.pow(2,j);
             j++;
          
      }
      l=(int)d;
      fn=pt[l];
      System.out.print("\n\nFrame Number :"+fn);
      int rem, k=1, binary=0;
      while (fn!=0)
      {
        rem=fn%2;
        fn/=2;
        binary+=rem*k;
        k*=10;
      }
      System.out.print("\n\nPhysical Address :\n"+binary);
      for(i=0;i<of;i++)
      {
         System.out.print(off[i]);
      }
      System.out.println();
      }
}


Output:
Enter 16-bit logic Address :
0 1 0 1 0 1 1 1 0 1 0 0 0 1 0 0
Logical Address :
0101011101000100


Enter Number of Bits in Page :4
Offset :12
Page Number :0101
Offset Number :011101000100
Frame Number :1


Physical Address :
1011101000100
