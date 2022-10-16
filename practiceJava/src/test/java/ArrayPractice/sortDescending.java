package ArrayPractice;

public class sortDescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {11,22,33,44,55};
		
		int i,j,n=arr.length,temp;
		
		for(i=0;i<n;i++) {
			for(j=i+1;j<n;j++) {
				if(arr[i]<arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int k : arr) {
			System.out.print(k+" | ");
		}
	}

}
