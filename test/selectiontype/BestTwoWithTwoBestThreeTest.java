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


public class BestTwoWithTwoBestThreeTest {
  private  Competitor c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16;

  private  List <Competitor> competitors1;
  private  List <Competitor> competitors2;
  private  List<Competitor> competitors3;
  private SelectionInterface s;
  private List<League> res;

  @Before
  public void before() {
    this.competitors1 =new ArrayList<Competitor>();
    this.competitors2 =new ArrayList<Competitor>();
    this.competitors3 =new ArrayList<Competitor>();
    this.c1 = new Competitor("LOSC");
	  this.c2 = new Competitor("RC LENS");
    this.c3 = new Competitor("FC LIVERPOOL");
    this.c4 = new Competitor("FC BAYERN");
    this.c5 = new Competitor("PSG");
    this.c6 = new Competitor("MANCHESTER");
    this.c7 = new Competitor("REAL");
    this.c8 = new Competitor("DORMUND");
    this.c9 = new Competitor("MILAN");
    this.c10 = new Competitor("JUVENTUS");
    this.c11 = new Competitor("ROMA");
    this.c12 = new Competitor("OL");
    this.c13 = new Competitor("OM");
    this.c14 = new Competitor("WESTHAM");
    this.c15 = new Competitor("ATLANTA");
    this.c16 = new Competitor("EVERTON");

    this.competitors1.add(this.c1);
    this.competitors1.add(this.c2);
    this.competitors1.add(this.c3);
    this.competitors1.add(this.c4);
    this.competitors1.add(this.c5);
    this.competitors1.add(this.c6);

    this.competitors2.add(this.c7);
    this.competitors2.add(this.c8);
    this.competitors2.add(this.c9);
    this.competitors2.add(this.c10);
    this.competitors2.add(this.c11);
    
    this.competitors3.add(this.c12);
    this.competitors3.add(this.c13);
    this.competitors3.add(this.c14);
    this.competitors3.add(this.c15);
    this.competitors3.add(this.c16);


    this.s=new BestTwoWithTwoBestThree();
    this.res=new ArrayList<League>();
    this.res.add(new League(competitors1));
    this.res.add(new League (competitors2));
    this.res.add(new League (competitors3));

    }


  @Test
  public void testselection(){
    List <Competitor> finalists=new ArrayList<Competitor>();
    //verifier la partition des groupes
    assertTrue(this.competitors1.size()==6);
    assertTrue(this.competitors2.size()==5);
    assertTrue(this.competitors3.size()==5);

    finalists=this.s.selection(this.res);
    //verifier qu'on a pris de chaque groupe les 2 meilleurs ; on aura une liste de 6 teams   
    //en rajoutant a la fin les deux meilleurs troisième parmi tous les groupes alors  
    //on aura une liste de 8 teams
    assertEquals(8,finalists.size());


    // on verifie que les deux premiers dans finalists sont des elements de competitors1 ,le 3 et le 4 eme sont des elements de competitors2 , le 4 et le 5 eme sont des elements de competitors3 et pour les 6eme peut etre un element de competitors1 ou competitors2 ou competitors3 et le dernier sera un elemnet d'une des deux listes où il se trouve pas le 6eme element
    assertTrue(finalists.get(0).getName().equals(c1.getName()) || finalists.get(0).getName().equals(c2.getName()) || finalists.get(0).getName().equals(c3.getName()) || finalists.get(0).getName().equals(c4.getName()) || finalists.get(0).getName().equals(c5.getName()) || finalists.get(0).getName().equals(c6.getName()) );
    assertTrue(finalists.get(1).getName().equals(c1.getName()) || finalists.get(1).getName().equals(c2.getName()) || finalists.get(1).getName().equals(c3.getName()) || finalists.get(1).getName().equals(c4.getName()) || finalists.get(1).getName().equals(c5.getName()) || finalists.get(1).getName().equals(c6.getName()) );
    
    assertTrue(finalists.get(2).getName().equals(c7.getName()) || finalists.get(2).getName().equals(c8.getName()) || finalists.get(2).getName().equals(c9.getName()) || finalists.get(2).getName().equals(c10.getName()) || finalists.get(2).getName().equals(c11.getName()) );
    assertTrue(finalists.get(3).getName().equals(c7.getName()) || finalists.get(3).getName().equals(c8.getName()) || finalists.get(3).getName().equals(c9.getName()) || finalists.get(3).getName().equals(c10.getName()) || finalists.get(3).getName().equals(c11.getName()) );
    
    assertTrue(finalists.get(4).getName().equals(c12.getName()) || finalists.get(4).getName().equals(c13.getName()) || finalists.get(4).getName().equals(c14.getName()) || finalists.get(4).getName().equals(c15.getName()) || finalists.get(4).getName().equals(c16.getName()) );
    assertTrue(finalists.get(5).getName().equals(c12.getName()) || finalists.get(5).getName().equals(c13.getName()) || finalists.get(5).getName().equals(c14.getName()) || finalists.get(5).getName().equals(c15.getName()) || finalists.get(5).getName().equals(c16.getName()) );
    
    assertTrue(finalists.get(6).getName().equals(c1.getName()) || finalists.get(6).getName().equals(c2.getName()) || finalists.get(6).getName().equals(c3.getName()) || finalists.get(6).getName().equals(c4.getName()) || finalists.get(6).getName().equals(c5.getName()) || finalists.get(6).getName().equals(c6.getName()) || finalists.get(6).getName().equals(c7.getName()) || finalists.get(6).getName().equals(c8.getName()) || finalists.get(6).getName().equals(c9.getName()) || finalists.get(6).getName().equals(c10.getName()) || finalists.get(6).getName().equals(c11.getName()) || finalists.get(6).getName().equals(c12.getName()) || finalists.get(6).getName().equals(c13.getName()) || finalists.get(6).getName().equals(c14.getName()) || finalists.get(6).getName().equals(c15.getName()) || finalists.get(6).getName().equals(c16.getName()));
    assertTrue(finalists.get(7).getName().equals(c1.getName()) || finalists.get(7).getName().equals(c2.getName()) || finalists.get(7).getName().equals(c3.getName()) || finalists.get(7).getName().equals(c4.getName()) || finalists.get(7).getName().equals(c5.getName()) || finalists.get(7).getName().equals(c6.getName()) || finalists.get(7).getName().equals(c7.getName()) || finalists.get(7).getName().equals(c8.getName()) || finalists.get(7).getName().equals(c9.getName()) || finalists.get(7).getName().equals(c10.getName()) || finalists.get(7).getName().equals(c11.getName()) || finalists.get(7).getName().equals(c12.getName()) || finalists.get(7).getName().equals(c13.getName()) || finalists.get(7).getName().equals(c14.getName()) || finalists.get(7).getName().equals(c15.getName()) || finalists.get(7).getName().equals(c16.getName()));


  }

}
