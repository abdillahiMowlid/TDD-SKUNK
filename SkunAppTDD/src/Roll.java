
public class Roll implements Dice {
	
	//private int lastTotal;
	
	
	//public Roll() {
	//	this.lastTotal = rollDie1() + rollDie2();
	//}
	@Override
	public int rollDie1() {
		return (int) Math.random() * 6 + 1;
	}
	@Override
	public int rollDie2() {
		return (int) Math.random() * 6 + 1;
	}
	//public int getLastTotal() {
	//	return this.lastTotal;
	//}

	
	
}
