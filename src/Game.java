
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author olek
 */
public class Game {

	protected Player player;
	protected Random rand = new Random(); // obiekt losujący
	protected List<Player> players = new ArrayList<>();

	/**
	 * 
	 * @param player
	 */
	public void addPlayer(Player player) {
		if(player!=null) {
		players.add(player);
	}else {
		throw new IllegalArgumentException("Gracz nie moze byc nullem");
	}
//		for (Player player : players) {
//			
//		}
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

				}
			}
		} while (oneMore);

	}

}
