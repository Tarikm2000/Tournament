package gamers;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import gamers.Competitor;
public class CompetitorTest {

    private Competitor team1;
    private Competitor team2;
    private Competitor team3;
    
    @Before 
    public void before (){
        team1 = new Competitor ("RealMadrid");
        team2 = new Competitor ("Barcelone");
        team3 = new Competitor ("AtleticoMadrid");

    }

    @Test
    public void testGetName(){
        assertEquals("RealMadrid",team1.getName());
        assertEquals("Barcelone",team2.getName());
        assertEquals("AtleticoMadrid",team3.getName());
    }


    @Test
    public void testSetName(){
        team2.setName("FCB");
        team1.setName("RM");
        assertEquals(team2.getName(),"FCB");
        assertEquals(team1.getName(),"RM");
        assertEquals(team3.getName(),"AtleticoMadrid");
    }

    



   

}