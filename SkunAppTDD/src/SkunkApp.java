
public class SkunkApp {
	
	private int numberOfPlayers;
	private String[] playerNames;
	private Player player1;
	private Player player2;

	

	public SkunkApp(Player player1, Player player2) {
		this.player1= player1;
		this.player2=player2;
	}

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

	public Player currentPlayer() {
		return player1;
		
	}
}
