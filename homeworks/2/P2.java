import java.util.Scanner;
import java.awt.Polygon;

public class P2 {
	public static void main(String[] args) {

		int[] xpoints = {0, 3, -2, -10, 0};
		int[] ypoints = {1, 0, 0, -10, -1};

		Polygon polygon = new Polygon(xpoints, ypoints, 5);
		System.out.println(polygon.contains(-2,-2));
		polygon.getBounds2D();


		// Scanner sc = new Scanner(System.in);

		// double x = sc.nextDouble();
		// double y = sc.nextDouble();

		// double y1 = ((1/3) * x  - 1);
		// double y2 = ((-1/3) * x + 1);
		// double y3 = ((1/2) * x + 1);
		// double y4 = ((5/4) * x + 2.5);
		// double y5 = ((9/10) * x - 1);

		// if (y >= -10 && y <= 1) {
		// 	if (x >= 0 && x <= 3) {
		// 		if ((y2 >= y) && (y1 <= y)) {
		// 			System.out.println("INSIDE");
		// 		} else System.out.println("OUTSIDE");
		// 	} else if (x < 0 && x >= -10) {
		// 		if ((y <= y5) && (y <= y4) && (y <= y3)) {
		// 			System.out.println("INSIDE");
		// 		} else System.out.println("OUTSIDE");
		// 	}
		// 	else System.out.println("OUTSIDE");
		// } else System.out.println("OUTSIDE");

	}
}

