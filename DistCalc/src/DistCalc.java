import java.util.Scanner;
import java.text.DecimalFormat;

public class DistCalc {

	public static void main(String[] args) {
		
		double x1, y1, x2, y2, X, Y, square_add, root;

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the value of x1: ");
		x1 = scan.nextDouble();

		System.out.print("Enter the value of y1: ");
		y1 = scan.nextDouble();

		System.out.print("Enter the value of x2: ");
		x2 = scan.nextDouble();

		System.out.print("Enter the value of y2: ");
		y2 = scan.nextDouble();
		
		
		X = (x2 - x1);
		Y = (y2 - y1);
		
		//performing operations under the square root of the dist. formula
		square_add = Math.pow(X, 2) + Math.pow(Y, 2);

		root = Math.sqrt(square_add);

		DecimalFormat fmt = new DecimalFormat("0.###");

		System.out.print("Distance= " + fmt.format(root));

	}

}
