package H8;

import java.util.Arrays;

public class P09_minArr {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 6, 5, 4, 8, 9, 3, 2, 1, 1 };
		int[] arr2 = { 2, 3, 6, 5, 4, 9, 5, 8, 7, 8, 3, 2 };
		System.out.println("arr1: \t\t" + Arrays.toString(arr1));
		System.out.println("arr2: \t\t" + Arrays.toString(arr2));
		System.out.println("result: \t" + Arrays.toString(minArr(arr1, arr2)));		
	}

	public static int[] minArr(int[] arr1,int[] arr2) {
		if(arr1.length!=arr2.length) {
			return new int[0];
		}
		for (int i = 0; i < arr1.length; i++) {
			arr1[i]=min(arr1[i], arr2[i]);
		}
		return arr1;
	}

	public static int min(int a, int b) {
		return a > b ? b : a;
	}
}
