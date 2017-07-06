
public class Turn {

	private int score;
	private Dice dice;
	
	public Turn(Dice dice) {
		this.dice=dice;
	}

	public int getScore() {
		
		return score;
	}

	public void roll() {
		score+=dice.rollDie1()+dice.rollDie2();
	}

	void setScore(int score) {
		this.score=score;	
	}

}
