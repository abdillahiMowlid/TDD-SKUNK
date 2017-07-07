import java.util.Scanner;

public class consoleApplication {
	private static Player player1 = new Player("mowlid");
	private static Player player2 = new Player("jack");
	private static Scanner scanner= new Scanner(System.in);

	public static void main(String[] args) {
		SkunkApp game = new SkunkApp(player1, player2);
		println("welcome to SkunkGame:");
		while(!game.isOver()){
			playOneTurn(game);
		}
		printScores();
		println("Game over! the winner is" + game.getWinner().getName());
	}
	private static void playOneTurn(SkunkApp game) {
		printScores();
		println(" it is: " + game.currentPlayer().getName() + "'s turn");
		println("This turn's score is" + game.currentTurn().getScore());
		println("press enter to roll, q to end turn");
		String line = scanner.nextLine();
		if (line.startsWith("q")){
			game.endTurn();
		} else{
			game.roll();
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
