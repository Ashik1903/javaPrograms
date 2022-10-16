package searchingANDsorting;

import java.util.Arrays;

public class binarySearch {
	
	public static int BinarySearch(int[] arr, int first, int last, int key) {
		Arrays.sort(arr);
		int mid = (first+last)/2;
		while(first<=last) {
			if(arr[mid] < key) {
				first = mid+1;
			}else if(arr[mid] == key) {
				return mid;
			}else {
				last = mid-1;
			}
			mid = (first+last)/2;
		}
		
		if(first>last) {
			return -1;
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {99,88,77,66,55,44,33,22,11};
		int key = 77;
		int last = arr.length-1;
		
		int i = BinarySearch(arr,0,last,key);
		
		if(i == -1) {
			System.out.println("Element Not Found");
		}else {
			System.out.println("Element found");
		}

	}

}
