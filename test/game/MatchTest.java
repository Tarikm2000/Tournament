package game;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

import game.Match;
import gamers.Competitor;

public class MatchTest{
	
	private static Competitor c1;
	private static Competitor c2;
	private static Match m;
	
	@Before
	public  void before() {
		c1 = new Competitor("LOSC");
		c2 = new Competitor("RC LENS");
		m = new Match(c1,c2);
	}
	
	@Test
	public void chooseWinnerTest() {
		Competitor winner = m.winner();
		assertTrue(winner.equals(c1) || winner.equals(c2));
	}





   
}