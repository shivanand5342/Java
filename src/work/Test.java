package work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Test {

	
	   public static void main(String[] args) {
		   int n1=0,n2=1,n3,count=10;
		   System.out.print(n1+" "+n2);
		   for(int i=1;i<=count;i++) {
			   n3=n1+n2;
			   System.out.print(" "+n3);
			   n1=n2;
			   n2=n3;
		   }

		   
	   }
}
