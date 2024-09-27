/*
9. Integer Palindrome 
Problem: Write a Java program to check if a given integer is a 
palindrome. 
Test Cases: 
Input: 121 
Output: true 
Input: -121 
Output: false 

*/
import java.util.*;

public class PalindromeNumber
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String num = sc.nextLine();

        boolean isPalindrome = true;
        int left = 0;
        int right = num.length() - 1;

        while (left < right) {
            if (num.charAt(left) != num.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
    }
}