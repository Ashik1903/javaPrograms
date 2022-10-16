package searchingANDsorting;

public class LinearSearch {
	
	public static int linearSearch(int[] arr, int n) {
		int Flag=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == n) {
				Flag=1;
				return i;
			}
		}
		if(Flag == 0) {
			return -1;
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {11,22,33,44,55,66,77,88,99};
		int n = 77;
		
		int i = linearSearch(arr,n);
		
		if(i == -1) {
			System.out.println("Element Not Found");
		}else {
			System.out.println("Element found at index "+(i+1));
		}
	}

}
