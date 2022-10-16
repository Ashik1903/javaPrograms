package stringPractice;

public class countVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Razia do your own work donot lean here!!";
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == 'A' || str.charAt(i) == 'a' || str.charAt(i) == 'E' || str.charAt(i) == 'e' ||  str.charAt(i) == 'I' || str.charAt(i) == 'i' ||    
					str.charAt(i) == 'O' || str.charAt(i) == 'o' || str.charAt(i) == 'U'|| str.charAt(i) == 'u') {
				count++;
			}
		}
		System.out.println("The number of punctuations exists in the string is: " +count); 
	}

}
