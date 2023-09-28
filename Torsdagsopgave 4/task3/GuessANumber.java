import java.util.Random;
import java.util.Scanner;  


public class GuessANumber {
	private static int rnd_number;

	
    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println(rnd_number);
        System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
		System.out.println( "Can you guess what it is?...");
        makeAGuess();
 	}


    private static void makeAGuess() {
		Scanner scanner = new Scanner(System.in); 	 
    	int input = scanner.nextInt();
    	
        if(input == rnd_number) {
            System.out.println("Nice. The Number was "+ rnd_number);
        }

        else if(input < rnd_number) {
            System.out.println("Too low bro, try again.");
            makeAGuess();
        }

        else if(input > rnd_number) {
            System.out.println("Too high bro, try again.");
            makeAGuess();
        }

        else if(input != rnd_number) {
            makeAGuess();
        }
    }
}