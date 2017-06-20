package H9_String;
/*
 * а
 */
import java.util.Scanner;

public class P06_countOfChar {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter some text:");
		String text = in.nextLine();
		System.out.println("Enter character:");
		char c = in.next().charAt(0);
		int count = 0;
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == c) {
				count++;
			}
		}
		System.out.println("The symbol occures:"+count);
	}
}
