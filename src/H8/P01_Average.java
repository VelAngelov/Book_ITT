package H8;

import java.text.DecimalFormat;

public class P01_Average {
	public static void main(String[] args) {
		DecimalFormat dFormat = new DecimalFormat("#.##");
		int[] arr = { 1, 2, 3, 5, 21, 31, 321, 21, 21, 31, 231, 328 };
		System.out.println(dFormat.format(average(arr)));
		System.out.printf("%.2f%n",average(arr));
		System.out.println((String.valueOf(average(arr)).substring(0,5)));
		System.out.println(average(arr));
	}

	public static double average(int[] arr) {
		double sum = 0d;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum / arr.length;
	}
}
