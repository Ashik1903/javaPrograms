package practice;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.println(factorialOf(n));
	}
	
	public static int factorialOf(int x) {
		if(x==1)
			return 1;
		else
			return x*factorialOf(x-1);
	}

}
