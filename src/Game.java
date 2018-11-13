import java.util.Random;
import java.util.Scanner;

public class Game {
	@SuppressWarnings("unused")
	private static Scanner choose;
	protected Player player;
	protected Random rand = new Random();

	public void addPlayer(Player player) {
		this.player = player;
//		player = new PlayerHuman(new GUIInput());
//		Player player = null;

//		System.out.println("Who's the Player?\n\t1. Human\n\t2. Computer\n");

//		choice = choose.nextInt();
//		if(choice == 1) player = new PlayerHuman();
//		else if (choice == 2) player = new PlayerComputer();
//		

//		TextInput in;
//		System.out.println("What's the type of input?\n\t1. Console\n\t2. GUI\n");
//		int choice = choose.nextInt();
//		if(choice == 1)	player(new ConsoleInput());
//		else if (choice == 2)	player(new GUIInput());
	}

	public void play() {

		int cube;
		choose = new Scanner(System.in);

		try {
			player.askForName();

			// player.setName("Ziutek");
			int guess;
			do {
				cube = rand.nextInt(6) + 1;
				guess = player.guess();

				if (guess != cube)
					System.out.println(
							"Wrong " + player.getName() + "! Value of Cube = " + cube + " and Your guess = " + guess);
				else
					System.out.println("\nWell done " + player.getName() + "! You're right!");

			} while (guess != cube);
		}
//		catch (IllegalArgumentException e){
//			System.err.println("\nWrong name human :/\n");
//			//player.setName(choose.nextLine());
//		}
		catch (Exception e) {
			System.out.println("\nError." + player.toString());
		}
	}
}
