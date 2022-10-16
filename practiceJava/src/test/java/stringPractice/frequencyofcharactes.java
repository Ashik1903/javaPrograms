package stringPractice;


import java.util.HashMap;

public class frequencyofcharactes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "MISSISSIPPI";
		char[] st = str.toCharArray();

		HashMap<Character, Integer> freq = new HashMap<Character, Integer>();

		int count;
		for(int i=0;i<st.length;i++) {
			count=1;
			for(int j=i+1;j<st.length;j++) {
				if(st[i] == '0') {
					break;
				}else if(st[i] == st[j]) {
					count++;
					st[j] = '0';
				}
			}
			if(st[i]!='0') {
			freq.put(st[i], count);
			}
		}
		
		System.out.println(freq);
	}

}
