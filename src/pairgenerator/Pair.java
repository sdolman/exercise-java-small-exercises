package pairgenerator;

public class Pair {

	private final String driver;
	private final String navigator;

	public Pair(String driver, String navigator) {
		this.driver = driver; // created field
		this.navigator = navigator;
	}

	@Override
	public int hashCode() {
		return driver.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof Pair))
			return false;
		Pair other = (Pair) obj;
		return driver.equals(other.driver) && navigator.equals(other.navigator);
	}

	@Override
	public String toString() {
		return String.format("Pair with driver '%s' and navigator '%s'", driver, navigator);
	}

	
}
