package H8_Recursion;

public class P04_EquivalentNumbers {
	public static void main(String[] args) {
		int[] arr = { 1, 321, 21, 31, 54, 54, 64, 12, 13, 1, 564, 564, 5, 31, 351, 3, 1, 1564 };
		int[] arr1 = { 1, 2, 3, 66, 4, 5, 7, 8, 96, 45, 21, 65, 32 };
		System.out.println(areEquivalentNumbers(arr, 0));
		System.out.println(areEquivalentNumbers(arr1, 0));
	}

	public static boolean areEquivalentNumbers(int[] arr, int index) {
		if (index == arr.length - 2) {
			return (arr[arr.length - 2] == arr[arr.length - 1]);
		}
		return areEquivalentNumbers(arr, index + 1) || (arr[index] == arr[index + 1]);
	}
}
