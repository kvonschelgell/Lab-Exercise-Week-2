import java.util.Scanner;
import java.util.Random;

public class AgeGuess3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int ageGuess;
		String firstname;

		System.out.print("What is your first name?");
		firstname = input.next();

		Random gen = new Random();
		int age;
		age = gen.nextInt(101);

		System.out.print("Hey " + firstname + "!" + " Guess my Age! Enter Guess: ");

		ageGuess = input.nextInt();

		// Part A
		if (ageGuess != age) {

			System.out.print("You guessed wrong!!");

		// Part B
		if (ageGuess > age)
			System.out.println(" Younger!");
		else if (ageGuess < age)
			System.out.println(" Older!");
		else
			System.out.println("Congrats! You guessed my age!");

	}

}
