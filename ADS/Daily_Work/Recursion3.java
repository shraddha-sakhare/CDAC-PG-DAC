class Recursion4{


static int show(int n)//show(2)
{
if(n==4)
	return n;
else
		return 2*show(n+1);  //=2*show(3)
}


public static void main(String [] args){

System.out.println(show(2));

}
}


















/*
class Recursion3{


static int show(int n)//show(2)
{
if(n==4)
	return n;
else
		return 2*show(n+1);  //=2*show(3)
}


public static void main(String [] args){

System.out.println(show(2));

}
}
//output dry run 
 //show(2)
 //2*show(3)
 //2*2*show(4)



*/























/*
class Recursion2{
	
	static int i=0;
	
	 static void show()
	{
		++i;
	   if(i<=5) //termi
	   {
		System.out.println("hi Girls!!!");
		show(); 
	   }
	}
	
	
	public static void main(String [] args){
		
		show();
	
	}
}
*/