package ArrayPractice;

//import java.util.Arrays;

public class sortAscending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {55,44,33,22,11};
		
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		//Arrays.sort(arr);
		
		for(int k : arr) {
			System.out.print(k+" | ");
		}

	}

}
