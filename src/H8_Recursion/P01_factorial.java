package H8_Recursion;

import java.util.Scanner;

public class P01_factorial {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter integer number:");
		int n = in.nextInt();
		System.out.printf("factorial of %d! = %d", n, fact(n));
	}

	public static int fact(int n) {
		if (n == 1) {
			return 1;
		}
		return n * fact(n - 1);
	}
}
