package ArrayPractice;

public class printingElementsinReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6};
		int temp, j=arr.length-1;
		for(int i=0;i<arr.length/2;i++) {
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			j--;
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
