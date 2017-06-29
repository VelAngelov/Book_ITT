package H10_SortingAlgo;

import java.util.Scanner;

public class P01_NumberTo100 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Chose a number from 1 to 1000");
		int n,k;
		int left=1;
		int right=1000;
		do {
			k=(left+right)/2;
			System.out.printf("%d?%n",k);
			System.out.println("0-for down,2-for up,1-for this is my num");
			n=in.nextInt();
			if(n==0) {
				right=k-1;
			}else {
				left=k+1;
			}
		}while(n!=1&&left<=right);
		System.out.printf("your number is %d",k);
	}
}
