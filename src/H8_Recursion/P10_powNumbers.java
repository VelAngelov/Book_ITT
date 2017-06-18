package H8_Recursion;

public class P10_powNumbers {
	public static void main(String[] args) {
		System.out.println(product(0, 6));
		System.out.println(power(3, 0));
	}
	public static int product(int a, int b) {
		if(a==1) {
			return b;
		}
		if(a==0) {
			return 0;
		}
		return b+product(a-1, b);
	}
	public static int power(int x, int y) {
		if(y==1) {
			return x;
		}
		if(y==0) {
			return 1;
		}
		return product(x, power(x, y-1));
	}
}
