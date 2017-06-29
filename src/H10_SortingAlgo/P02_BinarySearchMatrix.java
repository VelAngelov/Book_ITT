package H10_SortingAlgo;

public class P02_BinarySearchMatrix {
	public static void main(String[] args) {
		int[][] arr = {{3,5,6},
				{7,9,11,15,16},
				{18,19,23,24,28,35}};
		int[] ij = new int[2];
		binarySearch(arr, 0, findRight(arr), 11);
	}
	static void binarySearch(int[][] arr, int left, int right,int el) {

		int k= (left+right)/2;
		int i=toij(arr, k)[0];
		int j=toij(arr, k)[1];
		if(left>=right||el==arr[i][j]) {
			System.out.printf("i=%d j=%d  el=%d",i,j,el);
		}
		if(el<arr[i][j]) {
			binarySearch(arr, left, k-1, el);
		}
		if(el>arr[i][j]) {
			binarySearch(arr, k+1, right, el);
		}
	}
	public static int[] toij(int[][] arr,int k) {
		int[] ij = new int[2];
		for (int i = 0; i < arr.length; i++) {
			if(k<arr[i].length) {
				ij[0]=i;
				ij[1]=k;
				break;
			}
			k-=arr[i].length;
		}
		return ij;
	}
	public static int findRight(int[][] arr) {
		int right=0;
		for (int i = 0; i < arr.length; i++) {
			right+=arr[i].length;
		}
		return right;
	}
}
