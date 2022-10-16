package ArrayPractice;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class removeDuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,2,3,4,3,5,3,4,5,4,4,5,5,5};
		
		List<Integer> list = new ArrayList<Integer>();
		for(int i: arr) {
			list.add(i);
		}
		
		Set<Integer> set = new LinkedHashSet<Integer>();
		set.addAll(list);
		list.clear();
		list.addAll(set);
		
		int[] sortedArraywithoutduplicates = new int[list.size()];
		
		for(int i=0;i<list.size();i++) {
			sortedArraywithoutduplicates[i] = list.get(i);
		}
		
		for(int i: sortedArraywithoutduplicates) {
			System.out.print(i+" | ");
		}
	}

}
