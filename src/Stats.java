import java.util.HashMap;
import java.util.Map;


public class Stats {
	protected static Map<String, Integer> stats = new HashMap<String, Integer>();

	public void showStats() {
		for (String name:stats.keySet()) {
			System.out.println(name+":"+stats.get(name));
		}
	}

	public void playerWinner(String name) {
		int score = stats.getOrDefault(name, 0);
		++score;
		stats.put(name, score);
	}

	public void deleteStats() {
		stats.clear();
	}
}
