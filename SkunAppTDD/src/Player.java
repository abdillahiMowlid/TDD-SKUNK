
public class Player {

	public int score;
	private final String name;
	
	public Player(String name) {
		this.name=name;
	}
	public void setScore(int score) {
		this.score = score;
		
	}
	public int getScore(){
	return this.score;
	}
	public String getName() {
		return name;
	}
}
