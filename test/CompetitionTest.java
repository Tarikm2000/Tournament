/* 
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public abstact class CompetitionTest {

  protected Competition c1; 

  @Before
  public void before() {

    Competitor team1 = new Competitor ("RealMadrid",0,0);
    Competitor team2 = new Competitor ("Barcelone",0,0);
    Competitor team3 = new Competitor ("AtleticoMadrid",0,0);
    Competitor team4 = new Competitor ("Seville",0,0);

    List<Competitor> l = new ArrayList<Competitor>();
    l.add(team1);
    l.add(team2);
    l.add(team3);
    l.add(team4);


  }


  public void testPlayMatch() {
    
    team1.playMatch(team2);
    assertEquals(1,team1.getPoints());
    assertEquals(1,team1.getWins());
    assertEquals(0,team2.getPoints());
    assertEquals(0,team2.getWins());

    team1.playMatch(team3);
    assertEquals(1,team1.getPoints());
    assertEquals(1,team1.getWins());
    assertEquals(1,team3.getPoints());
    assertEquals(1,team3.getWins());

    team2.playMatch(team4);
    assertEquals(1,team2.getPoints());
    assertEquals(1,team2.getWins());
    assertEquals(0,team4.getPoints());
    assertEquals(0,team4.getWins());

  }

  
    





}*/