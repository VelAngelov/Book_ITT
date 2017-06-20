package H9_String;

import java.util.Scanner;

public class P09_characterCounterIntext {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter text:");
		String text = in.nextLine();
		text = text.replaceAll("[^a-zA-z]", "");
		int[] chars = new int[26];
		text = text.toLowerCase();
		char c;
		// counting letters:
		for (int i = 0; i < text.length(); i++) {
			c = text.charAt(i);
			c -= 'a';
			chars[c]++;
		}
		// out and find max:
		System.out.println("leters:count");
		int max = 0;
		for (int i = 0; i < 26; i++) {
			if (chars[max] < chars[i]) {
				max = i;
			}
			if(chars[i]!=0) {
				c = 'a';
				c += i;
				System.out.println(c+ ":"+chars[i]);				
			}
		}
		c = 'a';
		c += max;
		System.out.printf("moda of the string is :%c %ncontains %d times \"%1$c\"",c,chars[max]);
	}
}
