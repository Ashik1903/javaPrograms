package stringPractice;

public class palindromeCheck {
	
	public static void main(String[] args) {
		String str = "BLULB";
		int Flag=0;
		for(int i=0;i<str.length();i++) {
			if(!(str.charAt(i) == str.charAt(str.length()-1-i))) {
				Flag=1;
			}
		}
		
		if(Flag == 0) {
			System.out.println("Given string is palindrome");
		}else {
			System.out.println("Given string is not palindrome");
		}
	}

}
