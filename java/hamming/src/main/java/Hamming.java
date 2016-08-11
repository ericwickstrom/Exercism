import java.lang.Character;

public class Hamming {
	public static final int compute(String a, String b){
		if(a.length() == 0 || b.length() == 0 || a.length() != b.length() ){
			throw new IllegalArgumentException();
		}
		char[] aArray = a.toCharArray();
		char[] bArray = b.toCharArray();
		int total = 0;
		for(int i = 0; i < a.length(); i++){
			if(!Character.valueOf(aArray[i]).equals(Character.valueOf(bArray[i]))){
				total++;
			}
		}
		return total;
	}
}
