import java.util.Scanner;

public class L3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int  sum = k + 1;

		for (int i = 2; i < k; i++) {
			if (k % i == 0) sum += i;
		}

		System.out.println(sum);
	}
}