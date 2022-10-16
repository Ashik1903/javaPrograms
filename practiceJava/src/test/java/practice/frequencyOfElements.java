package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class frequencyOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,2,3,4,3,4,5,4,5,4,5,5,5};
		HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
		
		int count=0;
		List<Integer> li = new ArrayList<Integer>();
		
		for(int j : arr) {
			li.add(j);
		}
		
		Set<Integer> set = new LinkedHashSet<Integer>();
		set.addAll(li);
		li.clear();
		li.addAll(set);
		int k=0;
		while(k<li.size()) {
			count=0;
		for(int i=0;i<arr.length;i++) {
			if(li.get(k) == arr[i]) {
				count++;
			}
		}
		map.put(li.get(k), count);
		k++;
		}
		
		System.out.println(map);

	}

}
