package H9_String;

import java.util.Scanner;

public class P10_StringInFrame {
	public static void main(String[] args) {
		System.out.println("Enter some text devided by \" \"");
		Scanner in = new Scanner(System.in);
		String[] text = in.nextLine().split(" ");

		StringBuilder sb = new StringBuilder();
		for (int i = -1; i < text.length+1; i++) {
			System.out.println(line(text, i));
		}
	}
	public static int maxLength(String[] args) {
		int maxlength=0;
		for (int i = 0; i < args.length; i++) {
			maxlength = maxlength < args[i].length() ? args[i].length() : maxlength;
		}
		return maxlength;
	}
	public static String line (String[] text,int line) {
		int maxLength = maxLength(text);
		StringBuilder sb = new StringBuilder();
		if(line==-1||line==text.length) {
			for (int i = 0; i < maxLength+2; i++) {
				sb.append("*");
			}
		}else {
			sb.append("*");
			for (int i = 0; i < maxLength; i++) {
				if(i<text[line].length()) {
					sb.append(text[line].charAt(i));					
				}else {
					sb.append(" ");
				}
			}
			sb.append("*");
		}
		return sb.toString();
	}
}
