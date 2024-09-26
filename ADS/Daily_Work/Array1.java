

class Array1{ 
 static int insert(int arr[],int size,int key ,int capacity)
{
	if(size > capacity)
	{
		System.out.println("array is full");
         return size;	
	}
	arr[size]=key;//new element
	return size+1;
}
static int search(int arr[],int size,int key ,int capacity)
{
	
	for(int i=0;i<size;i++){
	if(arr[i]==key)
	{
	 return i;//returning index
	}
	
	}
	return -1;//element not found
	
	
	static
	
	
	
}


public static void main(String args[]){
 int a[]=new int[100];// capacity
 int size=10;
 
 a[0]=11;
  a[1]=13;
  a[2]=15;
  a[3]=51;
  a[4]=71;
  a[5]=56;
  a[6]=48;
  a[7]=8;
  a[8]=99;
  a[9]=110;
  
  for (int i=0;i<size;i++){
	  System.out.println(a[i]+ " ");
  }
  
  int key=48;
  int pos=search(a,size,key);
  if(pos!=-1)
	  System.out.println("found");
  else 
	  System.out.println("not found");
  
  int key=111;
size=  insert(a,size,key,100);
    //display the element
  for (int i=0;i<size;i++){
	  System.out.println(a[i]+ " ");
  }
  
  
  /*
  // search 
  int key=48;
  for (int j=0;j;size;j++)
  {
  if(a[j]==key)
  break;
  }
  if(a[j]==size)
	  System.out.println("not found");
else 
 System.out.println(" found");
*/


}
}





















/*

class Array1{ 


public static void main(String args[]){
 int a[]=new int[100];
 int size=10;
 
 a[0]=11;
  a[1]=13;
  a[2]=15;
  a[3]=51;
  a[4]=71;
  a[5]=56;
  a[6]=48;
  a[7]=8;
  a[8]=99;
  a[9]=110;
  
  for (int i=0;i<size;i++){
	  System.out.println(a[i]+ " ");
  }
  
  
 
}
 
}


*/
































//finite loop permutation prg abc

class Recursion7{ 
static void display(String str, String res){

	if (str.length() == 0)
    {
	System.out.println(res + "");
	return;
    }
	for(int i=0 ;i< str.length(); i++){
	char ch=str.charAt(i);//1abc->A
	String ros=str.substring(0,i)+str.substring(i+1);
	display(ros,res+ch);
	
	}
}
public static void main(String args[]){
 String s="ABC";
 display(s,"");

}
 
}























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