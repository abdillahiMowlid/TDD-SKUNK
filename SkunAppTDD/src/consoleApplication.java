import java.util.Scanner;

public class consoleApplication {

	public static void main(String[] args) {
		Player player1 = new Player("mowlid");
		Player player2 = new Player("jack");
		SkunkApp game = new SkunkApp(player1, player2);
		Scanner scanner = new Scanner(System.in);
		
		println("welcome to SkunkGame:");
		Turn turn = new Turn(player1, new Roll());
		while(!game.isOver()){
			println(player1.getName() + "'sScore is" + player1.getScore());
			println(player1.getName() + "'sScore is" + player1.getScore());
			println(" it is: " + game.currentPlayer().getName() + "'s turn");
			println("press Enter to roll");
			String line = scanner.nextLine();
			if (line.startsWith("q")){
				//player1.setscore(100);
				turn.roll();
			}
			game.endTurn();
		}
		println("Game over! the winner is" + game.getWinner().getName());
	}
	private static void println(String s){
		System.out.println(s);
	}

}
