package practice;

public class reverseAstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = " This is zugad ";
		String revStr = "";
		int n = str.length();
		System.out.println("Before Reversing the string : "+str);
		
		//logic to reverse string
//		for(int i=n-1;i>=0;i--) {
//			revStr = revStr + str.charAt(i);
//		}
		
		//remove white spaces from leading and trailing end
		System.out.println(str);
		str = str.strip();
		System.out.println(str);
		
		//login to reverse statement
		String[] str1 = str.split(" ");
		for(String s : str1) {
			for(int i=s.length()-1;i>=0;i--) {
				revStr = revStr + s.charAt(i);
			}
			revStr += " ";
		}
		
		System.out.println("After reversing the string : "+revStr);
	}

}
