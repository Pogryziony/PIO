import java.util.Random;

public class Player {
	private Random rand = new Random();
	private String name = "Default";

	public Player() {}

	public Player(String name) {
		setName(name);

	}

	public int guess() {
		int value = 0;

		value = rand.nextInt(6) + 1;

		return value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}