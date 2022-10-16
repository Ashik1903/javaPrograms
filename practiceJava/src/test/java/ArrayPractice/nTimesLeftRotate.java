package ArrayPractice;

public class nTimesLeftRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		int n=2;
		
		for(int i=0;i<n;i++) {
			int j,first = arr[0];
			for(j=0;j<arr.length-1;j++) {
				arr[j] = arr[j+1];
			}
			
			arr[j] = first;
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" | ");
		}
	}

}
