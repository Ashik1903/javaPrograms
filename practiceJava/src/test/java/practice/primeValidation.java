package practice;

public class primeValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		primeValidation obj = new primeValidation();
		if(obj.isprime(23)) {
			System.out.println("Number is prime");
		}else {
			System.out.println("Number is not prime");
		}
	}
	
	public boolean isprime(int n) {
		if(n==0||n==1) {
			return false;
		}else if(n==2) {
			return true;
		}else {
			for(int i=2;i<n/2;i++) {
				if(n%i==0) {
					return false;
				}
			}
			return true;
		}
	}

}
