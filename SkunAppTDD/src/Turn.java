
public class Turn {

	private int score=0;
	private FixedValueDice die1;
	private FixedValueDice die2;
	public Turn(FixedValueDice die1, FixedValueDice die2) {
		this.die1 = die1;
		this.die2=die2;
	
	}

	public int getScore() {
		
		return score;
	}

	public void roll() {
		score+=die1.getValue()+ die2.getValue();
		
		
	}

}
