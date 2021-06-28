package work;

public class ReverseString {
	public static void main(String[] args) {
		String str="Im in Banglore";
//Method 1		
		StringBuilder sb=new StringBuilder(str);  
	    System.out.println( sb.reverse());
//Method 2	    
	    char ch[]=str.toCharArray();  
	    String rev="";  
	    for(int i=ch.length-1;i>=0;i--){  
	        rev+=ch[i];  
	    } 
	    System.out.println(rev);
	}

}
