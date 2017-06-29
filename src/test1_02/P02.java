package test1_02;

import java.util.Scanner;

public class P02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String text = in.nextLine();
		String regex = "[^a-zA-z]+";
		text = text.replaceAll(regex, "");
		int countUpperCase = 0;
		int countLowerCase = 0;
		for (int i = 0; i < text.length(); i++) {
			if ((text.charAt(i) >= 'A')&&(text.charAt(i)<='Z')) {//in askii table A-Z is not after z! mistake
				countUpperCase++;
			} else {
				countLowerCase++;
			}
		}
		double ratioUpperCase;
		double ratioLowerCase;
		int min = countLowerCase < countUpperCase ? countLowerCase : countUpperCase;
		ratioLowerCase=(countLowerCase*1d)/min;
		ratioUpperCase=(countUpperCase*1d)/min;
		System.out.printf("L : U case is %.2f:%.2f",ratioLowerCase,ratioUpperCase);
	}
}
