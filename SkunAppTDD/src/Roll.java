
public class Roll {
	
	private int lastTotal;
	
	public Roll() {
		this.lastTotal = rollDie1() + rollDie2();
	}

	private int rollDie1() {
		return (int) Math.random() * 6 + 1;
	}
	private int rollDie2() {
		return (int) Math.random() * 6 + 1;
	}
	public int getLastTotal() {
		return this.lastTotal;
	}
}
