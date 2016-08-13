import java.util.HashSet;
import java.util.Random;

public class Robot {
	private String mName;
	
	public Robot(){
		mName = Generator.getName();	
	}
	
	public String getName(){
		return mName;
	}
	
	public void reset(){
		String oldName = mName;
		mName = Generator.getName();
		Generator.removeName(oldName);
	}
	
	
	private static class Generator{
		private static final String[] letters = {"A", "B", "C", "D", "E", 
				"F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q",
				"R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
		private static HashSet<String> names = new HashSet<String>();
		
		/*
		 * Called by Robot when instantiated.
		 * Returns a name if that name is not in the hashset.
		 */
		public static final String getName(){
			String name = "";
			do{
				name = newName();
			} while(names.contains(name));
			names.add(name);
			return name;
		}
		
		public static final void removeName(String name){
			if(names.contains(name)){
				names.remove(name);
			}
		}
		
		private static final String newName(){
			Random random = new Random();
			StringBuilder sb = new StringBuilder();
			// add random letters
			for(int i = 0; i < 2; i++){
				sb.append(letters[random.nextInt(25)]);
			}
			// add random numbers
			for(int i = 0; i < 3; i++){
				sb.append(String.valueOf(random.nextInt(9)));
			}
			return sb.toString();
		}
		public static HashSet<String> getNames(){
			return names;
		}
	}
	
	/*
	 * Basic tests.
	 */
	public static void main(String[] args){
		//Create 10 robots, print names.
		System.out.println("Robot Names:");
		for(int i = 0; i < 10; i++){
			Robot r = new Robot();
			System.out.println(r.getName());
		}
		//Print names from HashSet containing all names.
		System.out.println("Generator Names:");
		HashSet<String> names = Generator.getNames();
		for(String name : names){
			System.out.println(name);
		}
	}
}
