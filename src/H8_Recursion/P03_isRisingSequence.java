package H8_Recursion;

public class P03_isRisingSequence {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 56, 65, 98, 123, 354, 654, 3211 };
		int[] arr1 = { 123, 31, 32, 132, 1321, 1, 21, 3, 13, 13, 32, 321, 46 };
		System.out.println(isRising(arr, 0));
		System.out.println(isRising(arr1, 0));
	}
	public static boolean isRising(int[] arr,int index) {
		if(index == arr.length-2) {
			return arr[arr.length-2]<arr[arr.length-1];
		}
		return (arr[index]<arr[index+1])&&(isRising(arr, index+1));
	}
}
