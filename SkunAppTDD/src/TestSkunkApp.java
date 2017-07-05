
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class TestSkunkApp {
	
	private SkunkApp game;
	private Player player1;
	private Player player2;
	
	@Before
	public void setUp() {
		this.player1 =new Player();
		this.player2= new Player();
		this.game = new SkunkApp(player1, player2);
	}
	
	@Test
	public void testGetPlayerInfo() {
		this.game.getPlayerInfo();
		assertEquals(2, this.game.getNumberOfPlayers());
		assertEquals("Player 1", this.game.getPlayerName(1));
		assertEquals("Player 2", this.game.getPlayerName(2));
	}
	
	@Test
	public void canCreateRoll() {
		Roll roll = new Roll();
		assertTrue(roll.getLastTotal() <= 12);
		assertTrue(roll.getLastTotal() >= 2);
	}
	
	@Test
	public void CurentPlayerIsPlayer1(){
		assertEquals(player1, game.currentPlayer());
	}
	@Test
	public void CurentPlayer_FirstTurnEnd(){
		game.endTurn();
		assertEquals(player2, game.currentPlayer());
	}
	@Test
	public void isOver_startofthegame(){
		assertFalse(game.isOver());
	}
	@Test
	public void isOver_playerHas100Points(){
		player1.setscore(100);
		game.endTurn();
		assertTrue(game.isOver());
	}
	}
