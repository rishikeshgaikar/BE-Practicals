INPUT
%{include<stdio.h>
int k=0,i=0,o=0,d=0;
%}
letter [a-z][A-Z0-9a-z0-9]*
digit [0-9]+
op [+\-\*\/\%\^]
%%
int|float|do|char|else|while|for|if|switch {k=k+1;}
{letter} {i=i+1;}
{digit} {d=d+1;}
{op} {o=o+1;}
%%

main(void)
{
yyin= fopen("cde.txt","r");
yylex();
printf("Message.txt Contains %d Keywords,%d Identifiers and %d Operators.",k,i,o);
}
 
int yywrap()
{
return(1);
}

cde.txt
this is line 1
line 2 is here
+-%^*
if else


OUTPUT

RISHIKESH@RISHIKESH:/mnt/c/Users/rishi/Desktop$ flex ident.l
RISHIKESH@RISHIKESH:/mnt/c/Users/rishi/Desktop$ gcc lex.yy.c -ll
RISHIKESH@RISHIKESH:/mnt/c/Users/rishi/Desktop$ ./a.out
Message.txt Contains 2 Keywords,6 Identifiers and 5 Operators.
RISHIKESH@RISHIKESH:/mnt/c/Users/rishi/Desktop$
