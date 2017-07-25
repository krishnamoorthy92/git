package selenium;

public class Reverse1 {

public static void main(String[] args) {

String str = "mallikarjunareddy";

String res = Reverse1.strReverse(str);

System.out.println(res);

}

private static String strReverse(String str) {

// TODO Auto-generated method stub

char ch[] = new char[str.length()];

for (int i = str.length() - 1, j = 0; i >= 0; i--) {

ch[j++] = str.charAt(i);

}

String s = new String(ch);
return s;
//return new String(ch);

}

}
