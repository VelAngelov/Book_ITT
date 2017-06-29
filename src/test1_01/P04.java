package test1_01;


public class P04 {
	public static void main(String[] args) {
		char[][] arr = { 
				{ ' ', ' ', 'b', 'b', 'b', 'b', ' ' },
				{ ' ', 'b', 'b', ' ', ' ', 'b', ' ' },
				{ ' ', 'b', ' ', ' ', 'x', 'b', ' ' },
				{ ' ', 'b', 'b', 'b', 'b', 'b', ' ' },
				{ ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
				{ ' ', ' ', ' ', ' ', ' ', ' ', ' ' }};
		//founding x:
		int row=0;
		int col = 0;
		outerloop:
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j]=='x') {
					row = i;
					col = j;
					break outerloop;
				}
			}
		}
		fillArr(arr,row,col);
		printArr(arr);
	}
	public static void fillArr(char[][] arr,int row,int col) {
		if(row<0||row>=arr.length||col<0||col>=arr[row].length) {
			//out of bounds
			return;
		}
		if(arr[row][col]=='b'||arr[row][col]=='r') {//missing in 'r' in the solution by hand!
			//out of bounds
			return;
		}
		if(arr[row][col]=='x') {
			//start
		}else {
			arr[row][col]='r';
		}
		fillArr(arr, row+1, col);
		fillArr(arr, row-1, col);
		fillArr(arr, row+1, col+1);
		fillArr(arr, row+1, col-1);
		fillArr(arr, row-1, col+1);
		fillArr(arr, row-1, col-1);
		fillArr(arr, row, col+1);
		fillArr(arr, row, col-1);
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
