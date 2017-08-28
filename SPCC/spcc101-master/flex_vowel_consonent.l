INPUT

%{
int v=0;
int c=0;
%}

%%
[aeiouAEIOU] {v++;} 
[a-zA-Z] {c++;} 
%% 

main() 
{ 
printf("Enter the string of vowels and consonents:\n"); 
yylex(); 
printf("The number of vowels are:  %d\n",v); 
printf("The number of consonants are:  %d\n",c);
return 0; 
} 

OUTPUT

Enter the string of vowels and consonents 
My name is Khan
The number of vowels are: 4
The number of consonants are: 8
