package work;

public class reverse_and_tOGGLE_each_word_in_String {

	public static void main(String[] args) {
		String str="Have you been to Bangalore";
        String[] arr=str.split(" ");
		String reverseTOGGLE="";
		
		for(String s:arr) {
			StringBuffer sb=new StringBuffer(s);
			String s1=sb.reverse().toString();
			reverseTOGGLE+=s1.substring(0,1).toLowerCase()+s1.substring(1).toUpperCase()+" ";
		}
		System.out.println(reverseTOGGLE);
	}

}
