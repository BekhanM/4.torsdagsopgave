import java.util.Scanner;

public class Main 
{
public static void main(String [] args) {
	System.out.print("Please type your name, bro: ");

	Scanner scanner = new Scanner(System.in);

	String name = scanner.nextLine();

	System.out.println("Wow! " + name + ", bro? That's a beautiful name, bro!");

	System.out.print("How old are you, bro?: ");

	int age = scanner.nextInt();

	System.out.println("Damn, bro. " + age + "? Already? You getting kinda old, bro.");

	int retirement = 67 - age;

	System.out.println("P.S. You got " + retirement + " years until retirement. If you lowkey live that far, bro.");

}

}