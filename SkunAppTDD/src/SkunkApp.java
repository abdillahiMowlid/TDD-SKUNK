
public class SkunkApp {
	private static final Roll DICE = new Roll();
	private static final int POINTS_TO_WIN = 100;
	private int numberOfPlayers;
	private String[] playerNames;
	private Player player1;
	private Player player2;
	private boolean isOver= false;
	private Player winner;

	private Turn turn;
	

	public SkunkApp(Player player1, Player player2) {
		this.player1= player1;
		this.player2=player2;
		this.turn = new Turn(player1, DICE);
	}

	//public void getPlayerInfo() {
	//	numberOfPlayers = 2;
		//this.playerNames = new String[this.numberOfPlayers];
		//this.playerNames[0] = "Player 1";
		//this.playerNames[1] = "Player 2";
	//}
	
	public int getNumberOfPlayers() {
		return numberOfPlayers;
	}

	public String getPlayerName(int playerNum) {
		return this.playerNames[playerNum - 1];
	}

	public Player currentPlayer() {
		return turn.getPlayer();
		
	}

	public void endTurn() {
		turn.end();
		if(currentPlayer().getScore() >= POINTS_TO_WIN){
			this.winner=currentPlayer();
			this.isOver= true;
		}
		turn = new Turn(nextPlayer(), DICE);
			
	}

	private Player nextPlayer() {
		return currentPlayer().equals(player1) ? player2: player1;
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

	public void roll() {
		turn.roll();
		
	}

	public Turn currentTurn() {
		// TODO Auto-generated method stub
		return turn;
	}
}
