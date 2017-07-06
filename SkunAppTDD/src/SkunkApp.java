
public class SkunkApp {
	
	private static final int POINTS_TO_WIN = 100;
	private int numberOfPlayers;
	private String[] playerNames;
	private Player player1;
	private Player player2;
	private Player current;
	private boolean isOver= false;
	private Player winner;

	

	public SkunkApp(Player player1, Player player2) {
		this.player1= player1;
		this.player2=player2;
		this.current= player1;
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
		return current;
		
	}

	public void endTurn() {
		if(this.current.getScore() >= POINTS_TO_WIN){
			this.winner=this.current;
			this.isOver= true;
		}
		this.current= this.current.equals(player1) ? player2: player1;		
	}

	public boolean isOver() {
		return isOver;
		
	}

	public Player getWinner() {
		if(!isOver){
			throw new IllegalStateException("the Game is not Over");
		} else{
		}
		return winner;
	}
}
