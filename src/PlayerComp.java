import java.util.Random;

public class PlayerComp extends Player {
	private final Random rand = new Random();

	public PlayerComp(TextInput in) {
		super(in);
	}

	public PlayerComp(TextInput in, String name) {
		super(in, name);
	}

	public int guess() {
		int value = 0;

		value = rand.nextInt(6) + 1;

		return value;

	}
}
