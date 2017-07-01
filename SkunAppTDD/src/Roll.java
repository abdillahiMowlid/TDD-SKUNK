
public class Roll {
	
	private int lastTotal;
	
	public Roll() {
		this.lastTotal = rollDie() + rollDie();
	}

	private int rollDie() {
		return (int) Math.random() * 6 + 1;
	}

	public int getLastTotal() {
		return this.lastTotal;
	}
}
