package H10_SortingAlgo;

import java.util.Arrays;

public class P09_findMinMax {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 6, 5, 3, 2, 1 };
		int[] arr2 = { 6, 5, 4, 3, 2, 1, 2, 3, 4, 5, 6, 9 };
		int[] arr3 = { 1, 2, 3, 4, 5, 6, 9 };
		int[] arr4 = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		System.out.println(Arrays.toString(arr1) + "=>" + extream(arr1));
		System.out.println(Arrays.toString(arr2) + "=>" + extream(arr2));
		System.out.println(Arrays.toString(arr3) + "=>" + extream(arr3));
		System.out.println(Arrays.toString(arr4) + "=>" + extream(arr4));
	}

	static int extream(int[] arr) {
		if (arr[1] - arr[0] > 0) {
			// asc elements:
			if (arr[arr.length - 1] - arr[arr.length - 2] > 0) {
				// only asc:
				return arr[arr.length - 1];
			} else {
				return findMax(arr, 0, arr.length);
			}
		} else {
			// desc
			if (arr[arr.length - 1] - arr[arr.length - 2] < 0) {
				// only desc:
				return arr[arr.length - 1];
			} else {
				return findMin(arr, 0, arr.length);
			}
		}
	}

	static int findMax(int[] arr, int left, int right) {
		int mid = (left + right) / 2;
		if (arr[mid - 1] < arr[mid] && arr[mid] > arr[mid + 1]) {
			return arr[mid];
		}
		if (left >= right) {
			return -1;
		}
		if (arr[mid + 1] - arr[mid] > 0) {
			return findMax(arr, mid + 1, right);
		} else {
			return findMax(arr, left, mid - 1);
		}
	}

	static int findMin(int[] arr, int left, int right) {
		int mid = (left + right) / 2;
		if (arr[mid - 1] > arr[mid] && arr[mid] < arr[mid + 1]) {
			return arr[mid];
		}
		if (left >= right) {
			return -1;
		}
		if (arr[mid + 1] - arr[mid] < 0) {
			return findMin(arr, mid + 1, right);
		} else {
			return findMin(arr, left, mid - 1);
		}
	}
}
