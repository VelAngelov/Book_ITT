package H9_String;

/*
 * с
 */
import java.util.Scanner;

public class P08_Anagrama {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two words:");
		String text1 = in.next();
		String text2 = in.next();
		
		//converting to lowerCase
		text1 = text1.toLowerCase();
		text2 = text2.toLowerCase();
		int[][] arrChar = new int[2][26];
		char c;
		for (int i = 0; i < text1.length(); i++) {
			c = text1.charAt(i);
			c -= 'a';
			arrChar[0][c]++;
		}
		for (int i = 0; i < text2.length(); i++) {
			c = text2.charAt(i);
			c -= 'a';
			arrChar[1][c]++;
		}
		boolean isAnagram = true;
		for (int i = 0; i < 26; i++) {
			if(arrChar[0][i]!=arrChar[1][i]) {
				isAnagram = false;
				break;
			}
		}
		System.out.println(isAnagram?"the texts are anagrams":"texts are not anagrams");
		if(!isAnagram) {
			System.out.println("letters contains only in second word");
			for (int i = 0; i < 26; i++) {
				if(arrChar[0][i]<arrChar[1][i]) {
					c='a';
					c+=i;
					System.out.print(c+" ");
				}
			}
		}
		
	}
}
