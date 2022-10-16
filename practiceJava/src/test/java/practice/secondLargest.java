package practice;

public class secondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {25, 11, 7, 75, 56};
		
		int highest = Integer.MIN_VALUE;
		int secondhighest = Integer.MIN_VALUE;
		//System.out.println(highest+","+secondhighest);
		
		for(int i : arr) {
			if(i > highest) {
				secondhighest = highest;
				highest = i;
			}else if(i > secondhighest) {
				secondhighest = i;
			}
		}
		System.out.println(secondhighest);
	}

}
