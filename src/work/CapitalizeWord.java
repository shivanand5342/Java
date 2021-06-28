package work;

public class CapitalizeWord {

	public static void main(String[] args) {
	     String str="have you gone to bangalore";
	     String arr[]=str.split(" ");
	     String temp="";
	     for(String s:arr) {
	    	temp += s.substring(0,1).toUpperCase()+s.substring(1)+" ";
	     }
	     System.out.println(temp.trim());
	}

}
