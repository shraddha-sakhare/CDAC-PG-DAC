
/*
 
3. Remove White Spaces from String 
Problem: Write a Java program to remove all white spaces from a given string. 
 
Test Cases: 
 
Input: "Hello World" 
Output: "HelloWorld" 
Input: "  Java   Programming  " 
Output: "JavaProgramming"
*/


import java.util.*;

public class RemoveWhiteSpaces{
	
	public static void main(String args[]){
		
 Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String resstr = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!Character.isWhitespace(c)) {
                resstr += c;
            }
        }
        System.out.println(resstr);
	}
}
