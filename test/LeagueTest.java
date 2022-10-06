
import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.*;

import org.junit.Before;

import competition.League;
import gamers.Competitor;

public class LeagueTest{
    private static Competitor c1;
	private static Competitor c2;
    private static Competitor c3;
	private static League league;
    private static List <Competitor> competitors;
	
	@Before
	public  void before() {
        competitors =new ArrayList<Competitor>();
		c1 = new Competitor("LOSC");
		c2 = new Competitor("RC LENS");
        c3=new Competitor("FC LIVERPOOL");
        competitors.add(c1);
        competitors.add(c2);
        competitors.add(c3);
		league = new League(competitors);

	}
    
    @Test
    public void playTest(){
        league.play(competitors);
        //check if all teams played 4 gams 
        assertEquals(league.getNbMatch(c1),4);
        assertEquals(league.getNbMatch(c2),4);
        assertEquals(league.getNbMatch(c3),4);
    }







}