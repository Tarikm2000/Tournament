package competition;
import java.util.List;
import gamers.Competitor;



public class League extends Competition {


    /**construct a League 
     * @param competitors the competitors that will participate in the league 
     */
	
	public League (List<Competitor> competitors){
        super(competitors);
    }
    


    /**
     * play all the games of the league
     * @param competitors the  competitores of the league 
     */
    @Override
    public void  play (List<Competitor> competitors) {
        //int matchs_league = 0;
        for(Competitor comp1 : competitors){
            for (Competitor comp2 : competitors){
                if (comp1 != comp2){
                    playMatch(comp1,comp2);    
                }
            }
        }
    }

   


   
}