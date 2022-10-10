package competition;


import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import competition.Competition;
import gamers.Competitor;
import game.Match;
import java.util.*;

public abstract class CompetitionTest {

  protected  Competitor c1;
	protected  Competitor c2;
  protected  Competitor c3;
  protected  Competitor c4;
  protected  List <Competitor> competitors;
  protected Competition competition;
  
  protected abstract Competition createCompetition(List<Competitor> competitors);
  
  @Before
  public void before() {
    this.competitors =new ArrayList<Competitor>();
    this.c1 = new Competitor("LOSC");
		this.c2 = new Competitor("RC LENS");
    this.c3=new Competitor("FC LIVERPOOL");
    this.c4=new Competitor("FC BAYERN");
    this.competitors.add(this.c1);
    this.competitors.add(this.c2);
    this.competitors.add(this.c3);
    this.competitors.add(this.c4);

    this.competition = createCompetition(competitors);
  }


  @Test
  public void testPlayMatch(){
    this.before();
    
    assertTrue(this.competitors.size()==4);

    int nbMatchsBeforec1 = this.competition.getNbMatch(this.c1);
    int nbPointsBeforec1 = this.competition.getNbPoints(this.c1);
    int nbMatchsBeforec2 = this.competition.getNbMatch(this.c2);
    int nbPointsBeforec2 = this.competition.getNbPoints(this.c2);

    Competitor winner = this.competition.playMatch(c1,c2);

    if (winner.equals(c1)) {
      assertEquals(1,this.competition.getNbMatch(c1)-nbMatchsBeforec1);
      assertEquals(1,this.competition.getNbPoints(c1)-nbPointsBeforec1);
      assertEquals(1,this.competition.getNbMatch(c2)-nbMatchsBeforec2);
      assertEquals(this.competition.getNbPoints(c2),nbPointsBeforec2);

    }
    else {
      assertEquals(1,this.competition.getNbMatch(c1)-nbMatchsBeforec1);
      assertEquals(this.competition.getNbPoints(c1),nbPointsBeforec1);
      assertEquals(1,this.competition.getNbMatch(c2)-nbMatchsBeforec2);
      assertEquals(1,this.competition.getNbMatch(c2)-nbPointsBeforec2);
    }
  
  }

  @Test
  public void testPlay() {
    MockCompetition myMuck = new MockCompetition(competitors);
    assertEquals(0,myMuck.nb_called);
    try{
      myMuck.play(this.competitors);
      assertEquals(1,myMuck.nb_called);
    }
    catch (Exception e){
      System.out.println(e);
    }
    
  }


  @Test 
  public void testRanking(){
    this.before();
    int max=0;
    for (int x : this.competition.ranking().values()){
      if (x>max){
        max=x;
      }
    }
    Competitor res = this.competition.finalWinner();
    assertEquals(this.competition.getNbPoints(res),max);
  }

  
}