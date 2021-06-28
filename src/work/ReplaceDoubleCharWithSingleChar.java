package work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class ReplaceDoubleCharWithSingleChar {

	
	   public static void main(String[] args) {
		   String str="minddtree";
	
		   for(int i=0;i<str.length();i++) {
			
			   
				  if(str.charAt(i)==str.charAt(i+1)) 
					  str = str.substring(0, i) + str.substring(i + 1); 
			   	  
			   
		   }
		   System.out.println(str);
	   
 
	   }
}
