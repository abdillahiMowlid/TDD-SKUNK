
public class Turn {

	private int score;
	private Dice dice;
	private Player player;
	
	public Turn(Player player, Dice dice) {
		this.player=player;
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

	public void end() {
		this.player.setScore(player.getScore()+ this.score);
		
	}

	public Player getPlayer() {
		return player;
	}

}
