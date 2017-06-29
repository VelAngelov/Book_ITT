package test1_01;

public class P03 {
	public static void main(String[] args) {
		int[] arr = {2,3,5,8,9,15,80,3,1,89};
		int max= getMax(arr, 0);
		int min = getMin(arr, 0);
		System.out.println("difference = "+(max-min));
	}
	public static int getMax(int[] arr,int i) {
		if(i == arr.length-1) {
			return arr[i];
		}
		return max(arr[i],getMax(arr, i+1));
	}
	public static int max(int a,int b) {
		return a>b? a:b;
	}
	public static int getMin(int[] arr,int i) {
		if(i == arr.length-1) {
			return arr[i];
		}
		return min(arr[i],getMin(arr, i+1));
	}
	public static int min(int a,int b) {
		return a<b? a:b;
	}
}
