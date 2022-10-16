package practice;

public class palindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "blulb";
		String revStr="";
		int n = str.length();
		for(int i=n-1;i>=0;i--) {
			revStr = revStr+str.charAt(i);
		}if(revStr.equalsIgnoreCase(str)) {
			System.out.println(str+" is palindrome");
		}else {
			System.out.println(str+" is not palindrome");
		}
	}

}
