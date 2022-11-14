package selectiontype;

import java.util.ArrayList;
import gamers.*;

import java.beans.Transient;
import java.util.*;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import competition.*;

import competition.League;


public class BestTwoTest {
  private  Competitor c1,c2,c3,c4,c5,c6,c7,c8,c9,c10;
  
  private  List <Competitor> competitors1;
  private  List <Competitor> competitors2;
  private SelectionInterface s;
  private List<List<Competitor>> res;

  
  @Before
  public void before() {
    this.competitors1 =new ArrayList<Competitor>();
    this.competitors2 =new ArrayList<Competitor>();
    this.c1 = new Competitor("LOSC");
	  this.c2 = new Competitor("RC LENS");
    this.c3=new Competitor("FC LIVERPOOL");
    this.c4=new Competitor("FC BAYERN");
    this.c5 = new Competitor("PSG");
    this.c6 = new Competitor("MANCHESTER");
    this.c7 = new Competitor("REAL");
    this.c8 = new Competitor("DORMUND");
    this.c9 = new Competitor("MILAN");
    this.c10 = new Competitor("JUVENTUS");

    this.competitors1.add(this.c1);
    this.competitors1.add(this.c2);
    this.competitors1.add(this.c3);
    this.competitors1.add(this.c4);
    this.competitors1.add(this.c5);

    this.competitors2.add(this.c6);
    this.competitors2.add(this.c7);
    this.competitors2.add(this.c8);
    this.competitors2.add(this.c9);
    this.competitors2.add(this.c10);

    this.s=new BestTwo();

    this.res=new ArrayList<List<Competitor>>();
    this.res.add(competitors1);
    this.res.add(competitors2);

  }


  @Test 
  public void testselection(){
    
    List <Competitor> finalists=new ArrayList<Competitor>();
    //check if the 2 groups have 4 competitors   
    assertTrue(this.competitors1.size()==5);
    assertTrue(this.competitors2.size()==5);
    finalists=this.s.selection(this.res);
    // we check if we have 4 finalist after picking each leader of the 2 groups 
    assertEquals(finalists.size(),4);
    
    // check if the first and the second competitors in finalists come from competitors1 but the third and the forth come from competitors2
    assertTrue(finalists.get(0).getName().equals(c1.getName()) || finalists.get(0).getName().equals(c2.getName()) || finalists.get(0).getName().equals(c3.getName()) || finalists.get(0).getName().equals(c4.getName()) || finalists.get(0).getName().equals(c5.getName()));
    assertTrue(finalists.get(1).getName().equals(c1.getName()) || finalists.get(1).getName().equals(c2.getName()) || finalists.get(1).getName().equals(c3.getName()) || finalists.get(1).getName().equals(c4.getName()) || finalists.get(1).getName().equals(c5.getName()));
    
    assertTrue(finalists.get(2).getName().equals(c6.getName()) || finalists.get(2).getName().equals(c7.getName()) || finalists.get(2).getName().equals(c8.getName()) || finalists.get(2).getName().equals(c9.getName()) || finalists.get(2).getName().equals(c10.getName()));
    assertTrue(finalists.get(3).getName().equals(c6.getName()) || finalists.get(3).getName().equals(c7.getName()) || finalists.get(3).getName().equals(c8.getName()) || finalists.get(3).getName().equals(c9.getName()) || finalists.get(3).getName().equals(c10.getName()));
    

  }
}
