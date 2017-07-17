import java.util.Random;

public class Roll implements Dice {
	
	private static final Random RANDOM= new Random();
	
	//private int lastTotal;
	
	
	//public Roll() {
	//	this.lastTotal = rollDie1() + rollDie2();
	//}
	@Override
	public int rollDie1() {
		return RANDOM.nextInt(6)+1;
	}
	@Override
	public int rollDie2() {
		return RANDOM.nextInt(6)+1;
	}
	//public int getLastTotal() {
	//	return this.lastTotal;
	//}

	
	
}
