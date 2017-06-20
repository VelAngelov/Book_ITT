package H9_String;

import java.util.Scanner;

public class P07_PerfectDiamond {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number n>0");
		int n = in.nextInt();
		while (!(n > 0)) {
			System.out.println("Bad input!Enter again");
			n = in.nextInt();
		}
		for (int i = 1; i <= n; i++) {
			System.out.println(line(n, i));
		}
		for (int i = n-1; i >= 1; i--) {			
			System.out.println(line(n, i));
		}
	}

	public static String line(int n, int line) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n-line; i++) {
			sb.append(" ");
		}
		sb.append(line);
		for (int i = n-line+1; i < n; i++) {
			sb.append("*");
		}
		StringBuilder sbMirror = new StringBuilder();
		sbMirror.append(sb.substring(0,sb.length()-1));
		sbMirror.reverse();
		sb.append(sbMirror.toString());
		return sb.toString();
	}
}
