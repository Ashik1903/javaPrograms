package practice;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class removeduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,1,2,2,3,3,4,5,4,5,6,6,7,7,8,8,9,9};
		List<Integer> list = new ArrayList<Integer>();
		for(int i : arr) {
			list.add(i);
		}
		
		Set<Integer> set = new LinkedHashSet<Integer>();
		set.addAll(list);
		
		//option 1
		System.out.println("Print the set as it is : ");
		System.out.println(set);
		
		//option 2
		list.clear();
		list.addAll(set);
		System.out.println("Print the list after removing duplicate from set DS : ");
		System.out.println(list);
		
		//option 3
		int[] sortedarr = new int[list.size()];
		
		for(int i=0;i<list.size();i++) {
			sortedarr[i] = list.get(i);
		}
		System.out.println("Printing the sorted list in an array : ");
		System.out.print("{");
		for(int j : sortedarr) {
			System.out.print(j+",");
		}
		System.out.print("}");

	}

}
