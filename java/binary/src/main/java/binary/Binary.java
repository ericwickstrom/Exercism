package binary;

public class Binary {
	private int mDecimal;
	
	public Binary(String binary){
		this.mDecimal = convertBinaryToDecimal(binary);
	}
	
	public int getDecimal(){
		return this.mDecimal;
	}
	
	private int convertBinaryToDecimal(String binary){
		// power for conversion, starts at 0, final
		// value is array length
		int x = 0;
		// return value
		int decimal = 0;
		String[] letters = binary.split("");
		try {
			for(int i = letters.length-1; i >= 0; i--){
				int c = Integer.valueOf(letters[i]);
				if(!(c == 0 || c == 1)) return 0;
				// return 0 if string has any characters other than 0 or 1.
					decimal += c * Math.pow(2, x);
					x++;				
			}
		} catch(NumberFormatException e){
			return 0;
		}
			
		return decimal;
	}
}
