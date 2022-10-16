package ArrayPractice;

import java.util.Arrays;

public class thirdLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {11, 2, 7, 75, 3};
		
		//method 1
//		Arrays.sort(arr);
//		System.out.println(arr[arr.length-3]);
		
		//method 2 -- without sorting the array
		int max1 = arr[0];
		int max2 = arr[1];
		int max3 = arr[2];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=max1) {
				max1 = arr[i];
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i] >= max2 && arr[i]<max1) {
				max2 = arr[i];
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] >= max3 && (arr[i]<max1 && arr[i]<max2)) {
				max3 = arr[i];
			}
		}
		System.out.println(max1+","+max2+","+max3);
	}

}
