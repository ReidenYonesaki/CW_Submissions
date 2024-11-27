/*
 * this will import the scanner
 */
import java.util.Scanner;
/*
 * This is a submission to the wordle assignment
 */
public class WordleGame {
/*
 * These are the data attributes to the Wordle game
 */
	static Scanner myReader = new Scanner(System.in);
	static String userInput;
	static String solution = "camel";
	public static void main(String[] args) {
		
			startGame();
	}
/*
 * This will start the game
 */
	public static void startGame()
	{
		System.out.println("Type a 5 letter word");
		userInput = myReader.nextLine();
		while (!userInput.equals(solution))
		{
			checkPlayer();
		}
		System.out.print("You won ");
		System.out.print("The solution was " + solution);
	}
	
	/*
	 * This will check if the guess is 5 letters long and has no repeating letters. Then it will print out the users guess
	 */
	public static void checkPlayer()
	{
		if (userInput.length() != 5 && checkRepeating(userInput))
		{
			System.out.println("Make a new Guess");
			userInput = myReader.nextLine();
		}
		for (int i=0; i < userInput.length();i++)
		{
			if (userInput.charAt(i) == solution.charAt(i)) 
			{
				System.out.print(userInput.charAt(i));
			}
			else if (solution.indexOf(userInput.charAt(i)) !=-1)
			{
				System.out.print("?");
			}
			else
			{
				System.out.print("x");
			}
		}
		userInput = myReader.nextLine();
	
	}
	/*
	 * This will check if there will be repeating letters inside of the word
	 */
	public static boolean checkRepeating(String str)
	{
		for (int i=0; i < str.length();i++)
		{
			for (int j=i; j < str.length();j++)
			{
				if(i == j)
				{
					
				}
				else if (str.charAt(i) == str.charAt(j))
				{
					return true;
				}
			}
		}
		return false;
	}
}
