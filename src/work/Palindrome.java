package work;

import java.util.Scanner;

public class Palindrome {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter String to find palindrome or not");
	String str=sc.nextLine();
	String res="";
	
	for(int i=str.length()-1;i>=0;i--) {
		res=res+str.charAt(i);
	}
	System.out.println(res);
	if(str.equals(res))
		System.out.println("given string is palindrome");
	else
		System.out.println("given string is not palindrome");
  }
}
