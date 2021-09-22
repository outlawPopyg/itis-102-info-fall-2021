import java.util.Scanner;

public class L4 {

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
		boolean f = true;
		int a = sc.nextInt();
		while (a != 0) {
			boolean hasSquare = false;
			for (int b = 2; b <= n; b++) {
				int sqrt = (int)Math.floor(Math.sqrt(b));
				hasSquare |=
			}
			f &= hasSquare;
			a = sc.nextInt();
		}

		System.out.println(f ? "YES" : "NO");
	}
}