package pattern;

/*
 *	 	  1
 *		 1  1
 * 		1  2  1
 * 	   1  3  3  1
 * 	  1  4  6  4  1
 * 	 1  5 10 10	5	1
 */

public class pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		for(int i=0;i<n+1;i++) {
			for(int j=n;j>i;j--) {
				
				System.out.print(" ");
			}
			for(int k=1;k<=(2*i-1);k++) {
				System.out.print(k);
			}
			System.out.println();
		}
	}

}
