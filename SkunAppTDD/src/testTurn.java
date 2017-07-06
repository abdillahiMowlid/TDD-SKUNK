import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class testTurn {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void getScore_startsZero() {
		Turn turn = new Turn(new FixedValueDice(3), new FixedValueDice(3));
		assertEquals(0, turn.getScore());
		
	}
	@Test
	public void roll_modifiesScoreByRollmount(){
		Turn turn = new Turn(new FixedValueDice(3), new FixedValueDice(3));
		turn.roll();
		assertEquals(6, turn.getScore());
	}

}
