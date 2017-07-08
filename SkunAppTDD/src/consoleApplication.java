import java.util.Scanner;

public class consoleApplication {
	private static Player player1 = new Player("mowlid");
	private static Player player2 = new Player("jack");
	private static SkunkApp game = new SkunkApp(player1, player2);
	private static Scanner scanner= new Scanner(System.in);

	public static void main(String[] args) {
		println("welcome to SkunkGame:");
		while(!game.isOver()){
			playOneTurn();
		}
		printScores();
		println("Game over! the winner is" + game.getWinner().getName());
	}
	private static void playOneTurn() {
		while(!game.currentTurn().IsOver()){
		printScores();
		println(" it is: " + game.currentPlayer().getName() + "'s turn");
		println("This turn's score is" + game.currentTurn().getScore());
		println("press enter to roll, q to end turn");
		String line = scanner.nextLine();
		if (line.startsWith("q")){
			game.bankAndEndTurn();
		} else{
			int roll = game.roll();
			println(" your rolled:" + roll);
		}
		
	}
	if(!game.isOver()){
		game.startNextTurn();
	}
	}
	private static void printScores() {
		println(player1.getName() + "'sScore is" + player1.getScore());
		println(player2.getName() + "'sScore is" + player2.getScore());
		
	}
	private static void println(String s){
		System.out.println(s);
	}

}
