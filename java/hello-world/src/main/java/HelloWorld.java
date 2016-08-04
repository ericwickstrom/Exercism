public class HelloWorld {
	
	public static final String hello(){
		return "Hello, World!";
	}
	
	public static final String hello(String s){
		if(s == null){
			return "Hello, World!";
		} else if(s.isEmpty()){
			return "Hello, World!";
		} else {
			return "Hello, " + s + "!";
		}
		
	}
}
