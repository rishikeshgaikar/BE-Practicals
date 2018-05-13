import java.io.*;

class Philosopher

{

public static void main(String args[])throws IOException

{

Philo d=new Philo();

for(int i=0;i<5;i++)

d.pickup(i);

for(int i=0;i<5;i++)

d.putdown(i);

}

}

class Philo

{

int state[]=new int[5];

int thinking,eating,hungry;

void Op()

{

thinking=0;

eating=1;

hungry=2;

}

public void pickup(int i)

{

state[i]=2;

System.out.println("Philosopher "+i+" is hungry");

test(i);

if(state[i]==2)

System.out.println("Philosopher "+i+" is waiting");

}

public void putdown(int i)

{

if(state[i]==1)

{

state[i]=0;

System.out.println("Philosopher"+i+" is thinking");

test((i+1)%5);

test((i+5)%5);

}

}

public void test(int i)

{

if(state[i]==2 && state[(i+1)%5]!=1 && state[(i+4)%5]!=1)

{

state[i]=1;

System.out.println("philosopher "+i+" is eating");

} }}
