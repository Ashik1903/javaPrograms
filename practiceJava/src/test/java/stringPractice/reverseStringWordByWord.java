package stringPractice;

public class reverseStringWordByWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Wingardium Leviosa And Chumantar Chu";
		String[] str1 = str.split(" ");
		int i=0;
		for(String s1 : str1) {
					StringBuilder rev = new StringBuilder();
					rev.append(s1);
					rev.reverse();
					System.out.print(rev+" ");
		}
		
//		String revStr = "";
//		for(int i=str.length()-1;i>=0;i--) {
//			revStr = revStr + str.charAt(i);
//		}
//		System.out.println(revStr);
	}

}
