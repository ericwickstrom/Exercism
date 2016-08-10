import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Anagram {
	private String angram;
	private HashMap<String, Integer> map;
	
	public Anagram(String s){
		map = getMap(s);
		angram = s.toLowerCase();
	}
	
	public List<String> match(List<String> words){
		ArrayList<String> list = new ArrayList<String>();
		for(String word : words){
			if(!angram.equals(word.toLowerCase())){
				HashMap<String, Integer> wordMap = getMap(word);
				if(map.equals(wordMap)){
					list.add(word);
				}
			}
		}
		
		return list;
	}
	
	private HashMap<String, Integer> getMap(String s){
		HashMap<String, Integer> rMap = new HashMap<String, Integer>();
		char[] letters = s.toCharArray();
		for(char letter : letters){
			String l = String.valueOf(letter).toLowerCase();
			if(!rMap.containsKey(l)){
				rMap.put(l, 1);
			} else {
				int count = rMap.get(l);
				rMap.put(l, ++count);
			}
		}
		return rMap;
	}
}
