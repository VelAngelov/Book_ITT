package H10_SortingAlgo;

import java.util.Arrays;

public class P05SortBinarySet {
	public static void main(String[] args) {
		int[] arr = { 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1 };
		int zeroes=countZeroes(arr);
		for (int i = 0; i < arr.length; i++) {
			if(i<zeroes) {
				arr[i]=0;
			}else {
				arr[i]=1;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	static int countZeroes(int[] arr) {
		int count = 0;
		for (int i : arr) {
			if (i == 0) {
				count++;
			}
		}
		return count;
	}
}
