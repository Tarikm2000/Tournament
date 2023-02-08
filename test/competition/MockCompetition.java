package competition;


import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import competition.Competition;
import gamers.Competitor;

import exceptions.NotPowerOfTwoException;
import java.util.*;
import observer.*;

public class MockCompetition extends Competition {
    public int nb_called = 0;
    
    public MockCompetition(List<Competitor> competitors,Journalists journalist) {
    	super(competitors);
    }
    
    public Competitor playMatch (Competitor c1,Competitor c2) {
        return c1;
    } 

    protected void play(List<Competitor> l) throws NotPowerOfTwoException{
    	this.nb_called++;
        
    }

    public void play() throws NotPowerOfTwoException {
        
        this.play(competitors);
        
    }

}

