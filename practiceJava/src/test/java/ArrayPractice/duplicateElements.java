package ArrayPractice;

public class duplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 2, 3, 4, 2, 7, 8, 8, 3};
		System.out.println("Duplicate Elemets : ");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}

	}

}