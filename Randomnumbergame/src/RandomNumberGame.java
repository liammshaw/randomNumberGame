import java.util.Scanner;
public class RandomNumberGame
	{
		static Scanner userInput = new Scanner(System.in);
		static int numberOfGuesses = 0;
		static int numberRange = 0;
		static boolean guessing = false;
		static boolean wantToPlayAgain = true;
//Testing to see if github works 
		public static void main(String[] args)
			{
				greetPlayer();
				while (wantToPlayAgain == true)
					{
						chooseDifficulty();
						if (wantToPlayAgain == true)
							{
								int secretNumber = (int)(Math.random()*numberRange)+1;
								System.out.println("Please guess a number between 1-" + numberRange);
								while (guessing == false )
									{
										int userGuess = userInput.nextInt();
										numberOfGuesses++;
										if (userGuess == secretNumber)
											{
												if (numberOfGuesses == 1)
													{
														System.out.println("You must have cheated you got it in 1 try");
													}
												else if(numberOfGuesses > 1 && numberOfGuesses < 10)
													{
														System.out.println("Congrats you got it in " + numberOfGuesses +" tries");
													}
												else
													{
														System.out.println("Congrats it only took you " + numberOfGuesses + "tries");
													}
												System.out.println("Would you like to play again? Enter 1 for yes and 2 for no");
												int playAgain = userInput.nextInt();
												if (playAgain == 1) 
													{
														wantToPlayAgain = true;
													}
												else if (playAgain == 2)
													{
														wantToPlayAgain = false;
													}
												else 
													{
														System.out.println("I guess you just didn't like the game");
														wantToPlayAgain = false;
													}
												guessing = true;
									
											}
										else if (userGuess > secretNumber)
											{
												System.out.println("Too high, try again");	
											}
										else
											{
												System.out.println("Too low, try again");	
											}
									}
							}
					}
			}
		public static void greetPlayer() 
			{
				System.out.println("Hello! Welcome to the random number game! Lets start with your name?");
				String userName = userInput.nextLine();
				System.out.println("Okay " + userName + " are you ready for the challenge?");
				System.out.println("Yes or No");
				String areYouReady = userInput.nextLine();
				if (areYouReady == "no" || areYouReady == "No")
					{
						System.out.println("Why " + userName + "are you chicken?");
					}
				else 
					{
						System.out.println("Best of Luck to you");
					}
			}
		public static void chooseDifficulty() 
			{
				System.out.println("Alright it's time, lets play. To start what difficulty do you want?");
				System.out.println("type 1 for easy, 2 for medium, and 3 for hard");
				int userDifficulty = userInput.nextInt();
				if (userDifficulty == 1) 
					{
						numberRange = 10;
					}
				else if (userDifficulty == 2)
					{
						numberRange = 25;									}
				else if (userDifficulty == 3)
					{
						numberRange = 100;
					}
			}
	

	}
