package H8;

public class P07_CountNumbers {
	public static void main(String[] args) {
		char[] arr = { 'a', 'f', 'c', '4', '2', 'f', '5' };
		System.out.println(countNumbers(arr));
	}

	public static int countNumbers(char[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= '0' && arr[i] <= '9') {
				count++;
			}
		}
		return count;
	}
}
