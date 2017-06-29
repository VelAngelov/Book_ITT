package test1_02;

import java.util.Scanner;
//missing validation of input! dice {1,2,3,4,5,6}
public class P01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int dice1;
		int dice2;
		int sum;
		int count = 0;
		while (count < 7) {
			System.out.println("Enter value of dice 1");
			dice1 = in.nextInt();
			System.out.println("Enter value of dice 2");
			dice2 = in.nextInt();
			sum = dice1 + dice2;
			if(sum==7) {
				count++;
			}else {
				count = 0;
			}
		}
		System.out.println("Excelent");
	}
}
