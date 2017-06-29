package H10_SortingAlgo;

public class P07_CountingSortForArr {
	static void printModa(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		int[] count = new int[max + 1];
		for (int i = 0; i < arr.length; i++) {
			int temp = arr[i];
			count[temp]++;
		}
		int moda = 0;
		int index = 0;
		for (int i = 0; i < count.length; i++) {
			if (moda < count[i]) {
				moda = count[i];
				index = i;
			}
		}
		System.out.printf("Moda:%d %nCounted:%d", index, moda);
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 6, 5, 4, 8, 9, 6, 3, 2, 1, 4, 5, 6, 3, 2, 5, 4, 8, 9, 6, 3, 2, 4, 5, 6, 3, 2, 1, 5, 6,
				6 };
		printModa(arr);
	}
}
