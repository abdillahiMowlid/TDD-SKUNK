
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class TestSkunkApp {
	
	private SkunkApp game;
	
	@Before
	public void setUp() {
		this.game = new SkunkApp();
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
}