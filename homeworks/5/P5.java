import java.util.Scanner;

public class P5 {

	public static boolean soversh(int k) {
		int s = -(k);
		for (int i = 1; i*i <= k; i++) {
			if (k % i == 0) {
				s += i;
				if (i*i < k) {
					s += (k/i);
				}
			}
		}

		return s == k;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = 0;
		int sum = 0;
		int j = 2;

		while (c < n) {
			if (soversh(j)) {
				c ++;
				sum += j;
			}
			j++;
		}

		System.out.println(sum);
	}
}