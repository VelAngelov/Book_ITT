package test1_02;

public class P04 {
	public static int count=0;
	static char countMines(char[][] arr, int row, int col, boolean flag) {
		if (row < 0 || row >= arr.length || col < 0 || col >= arr[row].length) {
			return '0';
		}
		if (arr[row][col] == '*') {
			count++;
		}
		if (flag) {
			return '0';
		}
		flag = true;
		count =0;
		countMines(arr, row + 1, col, flag);
		countMines(arr, row + 1, col + 1, flag);
		countMines(arr, row + 1, col - 1,  flag);
		countMines(arr, row - 1, col,  flag);
		countMines(arr, row - 1, col - 1,  flag);
		countMines(arr, row - 1, col + 1, flag);
		countMines(arr, row, col + 1,  flag);
		countMines(arr, row, col - 1, flag);
		if (count == 0) {
			return ' ';
		} else {
			// next two lines missing in the solution by hand
			char c = '0';
			c += count;
			return c;
		}
	}

	public static void main(String[] args) {
		char[][] arr = {
				{' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
				{' ','*',' ',' ',' ',' ',' ','*',' ',' '},
				{' ',' ',' ',' ',' ',' ',' ','*',' ',' '},
				{' ',' ',' ','*','*',' ',' ','*',' ',' '},
				{' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
				{' ',' ',' ',' ',' ','*',' ','*',' ',' '},
				{' ',' ',' ',' ','*',' ',' ',' ',' ',' '},
				{' ',' ',' ',' ',' ','*',' ',' ',' ',' '},
				{' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
				{' ',' ',' ',' ',' ',' ',' ',' ',' ',' '}
				};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j]!='*') {
					arr[i][j]=countMines(arr, i, j, false);
				}
			}
		}
		printArr(arr);
				
	}
	public static void printArr(char[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}
