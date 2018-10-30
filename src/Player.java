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
		if (name != null && name.matches("^[a-zA-Z][a-zA-Z0-9.,_@-]+$")) {
			this.name = name;
		} else {
			throw new IllegalArgumentException("Nieprawidlowe imie");
		}

	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + "  :  " + name + "\n";

	}
}