import java.util.Scanner;

public class P4 {

	public static boolean prime(int n) {
		boolean f = true;
		int j = 2;
		while (j*j <= n && f) {
			f &= (n % j != 0);
			j++;
		}

		return f;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int sum = 0;
		int c = 0;
		int j = 2;

		while (c < n) {
			if (prime(j)) {
				c ++;
				sum += j;
			}
			j++;
		}

		System.out.println(sum);
	}
}