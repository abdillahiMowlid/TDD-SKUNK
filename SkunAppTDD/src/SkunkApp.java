
public class SkunkApp {
	
	private int numberOfPlayers;
	private String[] playerNames;

	public void getPlayerInfo() {
		numberOfPlayers = 2;
		this.playerNames = new String[this.numberOfPlayers];
		this.playerNames[0] = "Player 1";
		this.playerNames[1] = "Player 2";
	}
	
	public int getNumberOfPlayers() {
		return numberOfPlayers;
	}

	public String getPlayerName(int playerNum) {
		return this.playerNames[playerNum - 1];
	}
}
