package stringPractice;

public class punctuation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Razia do your own work donot lean here!!";
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '.' ||  str.charAt(i) == '?' || str.charAt(i) == '-' ||    
					str.charAt(i) == '\'' || str.charAt(i) == '\"' || str.charAt(i) == ':') {
				count++;
			}
		}
		System.out.println("The number of punctuations exists in the string is: " +count); 
	}

}
