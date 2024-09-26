class Recursion3{
	
	
	 static void show(int n)
	{
		if(n==4)
			return n;
		else
				return 2*show(n+1);
	}
	
	
	public static void main(String [] args){
		
		show();
	
	}
}




























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