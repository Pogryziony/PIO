import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
//		Game game = new Game();
//		game.addPlayer(new PlayerComp(new GUIInput()));
//		game.play();
		
		List<String> list = new ArrayList<String>();
		list.add("raz");
		list.add("dwa");
		list.add("trzy");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		for (String s : list) {
			System.out.println(s);
		}
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
	}
}
// trzecia wersja iterowania po liscie i jawne iterowanie.
//https://regex101.com/
