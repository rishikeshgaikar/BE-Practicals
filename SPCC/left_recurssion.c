INPUT

 #include<stdio.h>  
 #include<string.h>  
  #define SIZE 10  
  int main () {  
   	char non_terminal;  
  	char beta,alpha,g;
  	int num;  
   	char production[10][SIZE];  
  	int index=3; /* starting of the string following "->" */  
   	printf("Enter Number of Production : ");  
   	scanf("%d",&num);  
   	printf("Enter the grammar as E->E-A :\n");  
   	for(int i=0;i<num;i++){  
        	scanf("%s",production[i]);  
   	}  
//Direct Rec
for(int i=0;i<num;i++){  
      	printf("\nGRAMMAR : : : %s",production[i]);  
        	non_terminal=production[i][0];  
        	if(non_terminal==production[i][index]) {  
             	alpha=production[i][index+1];
   		 g= production[i][index+2];
             	printf(" is left recursive.\n");  
             	while(production[i][index]!=0 && production[i][index]!='|')  
                 	index++;  
             	if(production[i][index]!=0) {  
                	beta=production[i][index+1];  
                  	printf("Grammar without left recursion:\n");  
                  	printf("%c->%c%c\'",non_terminal,beta,non_terminal);  
                  	printf("\n%c\'->%c%c%c\'|&\n",non_terminal,alpha,g,non_terminal);  
             	}  
             	else  
                  	printf(" can't be reduced\n");  
        	}  
        	else  
             	printf(" is not left recursive.\n");  
        	index=3;  
   	}  
  }  

OUTPUT

RISHIKESH@RISHIKESH:/mnt/c/Users/rishi/Desktop$ gcc leftrec.c -std=c99
RISHIKESH@RISHIKESH:/mnt/c/Users/rishi/Desktop$ ./a.out
Enter Number of Production : 1
Enter the grammar as E->E-A :
E->E+T|T

GRAMMAR : : : E->E+T|T is left recursive.
Grammar without left recursion:
E->TE'
E'->+TE'|&
RISHIKESH@RISHIKESH:/mnt/c/Users/rishi/Desktop$
