package H8;

public class P02_EqualsNumbers {
	public static void main(String[] args) {
		int a = 5;
		int b = 6;
		int c = 5;
		isEqual(a, b);
		isEqual(a, c);
	}
	public static void isEqual( int a,int b) {
		System.out.println(a+" "+b+(a==b?" are equal":" are not equal"));
	}
}
