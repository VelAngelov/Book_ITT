package H8;

import java.util.Arrays;
import java.util.Scanner;

public class P10_sortArrays {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of elements for the first array:");
		int n = in.nextInt();
		System.out.println("Enter number of elements for the second array:");
		int m = in.nextInt();
		int[] arr1 = inputArr(n);
		int[] arr2 = inputArr(m);
		int[] sorted=sortArr(arr1, arr2);
		in.close();
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(sorted));
	}

	public static int[] sortArr(int[] arr1, int[] arr2) {
		int[] res = new int[arr1.length + arr2.length];
		int count = 0, i = 0, j = 0;
		while ((i < arr1.length) &&(j < arr2.length)) {
			if (arr1[i] < arr2[j]) {
				res[count] = arr1[i];
				i++;
			} else {
				res[count] = arr2[j];
				j++;
			}
			count++;
		}
		while(i<arr1.length) {
			res[count]=arr1[i];
			i++;
			count++;
		}
		while(j<arr2.length) {
			res[count]=arr2[j];
			j++;
			count++;
		}
		return res;
	}

	public static int[] inputArr(int n) {
		Scanner in = new Scanner(System.in);
		int[] arr = new int[n];
		System.out.printf("Enter %d elements:%n",n);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		return arr;
	}

}
