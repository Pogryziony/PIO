import java.util.Random;
public class PlayerComp extends Player {
	Random rand = new Random();
	public PlayerComp() {
	}

	public PlayerComp(String name) {
		super(name);
	}
	public int guess() {
		
		int value = 0;

		value = rand.nextInt(6) + 1;

		return value;
	}
}
