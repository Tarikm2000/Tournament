package competition;

import static org.junit.Assert.*;
import org.junit.Test;


import java.util.ArrayList;
import java.beans.Transient;
import java.util.*;

import org.junit.Before;

import competition.Tournament;
import exceptions.NotPowerOfTwoException;
import gamers.Competitor;
import competition.Competition;

public class TournamentTest extends CompetitionTest{
    
    protected Competition createCompetition(List<Competitor> competitors) {
        return new Tournament(this.competitors);
    }

    @Test 
    public void testplayTournamentWithException() throws NotPowerOfTwoException{
        this.before();
        assertEquals(4,this.competitors.size());
        this.competitors.remove(c1);
        assertTrue(this.competitors.size()==3);
        assertThrows(NotPowerOfTwoException.class,() -> this.competition.play());

    }

     
    @Test 
    public void testplayWithoutException() throws NotPowerOfTwoException{
        this.before();
        assertEquals(4,this.competitors.size());
        int max=0;
        for (int x : this.competition.ranking().values()){
            if (x>max){
                max=x;
            }
        }
        Competitor res = this.competition.finalWinner();
        assertEquals(max,this.competition.getNbPoints(res));

    }
    
    

    
}