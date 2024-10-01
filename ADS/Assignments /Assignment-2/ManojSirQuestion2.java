

public class ManojSirQuestion2 {
    public static void main(String[] args) {
		
		String arr[]= {"11","11","23","44","55"};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			int a=Integer.parseInt(arr[i]);
			sum+=a;
		}
   System.out.println("Sum : "+sum);
    }
}