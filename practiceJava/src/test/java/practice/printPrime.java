package practice;

public class printPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Printing Prime numbers between 0 to 100");
		System.out.print("2");
		int j=3, flag=0;
		while(j<100) {
			flag=0;
			for(int i=2;i<=j/2;i++) {
				if(j%i==0) {
					flag=1;
				}
			}
			if(flag==0) {
				System.out.print(","+j);
			}
			j++;
		}
	}

}
