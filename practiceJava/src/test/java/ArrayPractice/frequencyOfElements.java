package ArrayPractice;

import java.util.HashMap;

public class frequencyOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
		int[] arr = {1,2,2,3,4,3,5,3,4,5,4,4,5,5,5};
		int count;
		//frequency of elements
		for(int i=0;i<arr.length-1;i++) {
			count=1;
			for(int j=i+1;j<=arr.length-1;j++) {
				
				if(arr[i] == arr[j]) {
					count++;
					arr[j] = -1;
				}
				
			}
			if(arr[i]!=-1) {
			m.put(arr[i], count);
			}
		}
		
		System.out.println(m);
	}

}
