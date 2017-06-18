package H8_Recursion;

public class P02_v2 {
	public static void main(String[] args) {
		int[] arr = { 12, 321, 3, 16, 46, 54, 423, 13, 131, 321, 321, 3121, 21, 55445, 4684, 21 };
		System.out.println(min(arr, 0));
	}

	public static int min(int[] arr,int n) {
		if(n==arr.length-1) {
			return arr[arr.length-1];
		}
		return minEl(min(arr, n+1),arr[n]);
	}

	public static int minEl(int a, int b) {
		return a > b ? b : a;
	}
}
