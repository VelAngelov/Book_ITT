package H8;

public class P03_PrintArr {
	public static void main(String[] args) {
		int[][] matrix = {
				{ 2, 3, 3, 6 }, 
				{ 2, 3, 6, 5 },
				{ 1, 2, 3, 5 }, 
				{ 8, 1, 3, 1 } 
		};
		printArr(matrix);
	}

	public static void printArr(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
