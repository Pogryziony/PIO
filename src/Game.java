
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 *
 * @author olek
 */
public class Game {

	protected Player player;
	protected Random rand = new Random(); // obiekt losujący
	protected static List<Player> players = new ArrayList<>();
	static Stats stats = new Stats();
	public Game() {
		
	}
	public Game(Stats stats) {
		this.stats = new Stats();
	}
	/**
	 * 
	 * @param player
	 */
	public void addPlayer(Player player) {
		if (player != null) {
			if (isPlayerNameInList(player)) {
				String name = player.getName();
				name += "@";
				player.setName(name);
				addPlayer(player);
			} else {
				players.add(player);

			}
		} else {
			throw new IllegalArgumentException("Gracz nie moze byc nullem");
		}
//		for (Player player : players) {
//			
//		}
	}

	private boolean isPlayerNameInList(Player player) {
		for (Player p : players) {
			if (p.getName().equals(player.getName())) {
				return true;
			}

		}
		return false;
	}

	void removePlayer(String name) {
		Iterator<Player> it = players.iterator();
		while (it.hasNext()) {
			Player p = it.next();
			if(p.getName().equals(name)) {
				it.remove();
			}
			
		}
	}
	void printPlayerList() {
		for (Player player : players) {
			System.out.println(player);
		}
	}

	/**
	 * 
	 */
	public void play() {
		int number, // wylosowana liczba
				guess; // propozycja (strzał) gracza

		boolean oneMore = true;
		do {
			System.out.println("---------------------");

			number = rand.nextInt(6) + 1;
			System.out.println("Kostka: " + number);

			for (Player player : players) {
				guess = player.guess();

				System.out.println("Gracz " + player.getName() + ": " + guess);

				if (number != guess) {
					System.out.println("PUDŁO!");
				} else {
					oneMore = false;
					System.out.println("BRAWO!");
					stats.playerWinner(player.getName());

				}
			}
		} while (oneMore);

	}

}
