import java.util.Random;

public class Player {

	private Random rand = new Random();

	public int guess() {
		int value = 0;

		value = rand.nextInt(6) + 1;

		return value;
	}
}