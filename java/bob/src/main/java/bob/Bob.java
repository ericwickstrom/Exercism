package bob;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bob {
	// constants
	private static final String REGEX = "[A-Za-z]";
	private static final String REGEX_WHITESPACE = "\\s+";
	
	//return strings
	private static final String QUESTION_STRING = "Sure.";
	private static final String EXCLAMATION_STRING = "Whoa, chill out!";
	private static final String EMPTY_STRING = "Fine. Be that way!";
	private static final String WHATEVER_STRING = "Whatever.";
	
	// cases for switch statement
	private static final String QUESTION = "?";
	
	public Bob(){}
	
	public String hey(String phrase){
		
		char[] array = phrase.toCharArray();
		boolean allCaps = true;
		boolean noLetters = true;
		String last = "";
		if(array.length > 0){
			last = String.valueOf(array[array.length-1]);
		}
		Pattern ws = Pattern.compile(REGEX_WHITESPACE);
		Pattern pattern = Pattern.compile(REGEX);
		Matcher matcher;
		for(char c : array){
			String letter = String.valueOf(c);
			matcher = pattern.matcher(letter);
			if(matcher.matches()){
				noLetters = false;
				if(letter.equals(letter.toLowerCase())){
					allCaps = false;
				}
			}
		}
		matcher = ws.matcher(phrase);
		if(phrase.equals("") || matcher.matches()){
			return EMPTY_STRING;
		} else if(allCaps && !noLetters){
			return EXCLAMATION_STRING;
		} else if(last.equals(QUESTION)) {
			return QUESTION_STRING;
		} 
		return WHATEVER_STRING;
		
	}
}
