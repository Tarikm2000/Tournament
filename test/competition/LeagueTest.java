package competition;

import static org.junit.Assert.*;
import org.junit.Test;


import java.util.ArrayList;
import java.util.*;

import org.junit.Before;

import competition.League;
import gamers.Competitor;
import competition.Competition;
import exceptions.NotPowerOfTwoException;

public class LeagueTest extends CompetitionTest{

    protected Competition createCompetition(List<Competitor> competitors) {
        return new League(this.competitors);
    }

    @Test
    public void playTest(){
        this.before();
        try {
            this.competition.play();
        }
        catch (Exception e) {
            System.out.println(e);
        }
        assertTrue(this.competitors.size()==4);
        
        assertEquals(6,this.competition.getNbMatch(this.c1));
        assertEquals(6,this.competition.getNbMatch(this.c2));
        assertEquals(6,this.competition.getNbMatch(this.c3));
        assertEquals(6,this.competition.getNbMatch(this.c4));
        
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