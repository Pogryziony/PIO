import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Random rand = new Random();
		Player player = new PlayerHuman();
		try {
			player.setName("E2");
		} catch (Exception ex) {
			System.err.println("Error! Wrong name "+ player.toString());
		}

		int cube;

		// player.setName("Ziutek");

		int guess;
		do {
			cube = rand.nextInt(6) + 1;
			guess = player.guess();

			if (guess != cube)
				System.out.println(" Cube value = " + cube + " Your guess = " + guess);
			else
				System.out.println("\nWell done " + player.getName() + " you're right!");

		} while (guess != cube);
	}
}
