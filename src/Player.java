
public abstract class Player {
	private String name = "Default";

	public Player() {
		
	}

	public Player(String name) {
		setName(name);

	}

abstract public int guess();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name != null && !name.isEmpty()) {
		this.name = name;
		}
	}
}