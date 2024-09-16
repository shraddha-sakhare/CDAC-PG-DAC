package Ass_6_sir;

/*
 * Write a program to find the intersection of two single-dimensional arrays. 
 * */
 

public class Intersect {

	public static void main(String[] args) {
		 int[] arr1 = {16, 17, 18, 19};
	        int[] arr2 = {15, 16, 17, 18};

	        int[] intersect = new int[Math.min(arr1.length, arr2.length)];
	        int count = 0;
	        for (int i = 0; i < arr1.length; i++) {
	            for (int j = 0; j < arr2.length; j++) {
	                if (arr1[i] == arr2[j]) {
	                    intersect[count++] = arr1[i];
	                    break;
	                }
	            }
	        }

	        System.out.println("Intersection elements of 2 array's is  :");
	        for (int i = 0; i < count; i++) {
	            System.out.print(intersect[i] + " ");
	        }
	}

}

