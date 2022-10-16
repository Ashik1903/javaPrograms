package stringPractice;

import java.util.LinkedHashSet;
import java.util.Set;

public class subsetOfaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "APPLE", blnkStr="";
		int len = str.length();
		Set<String> set = new LinkedHashSet<String>(); 
		for(int i=0;i<len;i++) {
			for(int j=i;j<len;j++) {
				blnkStr = str.substring(i,j+1);
				set.add(blnkStr);
			}
		}
		System.out.println(set);
		
	}

}
