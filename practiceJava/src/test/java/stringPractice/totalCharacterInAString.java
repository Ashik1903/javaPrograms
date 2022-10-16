package stringPractice;

public class totalCharacterInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Razia do your own work donot lean here";
		int count=0;
		for(int i = 0; i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				count++;
			}
		}
		
		System.out.println("Total number of characters without whitespace : " +count);
		System.out.println("original string length : "+str.length());
	}

}
