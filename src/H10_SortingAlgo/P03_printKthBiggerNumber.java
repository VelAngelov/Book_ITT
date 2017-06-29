package H10_SortingAlgo;

public class P03_printKthBiggerNumber {
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static int partition(int[] arr, int left, int right) {
		int pivot = arr[right];
		int k = left - 1;
		for (int i = left; i <= right; i++) {
			if (arr[i] >= pivot) {
				k++;
				swap(arr, i, k);
			}
		}
		return k;
	}

	public static void placePthNumber(int[] arr, int left, int right, int p) {
		if (left >= right) {
			return;
		}
		int k = partition(arr, left, right);
		if (p < k) {
			placePthNumber(arr, left, k - 1, p);
		} else if (p > k) {
			placePthNumber(arr, k + 1, right, p);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 3, 2, 5, 1, 6, 9, 3, 7 };
		int p = 5;
		placePthNumber(arr, 0, arr.length - 1, p - 1);
		System.out.println(arr[p - 1]);
	}
}
