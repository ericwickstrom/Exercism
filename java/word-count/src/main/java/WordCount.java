import java.util.HashMap;

public class WordCount {
	public static final HashMap<String, Integer> phrase(String input){
		String[] array = input.toLowerCase().split("[^a-z0-9]+");
		HashMap <String, Integer> map = new HashMap<String, Integer>();
		for(String word : array){
			if(!map.containsKey(word)){
				map.put(word, 1);
			} else {
				int total = map.get(word);
				map.put(word, ++total);
			}
		}
		return map;
	}
}
