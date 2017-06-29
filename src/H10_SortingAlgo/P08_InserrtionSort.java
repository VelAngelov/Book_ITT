package H10_SortingAlgo;

public class P08_InserrtionSort {
	public static void insertionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int temp = arr[i + 1];
			for (int j = i; (j >= 0) && (temp < arr[j]); j--) {
				System.out.println(arr[j] + " > " + temp);
				arr[j + 1] = arr[j];
				arr[j] = temp;
			}
		}
	}
	static void printArr(int[] arr) {
		for(int i:arr) {
			System.out.printf("%d ",i);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 7, 9, 11,12, 10, 20, 40, 300 };
		printArr(arr);
		insertionSort(arr);
		printArr(arr);
		
	}
}
