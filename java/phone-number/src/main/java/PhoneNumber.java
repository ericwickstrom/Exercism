import java.util.Formatter;
import java.util.Locale;

public class PhoneNumber {
	private String phoneNumber;
	private String INVALID = "0000000000";
	
	public PhoneNumber(String s){
		phoneNumber = s.replaceAll("\\D", "");
		if(phoneNumber.length() == 11 && phoneNumber.charAt(0) == '1'){
			phoneNumber = phoneNumber.substring(1);
		} else if(phoneNumber.length() != 10){
			phoneNumber = INVALID;
		}
		
	}
	
	public String getNumber(){
		return phoneNumber;
	}
	
	public String pretty(){
		StringBuilder sb = new StringBuilder();
		Formatter formatter = new Formatter(sb, Locale.US);
		formatter.format("(%s) %s-%s", phoneNumber.substring(0, 3),
				phoneNumber.substring(3, 6), phoneNumber.substring(6));
		String rStr = formatter.toString();
		formatter.close();
		return rStr;
	}
	
	public String getAreaCode(){
		return phoneNumber.substring(0, 3);
	}

}
