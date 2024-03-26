
import java.util.Scanner; //user input 
import java.util.Random; //generating random numbers
public class number {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();
	        
	        int MinRange= 1;
	        int MaxRange= 100; //range of number
	        int MaxAttempts = 7;
	        int score = 0;
	        boolean playAgain = true; // whether the player wants to play another round
	        
	        System.out.println("Welcome to the Number Guessing Game!\n");
	        
	        while (playAgain) { //This loop will keep running as long as the player wants to play again (playAgain is true).
	        	 
                 int targetNumber = (int)Math.floor(Math.random()*100)+1;
	             int attempts = 0;
	             boolean guessedCorrectly = false;//whether the user has guessed the correct number or not.
	             
	             System.out.println("Guess the number between " + MinRange + " and " + MaxRange + ".");
	             
	             while (attempts < MaxAttempts && !guessedCorrectly) {
	                 System.out.print("Enter your guess: ");
	                 int userGuess = scanner.nextInt();
	                 attempts++;
	                 
	                 if (userGuess == targetNumber) {
	                     System.out.println("Congratulations! You've guessed the correct number in " + attempts + " attempts.");
	                     score += (MaxAttempts - attempts); // Update the score based on the number of attempts
	                     guessedCorrectly = true;
	                 } else if (userGuess < targetNumber) {
	                     System.out.println("Your guess is too low. Please try again.");
	                 } else {
	                     System.out.println("Your guess is too high.Please try again.");
	                 }
	             }
	             
	             if (!guessedCorrectly) {
	                 System.out.println("Sorry, you've run out of attempts. The correct number was " + targetNumber + ".");
	             }
	             
	             System.out.println("Your score for this round is: " + (MaxAttempts - attempts));//here score is out of 10.
	             
	             System.out.print("Do you want to play again? (yes/no): ");
	             String playAgainResponse = scanner.next();
	             playAgain = playAgainResponse.equalsIgnoreCase("yes");
	         }
	         
	         System.out.println("Thankyou for playing! Your total score is " + score + ".");
	     }
}