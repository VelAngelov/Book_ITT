package H8_Recursion;

public class P06_reverseNumber {
	public static int i=0;
	public static void main(String[] args) {
		int num=1325;
		System.out.println(reverseNum(num));
		System.out.println(reverseNum2(num));
	}
	public static int reverseNum(int num) {
		if(num>0) {
		int digit=num%10;
		num=reverseNum(num/10);
		num+=digit*(int)(Math.pow(10, i));
		i++;
		}
		return num;
	}
	public static int reverseNum2(int num) {
		if(num>0) {
		int digit=num%10;
		int numberOfDigits= Integer.toString(num).length();
		num=reverseNum2(num/10);
		num+=digit*(int)(Math.pow(10, numberOfDigits-1));
		}
		return num;
	}
}
