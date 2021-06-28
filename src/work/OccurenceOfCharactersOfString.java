package work;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class OccurenceOfCharactersOfString {

	public static void main(String[] args) {
		String str="Shilpashree";
		char arr[]=str.toCharArray();
		Map<Character, Integer> map=new HashMap<>();
		for(char c:arr) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
		}else
		{
			map.put(c, 1);
		}
		
	}
		
		System.out.println(map);
		
		Set<Entry<Character, Integer>> s=map.entrySet();
		
		for(Entry<Character, Integer> e:s) {
			System.out.println(e.getKey()+" "+e.getValue());		
			}
	}
}
