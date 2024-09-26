
/*
class Recursion6 //tower of hanoi
{
static void toh(int n,char s,char inter, char d){
if(n == 1)//only one disk 
	System.out.println("Disk from " + s + "to" + d);
else
{
	toh(n-1,s,d,inter);//s-dest
	System.out.println("Disk from " + s + "to" + d);//a-dest
	toh(n-1,inter,s,d);
}
}


public static void main(String args[]){
  int n=3;

toh(n,'A','B','C');

}
 
}
*/




/*
class Recursion5//fobonacci series
{

static int fib(int n){
if(n<=1)
{
	return n ;
}
else 
{
	return fib(n-1)+fib(n-2);
}
}
public static void main(String [] args){
 int num=10;
for (int i=1;i<=num;i++){
System.out.print(fib(i)+" ");
}

}
}

// dry run 
//fib(3)=fib(2)+fib(1)
//fib(1)+fib(0)
//https://www.mathsisfun.com/games/towerofhanoi.html                       
*/