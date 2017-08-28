import java.util.Scanner;
public class CRC
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

//**********Main initialization**********//


/* n = data bits
   m = generator bits
   d array = dividend
   g array = divisor
*/
int m,n,g[],d[],z[],r[],msb,i,j,k;
System.out.print("Enter no. of data bits : ");
n=sc.nextInt();
System.out.print("Enter no. of generator bits : ");
m=sc.nextInt();
d=new int[n+m];
g=new int[m];
System.out.print("Enter data bits : ");
for(i=0;i<n;i++)
d[i]=sc.nextInt();
System.out.print("Enter generator bits : ");
for(j=0;j<m;j++)
g[j]=sc.nextInt();

//**********Division logic**********//
/*
appending no. of data bits and no. of generator bits to get r d[n+i] = 0
divisor = r[i]
z[i] = initialized as zero

*/

for(i=0;i<m-1;i++)
d[n+i]=0;
r=new int[m+n];
for(i=0;i<m;i++)
r[i]=d[i];
z=new int[m];
for(i=0;i<m;i++)
z[i]=0;


for(i=0;i<n;i++)
{
k=0;
msb=r[i];
for(j=i;j<m+i;j++)
{
if(msb==0)
r[j]=xor(r[j],z[k]);
else
r[j]=xor(r[j],g[k]);
k++;
}
r[m+i]=d[m+i];
}

//**********Printing the result**********//
System.out.print("The code bits added are : ");
for(i=n;i<n+m-1;i++)
{
d[i]=r[i];
System.out.print(d[i]);
}
System.out.print("\nThe code data is : ");
for(i=0;i<n+m-1;i++)
{
System.out.print(d[i]);
}
System.out.println("");
}

//**********Logic for EXOR**********//
public static int xor(int x,int y)
{
if(x==y)
return(0);
else
return(1);
}
}



//**OUTPUT
C:\Users\rishi\Desktop\cn101>javac CRC.java

C:\Users\rishi\Desktop\cn101>java CRC
Enter no. of data bits : 4
Enter no. of generator bits : 4
Enter data bits : 1 0 0 1
Enter generator bits : 1 0 1 1
The code bits added are : 110
The code data is : 1001110

C:\Users\rishi\Desktop\cn101>

**//
