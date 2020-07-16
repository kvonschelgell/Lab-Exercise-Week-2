import java.util.Scanner;
import java.util.Random;

public class UserNames {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("What is your first name? ");
		String F_name = input.next();

		System.out.print("What is your last name? ");
		String L_name = input.next();

		String F_initial, L_initials;

		F_initial = F_name.substring(0, 1);
		L_initials = L_name.substring(0, 4);

		//Random number 10-99
		Random generator = new Random();
		int num1;
		// range of a,b second digit is b-a
		num1 = 10 + generator.nextInt(89);

		System.out.print("Your username is: " + L_initials + F_initial + num1);

	}

}
