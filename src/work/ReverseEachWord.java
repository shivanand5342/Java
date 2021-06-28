package work;

public class ReverseEachWord {
public static void main(String[] args) {
	String str="Im in Bangalore";
	
	String arr[]=str.split(" ");	
	
	String res="";
	for(String s:arr) {
		StringBuffer sb=new StringBuffer(s);
		res=res+sb.reverse().toString()+" ";
	}
   System.out.println(res);	
}
}
