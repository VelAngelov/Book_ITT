package test1_01;

import java.util.Scanner;

public class P02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String text;
		System.out.println("Enter text");
		text = in.nextLine();
		String[] texts = text.split(" ");
		int[] count = new int[texts.length];
		for (int i = 0; i < texts.length-1; i++) {
			for (int j = 0; j < texts.length; j++) {
				if(texts[i].equals(texts[j])) {
					count[i]++;
				}
			}
		}
		int max= 0;
		int index = 0;
		for (int i = 0; i < texts.length; i++) {
			if(max<count[i]) {
				max = count[i];
				index = i;
			}
		}
		System.out.println("word: "+ texts[index]);
		System.out.println("max: "+ max);
	}
}
