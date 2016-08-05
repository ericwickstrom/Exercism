import java.util.HashMap;

public class DNA {
	private HashMap<Character, Integer> map;
	
	public DNA(String dna){
		map = new HashMap<Character, Integer>();
		int a = 0;
		int g = 0;
		int c = 0;
		int t = 0;
		
		char[] array = dna.toCharArray();
		for(char l : array){
			switch(Character.toUpperCase(l)){
				case 'A':
					a++;
					break;
				case 'C':
					c++;
					break;
				case 'G':
					g++;
					break;
				case 'T':
					t++;
					break;
			}
		}
		
		map.put('A', a);
		map.put('C', c);
		map.put('G', g);
		map.put('T', t);
	}
	
	public int count(Character nucleotide){
		if(!map.keySet().contains(nucleotide)){
			throw new IllegalArgumentException();
		}
		return map.get(nucleotide);
	}
	
	public HashMap<Character, Integer> nucleotideCounts(){
		return map;
	}
}
