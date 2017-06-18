package H8_Recursion;

public class P07_PrintNumbers {
	public static void main(String[] args) {
		printNumbers(1, 6, 1);
	}

	public static void printNumbers(int start, int end, int count) {
		for (int i = start; (i <= count) && (i <= end); i++) {
			System.out.print(i + " ");
			if (i == count && (i != end)) {
				System.out.println();
				printNumbers(start, end, count + 1);
			}
		}
	}
}
