import java.util.ArrayList;
import java.util.Scanner;

public class GameMenu {
	private ArrayList<String> actions;
	Scanner scanner = new Scanner(System.in);

	public GameMenu(ArrayList<String> actions) {
		this.actions = actions;
	}

	public void displayMenu() {
		System.out.println(actions);
	}

	public String getAction() {
		System.out.println("Type a number to choose an action, bro");
		displayMenu();
		String choice = scanner.nextLine();
		return choice;
	}

	public static void doAction(int choice) {
		switch (choice) {
            case 1:
                System.out.println("Starting the game now");
                break;
            case 2:
                System.out.println("Fetching previously saved game data");
                break;
            case 3:
                System.out.println("Game paused");
                break;
            case 4:
                System.out.println("Ending game");
                break;
            default:
                System.out.println("Invalid choice. Please select a valid option.");
        }
	 }

}