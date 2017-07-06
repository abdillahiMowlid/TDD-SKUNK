import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class testTurn {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void getScore_startsZero() {
		Turn turn = new Turn();
		assertEquals(0, turn.getScore());
		
	}

}
