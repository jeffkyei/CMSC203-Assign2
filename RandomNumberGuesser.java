/*
 * Class: CMSC203 
 * Instructor: Ahmed Tarek
 * Description: Random Number Guesser
 * Due: 2/23/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Jeffrey Kyei-Asare
*/

package jeffreykyeiasare;

import java.util.Scanner;

public class RandomNumberGuesser {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //Create scanner object
		String playAgain = "";
		do {
			int highGuess = 99; //high bound
			int lowGuess = 0; //lower bound
			int randNum = RNG.rand(); //Get random numbers
			System.out.println("Welcome to the random number guesser!");//Welcome user
			System.out.println("Enter your first guess: "); //Get first guess
			int nextGuess = sc.nextInt(); //Take in input
			sc.nextLine();
			System.out.println("Your number of guesses is 1"); 
			if (RNG.inputValidation(nextGuess, lowGuess, highGuess) == true) {
				
				do {
					if(nextGuess == randNum) {}
					
					else if(nextGuess < randNum) {
						System.out.println("Your guess is too low");
						lowGuess = nextGuess; //reset lowGuess
						System.out.println("Enter your next guess between: " + lowGuess + " and " + highGuess); //
						
						nextGuess = sc.nextInt();
						sc.nextLine();
						System.out.println(nextGuess);
						
						if(!RNG.inputValidation(nextGuess, lowGuess, highGuess)) {
							nextGuess = sc.nextInt();
							sc.nextLine();
						}
					}
					else if (nextGuess > randNum) {
						System.out.println("Your guess is too high");
						highGuess = nextGuess; //reset nextGuess
						System.out.println("Enter your next guess between: " + lowGuess + " and " + highGuess);
						nextGuess = sc.nextInt();
						System.out.println(nextGuess);
						
						if(!RNG.inputValidation(nextGuess, lowGuess, highGuess)) {
							nextGuess = sc.nextInt();
							sc.nextLine();
						}
					}
					
					System.out.println("Number of guesses is: " + RNG.getCount());
				} while(nextGuess != randNum);
				
				if(nextGuess==randNum) {
					System.out.println("Congratulations, you guessed correctly");
					System.out.println("Try again? (y or n)");
					playAgain = sc.nextLine();
					RNG.resetCount();
				}
			}
		}while (playAgain.equals("y"));
		
		System.out.println("Thanks for playing");
		System.out.println("Programmer name: Jeffrey Kyei-Asare");
	
		
	}
}
