import java.util.Scanner;

public class consoleApplication {

	public static void main(String[] args) {
		Player player1 = new Player("mowlid");
		Player player2 = new Player("jack");
		SkunkApp game = new SkunkApp(player1, player2);
		Scanner scanner = new Scanner(System.in);
		
		println("welcome to SkunkGame:");
		while(!game.isOver()){
			println(" it is: " + game.currentPlayer().getName() + "'s turn");
			println("press Enter to go on");
			String line = scanner.nextLine();
			if (line.startsWith("!")){
				player1.setscore(100);
			}
			game.endTurn();
		}
		println("Game over! the winner is" + game.getWinner().getName());
	}
	private static void println(String s){
		System.out.println(s);
	}

}
