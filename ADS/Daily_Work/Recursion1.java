//Infinite loop
class Recursion1{
	 static void show()//recursion method
	{
		System.out.println("hi Girls!!!");
		show(); //recursive call
	}
	
	
	public static void main(String [] args){
		
		show();//call for method
	
	}
}