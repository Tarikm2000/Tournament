package competition;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import competition.Competition;
import gamers.Competitor;
import selectiontype.*;
import game.Match;

import java.beans.Transient;
import java.util.*;

public class MasterTest extends CompetitionTest{

    private List<List<Competitor>> res;
    private SelectionInterface s= new BestTwo();
    private Master m ;

    protected Competition createCompetition(List<Competitor> competitors) {
        m=new Master(this.competitors,2,s);
        return m;
    }

    
    @Test
    public void partitionTest() {
        res=m.partitionGroups();

        //check that each group has 2 teams after partitioning 4 teams into 2 groups of Competitores
        assertEquals(2,res.get(0).size());
        assertEquals(2,res.get(1).size());
        //assertEquals(5,res.get(2).size());
    }

    
    @Test
    public void playTest() {

        this.before();
        try{
            m.play();
        }
        catch (Exception e) {
            System.out.println(e);
        }

        assertEquals(4,competitors.size());

        int max=0;
        for (int x : m.ranking().values()){
            if (x>max){
                max=x;
            }
        }
        Competitor w = m.finalWinner();
        assertEquals(max,m.getNbPoints(w));


    }
    
}
