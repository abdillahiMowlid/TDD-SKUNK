import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class testTurn {

	private Player player;
	@Before
	public void setUp() throws Exception {
		this.player = new Player("test player");
	}

	@Test
	public void getScore_startsZero() {
		Turn turn = makeTurnWithFixedDiceValue(3);
		assertEquals(0, turn.getScore());
		
	}
	private Turn makeTurnWithFixedDiceValue(int value) {
		return new Turn(player, new FixedValueDice(value));
	}

	@Test
	public void roll_modifiesScoreByRollmount(){
		Turn turn =makeTurnWithFixedDiceValue(6);
		turn.roll();
		assertEquals(12, turn.getScore());
	}
	@Test
	public void roll_secondRollNonBust(){
		Turn turn = makeTurnWithFixedDiceValue(8);
		turn.setScore(6);
		turn.roll();
		assertEquals(22, turn.getScore());
	}
	@Test
	public void end_modifiesPlayerScore(){
		Turn turn = makeTurnWithFixedDiceValue(8);
		turn.setScore(10);
		turn.end();
		assertEquals(10, turn.getPlayer().getScore());
	}
	@Test
	public void rollOne_withTurnSumScoreTurnScoreBeomesZero(){
		Turn turn = makeTurnWithFixedDiceValue(1);
		turn.setScore(10);
		turn.roll();
		assertEquals(0, turn.getScore());
	}
}
