package test1_01;

import java.util.Scanner;

public class P01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String result;
		int count = 0;
		while (count < 5) {
			System.out.println("Type result");
			result = in.next();
			if (result.equals("Heads")) {
				count++;
			} else {
				count = 0;
			}
		}
	}
}
