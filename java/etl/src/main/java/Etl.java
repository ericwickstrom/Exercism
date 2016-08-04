import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Etl {
   public Map<String, Integer> transform(Map<Integer, List<String>> old) {
	   Map<String, Integer> map = new HashMap<String, Integer>();
	   Set<Integer> keys = old.keySet();
	   for(int key : keys){
		   List<String> letters = old.get(key);
		   for(String letter : letters){
			   map.put(letter.toLowerCase(), key);
		   }
	   }
      return map;
   }
}
