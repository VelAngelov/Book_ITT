package test1_02;

public class P03 {
	public static int indexOfNegative(int[] arr, int start, int end) {
		int n = (start + end) / 2;
		if (n == -1 || n == arr.length) {
			return n;
		}
		if (n == start || n == end) {
			return start;
		}
		if (arr[n] < 0) {
			return indexOfNegative(arr, n, end);
		} else {
			return indexOfNegative(arr, start, n);
		}
	}

	// without return function !!!
	public static void main(String[] args) {
		int[] arr = { -8, -6, -7, -5, -2, -1, 0, 0, 0, 3, 1, 5, 6, 6, 8 };
		int index = indexOfNegative(arr, -1, arr.length);
		if(index==-1) {
			System.out.println("No negative numbers found");
		}else if(index ==arr.length) {
			System.out.println("All numbers "+arr.length + " are negatives");
		}else {
			System.out.println("found "+(index+1) + "negative numbers");
		}
	}
}
