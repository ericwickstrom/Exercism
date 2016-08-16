import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;

public class School {
	private HashMap<Integer, ArrayList<String>> map;
	
	/*
	 * Create HashMap.
	 */
	public School() {
		map = new HashMap<>();	}
	
	/*
	 * returns HashMap containing all grades.
	 */
	public HashMap<Integer, ArrayList<String>> db(){
		return map;
	}
	
	/*
	 * Adds a student to specified grade.
	 */
	public void add(String name, int grade){
		if(!map.containsKey(grade)){
			ArrayList<String> list = new ArrayList<>();
			list.add(name);
			map.put(grade, list);
		} else {
			ArrayList<String> list = map.get(grade);
			list.add(name);
			map.put(grade, list);
		}
	}
	
	/*
	 * Returns an ArrayList of specified grade.
	 */
	public ArrayList<String> grade(int grade){
		if(!map.containsKey(grade)){
			return new ArrayList<String>();
		}
		return map.get(grade);
	}
	
	/*
	 * Sorts each grade, if grade has students.
	 * Returns HashMap of school.
	 */
	public HashMap<Integer, ArrayList<String>> sort(){
		for(int i = 0; i < 12; i++){
			if(map.containsKey(i)){
				ArrayList<String> list = map.get(i);
				Collections.sort(list);
				map.put(i, list);
			}
		}
		return map;
	}
}
