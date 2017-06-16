package H8;

import java.util.Arrays;

public class P05_ScalarProduct {
	public static void main(String[] args) {
		int[] arr1 = { 2, 1, 3, 6, 5, 4, 8, 9 };
		int[] arr2 = { 2, 3, 6, 5, 4, 2, 6, 2 };
		int[] arr3 = { 1, 3, 2 };
		System.out.println(Arrays.toString(Product(arr1, arr2)));
		System.out.println(Arrays.toString(Product(arr1, arr3)));
	}

	public static int[] Product(int[] arr1, int[] arr2) {
		if (arr1.length != arr2.length) {
			System.out.println("wrong input!");
			return new int[0];
		} else {
			int[] prodArr = new int[arr1.length];
			for (int i = 0; i < arr1.length; i++) {
				prodArr[i] = arr1[i] * arr2[i];
			}
			return prodArr;
		}
	}
}
