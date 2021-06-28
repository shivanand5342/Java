package work;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Duplicate {

	public static void main(String[] args) {
		String[] names = { "Java", "JavaScript", "Python", "Python", "C", "Ruby", "Java" }; 

		for (int i = 0; i < names.length; i++) 
		{
		   for (int j = i + 1; j < names.length; j++) 
		  { 
		      if (names[i].equals(names[j]) )
		        { 
		          System.out.println("duplicate string is : "+names[i]); 
		        } 
		  }
		}
System.out.println("*********************************************");
	Set<String> set=new HashSet<>();
		for(String name:names) {
			if(set.add(name)==false)
			       System.out.println("duplicate string is : "+name);
		}
System.out.println("*********************************************");		
		// Third solution : using Hash table data structure to find duplicates 
		 System.out.println("Duplicate elements from array using hash table");
		 Map<String, Integer> map=new HashMap<>();
			for(String name:names) {
				if(map.containsKey(name)) {
					map.put(name, map.get(name)+1);
				}else {
					map.put(name, 1);
				}
			}
			System.out.println(map);
	   
	   
			Set<Entry<String, Integer>> entrySet = map.entrySet();
		     for(Entry<String, Integer> entry: entrySet){
		    	 if(entry.getValue()>1)
		    		 System.out.println(entry.getKey());
		     }
	    
		
	}
}
