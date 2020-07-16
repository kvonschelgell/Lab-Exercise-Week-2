
public class FloatEqu {

	public static void main(String[] args) {

		double a, b, TOLERANCE;

		a = (1.0 / 10) * (1.0 / 10);
		b = (1.0 / 100);
		TOLERANCE = 0.000001;

		if (a == b)
			System.out.print("EQUAL");

		// part B for lab exercise 5
		if (Math.abs(a - b) < TOLERANCE)
			System.out.println("ESSENTIALLY EQUAL");
		else
			System.out.println("NOT EQUAL");

		System.out.println(a);
		System.out.print(b);
	}

}
