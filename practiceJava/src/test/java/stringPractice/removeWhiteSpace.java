package stringPractice;

public class removeWhiteSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Razia do your own work donot lean here!!";
		String newStr = "";
		for(int i=0;i<str.length();i++) {
			if(!(str.charAt(i) == ' ')) {
				newStr = newStr+str.charAt(i);
			}
		}
		
		System.out.println("Actual str : "+str);
		System.out.println("After removing whitespaces : "+newStr);
	}

}
