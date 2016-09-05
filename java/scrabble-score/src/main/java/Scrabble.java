import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Scrabble {
	private String str;
	
	/*
	 * Letter                           Value
	 * A, E, I, O, U, L, N, R, S, T       1
	 * D, G                               2
	 * B, C, M, P                         3
	 * F, H, V, W, Y                      4
	 * K                                  5
	 * J, X                               8
	 * Q, Z                               10		
	 */
	private int[] points = 
		{ 1, 3, 3, 2, 1, 4, 2, 4, 1, 8,
		  5, 1, 3, 1, 1, 3, 10, 1, 1, 1,
		  1, 4, 4, 8, 4, 10};
			
	
	
	public Scrabble(String str){
		this.str = str;
	}
	
	/*
	 * If null or not a series of letters, return 0.
	 * Else computer score by getting value from points array.
	 */
	public int getScore(){
		if(str == null) return 0;
		Pattern p = Pattern.compile("[A-Za-z]+");
		Matcher m = p.matcher(str);
		if(!m.matches()) return 0;
		int score = 0;
		for(int i = 0; i < this.str.length(); i++){
			score += points[Character.getNumericValue(str.charAt(i)) - 10];
		}
		return score;
	}
}
