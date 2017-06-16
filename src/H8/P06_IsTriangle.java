package H8;

public class P06_IsTriangle {
	public static void main(String[] args) {
		System.out.println(isTriangle(3, 4, 5));
		System.out.println(isTriangle(2, 2, 5));
		System.out.println(isTriangle(1, 4, 5));
	}

	public static boolean isTriangle(int a, int b, int c) {
		double p = (a + b + c) * 1d / 2;
		return (p - a) * (p - b) * (p - c) > 0;
	}
}
