import java.util.Scanner;

public class PlayerHuman extends Player {

	private final Scanner input = new Scanner(System.in);;

	public PlayerHuman() {
	}

	public PlayerHuman(String name) {
		super(name);

	}

@Override
	public int guess() {
		int number;

		System.out.println("Enter the number from 1 to 6: ");
		number = input.nextInt();
		return number;
	}
}
