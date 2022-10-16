package practice;

public class fibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		
		int first = 0;
		int second = 1;
		int third = first+second;
		System.out.print(first+","+second+","+third);
		for(int i=0;i<n;i++) {
			first = second;
			second = third;
			third = first+second;
			System.out.print(","+third);
		}
	}

}
