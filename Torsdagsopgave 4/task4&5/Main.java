import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main (String [] args) {

		ArrayList <String> actions = new ArrayList <>();
		GameMenu gameMenu = new GameMenu(actions);
		Scanner scanner = new Scanner(System.in);

		actions.add("1) Start game");
		actions.add("2) Resume game");
		actions.add("3) Pause game");
		actions.add("4) End game");

		//System.out.print(actions.get(2));

		//gameMenu.displayMenu();

		String userChoice =  gameMenu.getAction();
		int choice = Integer.parseInt(userChoice);

	gameMenu.doAction(choice);

	}

}