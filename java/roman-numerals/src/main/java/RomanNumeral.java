
public class RomanNumeral {

	private String romanNumeral;
	private final int M = 1000;
	private final int CM = 900;
	private final int D = 500;
	private final int CD = 400;
	private final int C = 100;
	private final int XC = 90;
	private final int L = 50;
	private final int XL = 40;
	private final int X = 10;
	private final int IX = 9;
	private final int V = 5;
	private final int IV = 4;
	private final int I = 1;
	
	private String getNumeral(int i, StringBuilder sb){
		if(i >= M){
			return getNumeral(i - 1000, sb.append("M"));
		} else if (i < M && i >= CM){
			return getNumeral(i - 900, sb.append("CM"));
		} else if(i < CM && i >= D){
			return getNumeral(i - 500, sb.append("D"));
		} else if(i < D && i >= CD){
			return getNumeral(i - 400, sb.append("CD"));
		} else if(i < CD && i >= C){
			return getNumeral(i - 100, sb.append("C"));
		} else if(i < C && i >= XC){
			return getNumeral(i - 90, sb.append("XC"));
		} else if(i < XC && i >= L){
			return getNumeral(i - 50, sb.append("L"));
		} else if (i < L && i >= XL){
			return getNumeral(i - 40, sb.append("XL"));
		} else if (i < XL && i >= X){
			return getNumeral(i - 10, sb.append("X"));
		} else if (i < X && i >= IX){
			return getNumeral(i - 9, sb.append("IX"));
		} else if (i < IX && i >= V){
			return getNumeral(i - 5, sb.append("V"));
		} else if (i < V && i >= IV){
			return getNumeral(i - 4, sb.append("IV"));
		} else if (i < IV && i >= I){
			return getNumeral(i - 1, sb.append("I"));
		} else {
			return sb.toString();
		}
	}
	
	public RomanNumeral(int n){
		if(n > 0){
			romanNumeral = getNumeral(n, new StringBuilder());
		} else {
			romanNumeral = "";
		}
	}
	
	public String getRomanNumeral(){
		return romanNumeral;
	}
	
}
