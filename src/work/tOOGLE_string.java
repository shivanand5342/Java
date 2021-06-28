package work;

public class tOOGLE_string {
	public static void main(String[] args) {
		 String str="Have you been to Bangalore";
		 String arr[]=str.split(" ");
		 String tOOGLE="";
		 
		 for(String s:arr) {
			 tOOGLE+=s.substring(0,1).toLowerCase()+s.substring(1).toUpperCase()+" ";
		 }
		System.out.println(tOOGLE);

	}
}
