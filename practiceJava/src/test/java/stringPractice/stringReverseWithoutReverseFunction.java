package stringPractice;

import java.io.BufferedReader;

public class stringReverseWithoutReverseFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "wingardiumLeviosa";
		//String str = "Wingardium Leviosa And Chumantar Chu";
		
		//Using the Reverse Function
//		StringBuilder rev = new StringBuilder();
//		rev.append(str);
//		rev.reverse();
//		System.out.println(rev);
		
		
		//Without using reverse function
		String revStr = "";
		for(int i=str.length()-1;i>=0;i--) {
			revStr = revStr + str.charAt(i);
		}
		System.out.println(revStr);
	}

}
