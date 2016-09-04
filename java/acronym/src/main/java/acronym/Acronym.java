package acronym;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Acronym {
	public static String generate(String phrase){		
		StringBuilder sb = new StringBuilder();
		String[] strs = phrase.split(" ");
		for(String s : strs){
			sb.append(s.charAt(0));
			for(int i = 1; i < s.length(); i++){
				if(s.charAt(i) == '-'){
					sb.append(s.charAt(i + 1));
				} if(Character.isUpperCase(s.charAt(i))){
					sb.append(s.charAt(i));
				}
			}
		}
		return sb.toString().toUpperCase();
	}
}
