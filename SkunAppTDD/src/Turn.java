
public class Turn {

	private int score;
	private Dice dice;
	private Player player;
	private final int SKUNK = 2;
	private boolean isOVer = false;
	
	public Turn(Player player, Dice dice) {
		this.player=player;
		this.dice=dice;
	}

	public int getScore() {
		return score;
	}

	public int roll() {
		int roll = dice.rollDie1()+dice.rollDie2();
		if (roll <= SKUNK){
			score = 0;
			isOVer = true;
		}else{
		score+=roll;
		}
		return roll;
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

	public boolean IsOver() {
		return isOVer;
	}

}
