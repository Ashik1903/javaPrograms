package stringPractice;

public class swapTwoStringVAriables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Good";
		String str2 = "Morning";
		
		System.out.println("Before Swaping the strings : "+str1+" "+str2);
		
		str1 = str1+str2;
		str2 = str1.substring(0, (str1.length()-str2.length()));
		str1 = str1.substring(str2.length(),str1.length());
		
		System.out.println("After Swaping the strings : "+str1+" "+str2);
	}

}
