
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CompetitorTest {

    private Competitor team1;
    private Competitor team2;
    private Competitor team3;

    @Before 
    public void before (){
        this.team1 = new Competitor ("RealMadrid",0,0);
        this.team2 = new Competitor ("Barcelone",0,0);
        this.team3 = new Competitor ("AtleticoMadrid",0,0);
        this.team4 = new Competitor ("Seville",0,0);

    }

    @Test
    public void testGetName(){
        assertEquals("Barcelone",this.team2.name);
        assertEquals("AtleticoMadrid",this.team3.name);
    }


    @Test
    public void test



   

} 