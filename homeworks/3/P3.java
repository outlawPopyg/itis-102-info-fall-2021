import java.util.Scanner;

public class P3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		if (x >= 100 && x <= 999) {
			int t = 0;
			while (x > 0) {
				t += x % 10;
				x = x / 10;
			}
			System.out.println(t);
		} else System.out.println(x);

	}
}