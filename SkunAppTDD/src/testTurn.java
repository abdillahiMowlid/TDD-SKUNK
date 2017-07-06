import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class testTurn {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void getScore_startsZero() {
		Turn turn = new Turn(new FixedValueDice(3));
		assertEquals(0, turn.getScore());
		
	}
	@Test
	public void roll_modifiesScoreByRollmount(){
		Turn turn = new Turn(new FixedValueDice(6));
		turn.roll();
		assertEquals(12, turn.getScore());
	}
	@Test
	public void roll_secondRollNonBust(){
		Turn turn = new Turn(new FixedValueDice(8));
		turn.setScore(6);
		turn.roll();
		assertEquals(22, turn.getScore());
	}
}
