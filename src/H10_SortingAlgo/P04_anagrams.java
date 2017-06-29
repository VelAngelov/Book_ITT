package H10_SortingAlgo;

public class P04_anagrams {
	static int[] composition(String text) {
		int[] arr = new int[26];
		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			c-='a';
			arr[c]=1;
		}
		return arr;
	}
	static boolean isEqual(int[] arr1,int[] arr2) {
		for (int i = 0; i < 26; i++) {
			if(arr1[i]!=arr2[i]) {
				return false;
			}
		}
		return true;
	}
	static boolean isEqualMorfologicaly(String text1,String text2) {
		return isEqual(composition(text1), composition(text2));
	}
	static int countPairs(String[] text) {
		int count=0;
		for (int i = 0; i < text.length-1; i++) {
			for (int j = i+1; j < text.length; j++) {
				if(isEqualMorfologicaly(text[i], text[j])) {
					count++;
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		String[] text = {"baba","abba","aba","bar","petyr"};
		System.out.println(countPairs(text));
	}
}
