package selenium;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Textverifi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	String kk = "krishna (13272)";
		Pattern p = Pattern.compile("(\\d+)");
		Matcher m = p.matcher(kk);
		while(m.find())
		{
		    System.out.println(m.group(1));
		}
	}
*/
	String kk = "krishna (13272)";
kk.replaceAll("[a-z]", "");
	//System.out.println(kk.replaceAll("[a-z,A-z,(.),]",), "");

System.out.println(kk.substring(kk.indexOf("(")+1,kk.indexOf(")")));
}
}