package ArrayPractice;

public class nTimsRightRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		int n = 3;
		for(int i=0;i<n;i++) {
			int j, last = arr[arr.length-1];
			for(j=arr.length-1 ; j>0;j--) {
				arr[j] = arr[j-1];
			}
			arr[j] = last;
		}
		
		for(int k : arr) {
			System.out.print(k+" | ");
		}
	}

}
