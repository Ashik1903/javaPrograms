package stringPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class duplicateCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "BLULBLLBB";
		char string[] = str.toCharArray();    
		int n = string.length;
		
		for(int i=0;i<n;i++) {
			int count = 1;
			for(int j=i+1;j<n;j++) {
				if(string[i] == string[j] && string[i]!=' ') {
					count++;
					string[j] = '0';
				}
			}
			if(count > 1 && string[i] != '0')    
                System.out.println(string[i]);    
        }
	}
}
