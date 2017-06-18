package H8_Recursion;

public class P05_indexOfMaxElement {
	public static int maxI=0;
	public static void main(String[] args) {
		int[] arr = { 1, 21, 31, 34, 4, 654, 64, 867, 84, 654, 5, 32, 1, 13, 13, 13, 13, 1354, 564, 4, 64 };
		int max=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[max]<arr[i]) {
				max=i;
			}
		}
		System.out.println(max);
		System.out.println(maxIndex(arr, 0));
		System.out.println(maxIndex(arr, 0));
	}
	public static int maxIndex(int[] arr,int index) {
		if(index==arr.length-1) {
			return arr.length-1;
		}
		int maxElement=maxIndex(arr, index+1);
		
		if(arr[maxElement]<arr[index]) {
			return index;
		}else {
			return maxElement;
		}
	}
	public static int maxIndex2(int[] arr, int index) {
		if(index==arr.length-1) {
			return maxI;
		}
		if(arr[maxI]<arr[index]) {
			maxI=index;
		}
		return maxIndex2(arr, index+1);
	}
	
		
}
