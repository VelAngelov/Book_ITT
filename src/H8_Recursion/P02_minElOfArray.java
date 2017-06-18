package H8_Recursion;

public class P02_minElOfArray {

	public static void main(String[] args) {
		int[] arr = { 12, 321, 3, 16, 46, 54, 423, 13, 131, 321, 321, 3121, 21, 55445, 4684, 21 };
		System.out.println(foundMin(arr));
	}
	public static int foundMin(int[] arr) {
		for (int i = (arr.length+1)/2; i >= 0; i--) {
			downHeap(arr, i);
		}
		return arr[0];
	}

	public static void downHeap(int[] arr, int index) {
		int left = 2 * index + 1;
		int right = 2 * index + 2;
		int min = index;
		if (left < arr.length && arr[left] < arr[min]) {
			min = left;
		}
		if (right < arr.length && arr[right] < arr[min]) {
			min = right;
		}
		if(min!=index) {
			swap(arr, min, index);
			downHeap(arr, min);
		}
	}
	public static void swap (int[] arr, int i,int j) {
		int temp=arr[i];
		arr[i]= arr[j];
		arr[j]= temp; 
	}

}
