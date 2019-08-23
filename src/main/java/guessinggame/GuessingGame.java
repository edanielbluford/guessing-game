package guessinggame;

import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		System.out.println("Welcome to the guessing game");
		System.out.println("Make a guess:");

		Scanner input = new Scanner(System.in);
		int winningNumber = 7;
		int guess = input.nextInt();
		int guessCount = 0;
		while (guess != -1 && guessCount < 2) {
			if (guess == 0) {
				System.out.println("Try to guess the number. Pick a number between 1-10");
			} else if (guess != winningNumber) {
				System.out.println("Wrong answer.");
				if (guessCount == 0) {
					System.out.println("You get one more guess!");
				}
				guessCount++;
			}
			if (guess == winningNumber) {
				System.out.println("You win!!!!");
				break;
			}
			if (guessCount < 2) {
				guess = input.nextInt();
			}
		}
		System.out.println("Thanks for playing!");
	}

}
