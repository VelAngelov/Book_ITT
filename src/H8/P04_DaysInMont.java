package H8;

public class P04_DaysInMont {
	public static void main(String[] args) {
		System.out.println(daysInMonth(2, 2016));
		System.out.println(daysInMonth(6, 2017));
	}

	public static int daysInMonth(int mm, int yyyy) {
		boolean isLeap = (yyyy % 4 == 0 && yyyy % 100 != 0) || yyyy % 400 == 0;
		switch (mm) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			return 31;
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
		case 2:
			if(isLeap) {
				return 29;
			}else {
				return 28;
			}
		default:
			return 0;
		}
	}
}
