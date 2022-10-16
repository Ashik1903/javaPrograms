package practice;

public class checkVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "BcDfG";
		
		if(str.toLowerCase().matches(".*[aeiou].*")) {
			System.out.println("Vowel is present in string");
		}else {
			System.out.println("Vowel is not present in string");
		}
	}

}
