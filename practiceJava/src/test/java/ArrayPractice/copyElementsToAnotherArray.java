package ArrayPractice;

public class copyElementsToAnotherArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {11,22,33,44,55};
		int[] arr2 = new int[arr1.length];
		
		System.out.print("arr2 is : ");
		for(int i=0;i<arr1.length;i++) {
			arr2[i] = arr1[i];
			System.out.print(arr2[i]+" | ");
		}

	}

}
