package H8_Recursion;

public class P08_isPrime {
	public static void main(String[] args) {
		System.out.println(isPrime(5, 2));
		System.out.println(isPrime(25646, 2));
	}
	public static boolean isPrime(int num,int index) {
		if(index==(int)Math.sqrt(num)) {
			return num%(int)Math.sqrt(num)!=0;
		}
		return num%index!=0&&isPrime(num, index+1);
	}
}
