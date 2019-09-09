package oswaldo;

public class headVsTail {
	public static void tail(int n) {
		if (n == 1) {
			return;
		} else {
			System.out.println(n);
		}
		tail(n - 1);
	}

	public static void head(int n) {
		if (n == 0) {
			System.out.println("n was 0: " + n);
			return;
		} else {
			System.out.println("n was not 0: " + n);
			head(n - 1);
		}
		System.out.println(n);
	}

	public static void main(String[] args) {
//		head(3);
		tail(3);
	}
}
