package selenium;

import java.util.Scanner;

import junit.framework.Assert;

public class Reverse {

	
	public static String reverse(String s){
		
		 char[] c  = new char[s.length()];
		
		 for(int i=s.length()-1,j=0;i>=0;i--,j++){
		
			 c[j] = s.charAt(i);

		 }
		 return new String(c);
		 	}
	
	public static void main(String[] args){
		
		
		Scanner kk = new Scanner(System.in);
		System.out.println("enter String");
		String str = kk.next();
		
		
		String ss = reverse(str);
		if(ss.equals(str)){
			System.out.println("given string s palindrome");
		}else{
			System.out.println("not a palindrome");
		}
		System.out.println(kk);
	}
}
