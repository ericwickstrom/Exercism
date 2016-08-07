package pangram;

import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;

public class Pangrams {

	public static final boolean isPangram(String s){
		if(s.isEmpty()){
			return false;
		}
		// put letters in set
		String letters = "abcdefghijklmnopqrstuvwxyz";
		char[] array = letters.toCharArray();
		HashSet<String> set = new HashSet<String>();
		for(char ch : array){
			set.add(String.valueOf(ch));
		}
		
		array = s.toLowerCase().toCharArray();
		for(char ch : array){
			set.remove(String.valueOf(ch));
			if(set.size() == 0){
				return true;
			}
		}
		
		return false;
		
	}
}
