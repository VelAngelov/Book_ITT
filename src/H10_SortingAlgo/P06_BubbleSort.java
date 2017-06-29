package H10_SortingAlgo;

import java.util.Arrays;

public class P06_BubbleSort {
	public static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					swap(arr, j, j + 1);
				}
			}
		}
	}

	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	static int[] concatArr(int[][] arr) {
		int n = 0;
		for (int i = 0; i < arr.length; i++) {
			n += arr[i].length;
		}
		int[] arr1 = new int[n];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr1[count++] = arr[i][j];
			}
		}
		return arr1;
	}

	static void devideArr(int[][] arr, int[] arr1) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = arr1[count++];
			}
		}
	}
	static void printArr(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] arr = { { 21, 321, 641, 1323, 54, 64 }, { 1323, 1, 564, 54, 321 }, { 31, 54, 133, 21, 35, 46 },
				{ 54, 313, 21, 565, 4 }, { 87, 453, 1, 354, 546 }, { 4, 31, 354, 64 } };
		int[] arr1 = concatArr(arr);
		bubbleSort(arr1);
		devideArr(arr, arr1);
		printArr(arr);
	}
}
