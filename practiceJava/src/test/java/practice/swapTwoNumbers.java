package practice;

public class swapTwoNumbers {
	
	public static void swap2numbers(int a, int b) {
		System.out.println("Before swapping : "+a+" "+b);
		a = a+b;
		b = a-b;
		a = a - b;
		
		System.out.println("After swapping : "+a+" "+b);
	}
	
	public static void swap2strings(String a, String b) {
		System.out.println("Before swapping : "+a+" "+b);
		a = a+b;
		b = a.substring(0, (a.length()-b.length()));
		a = a.substring((a.length()-b.length())-1, a.length());
		System.out.println("After swapping : "+a+" "+b);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swap2numbers(2,3);
		swap2strings("Ashik", "Rahman");
	}

}
