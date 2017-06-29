package H10_SortingAlgo;

import java.util.Arrays;

//this is not a solution!!!
//only for understanding heapsort
public class P03_KthNumber {
	static void downHeap(int[] arr, int start, int end, int index) {
		int max = index;
		int lch = index * 2 + 1;
		int rch = index * 2 + 2;
		if ((start + lch < end) && arr[start + lch] > arr[start + max]) {
			max = lch;
		}
		if ((start + rch < end) && arr[start + rch] > arr[start + max]) {
			max = rch;
		}
		if (max != index) {
			swap(arr, max + start, index + start);
			downHeap(arr, start, end, max);
			System.out.println(Arrays.toString(arr));
		}
	}

	static void heapify(int[] arr, int start, int end) {
		for (int i = (end - start)/2 ; i >= start; i--) {
			downHeap(arr, start, end, i);
			
		}
	}

	static void getKthNumber(int[] arr, int start, int end, int k) {
		heapify(arr, start, end);
		if (k == 0) {
			return;
		}
		int h = 1;
		while (k > (int) Math.pow(2, h + 1) - 1) {
			h++;
		}
		start += (int) Math.pow(2, h) - 1;
		end = min(end, start + (int) Math.pow(2, h)-1);
		k -= (int) Math.pow(2, h) - 1;
		getKthNumber(arr, start, end, k);
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int k= 5;
		getKthNumber(arr, 0, arr.length, k);
		System.out.println(arr[k]);
	}

	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	static int min(int i, int j) {
		return i < j ? i : j;
	}
}
