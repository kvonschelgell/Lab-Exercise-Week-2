import java.util.Scanner;
import java.util.Random;

public class AgeGuess {

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

		if (ageGuess > age) {
			System.out.println(
					"Sorry, that is incorrect. Your guess was: " + ageGuess + "\nThe correct answer is: " + age);
		} else if (ageGuess < age) {
			System.out.println(
					"Sorry, that is incorrect. Your guess was: " + ageGuess + "\nThe correct answer is: " + age);
		} else
			System.out.println("Congrats! You guessed my age!");

	}

}
