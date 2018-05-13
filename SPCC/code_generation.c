INPUT

#include<stdio.h>
#include<ctype.h>
#include<string.h>
main()
{
char a[20];
int i=2,n;
printf("Exp  :");
scanf("%s", a);
if(isdigit(a[0]))
printf("MVI A,%c\n",a[0]);
else printf("MOV A,%c\n",a[0]);
n=strlen(a);
while(i<n)
{
switch(a[i])
{
case '+':printf("ADD B\n");i+=3;break;
case '-':printf("SUB B\n");i+=3;break;
default:if(isdigit(a[i]))
printf("MVI B,%c\n",a[i]);
else
printf("MOV B,%c\n",a[i]);
i--;
}}}

OUTPUT

RISHIKESH@RISHIKESH:/mnt/c/Users/rishi/Desktop$ ./a.out
Exp  :a+d-b
MOV A,a
MOV B,d
ADD B
MOV B,b
SUB B
RISHIKESH@RISHIKESH:/mnt/c/Users/rishi/Desktop$ ^C
