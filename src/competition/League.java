package competition;
import java.util.List;
import gamers.Competitor;
import java.util.HashMap;
import java.util.*;



public class League extends Competition {
	
	public League (List<Competitor> competitores){
        super(competitores);
    }
    
    
    @Override
    public void play (List<Competitor> competitores) {
        for(Competitor comp1 : competitores){
            for (Competitor comp2 : competitores){
                if (comp1 != comp2){
                    playMatch(comp1,comp2);
                }
            }
        }
    }    
}