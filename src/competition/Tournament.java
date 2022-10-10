
package competition;
import gamers.Competitor;
import game.Match;
import java.util.List;
import exceptions.NotPowerOfTwoException;
import java.util.ArrayList;

public class Tournament extends Competition {

    
    
    public Tournament (List<Competitor> competitors){
        super(competitors);

    }
    

    /**
     * check if a number is power of two
     * @param the numeber we want to check if it's of power two
     * @return true if a number is power of two ,else return false 
     */
    public boolean PowerOfTwo(int n){
        while (n%2 == 0){
            n=n/2;
        }
         if (n ==1 ) {
            return true;
        }
        else {
            return false;
        }


    }
    

    /**
     * play all the games of the tournament     
     * @param the competitores of the league 
     * @throws NotPowerOfTwoException if the number of competitors of the tournament is not power of two 
     */
    //int matchs_tournament=0;
    @Override
    public void  play (List<Competitor> competitors) throws NotPowerOfTwoException {
        
        if ( !PowerOfTwo(competitors.size()) ) {
            throw new NotPowerOfTwoException("Cannot play the tournament ,the list of competitors is not full");
        
        }
        
        List<Competitor> res = new ArrayList<>();
        
        
        if (competitors.size()==1) {
        	res.add(competitors.get(0));
            System.out.println("\n");
            System.out.println(" the winner  of the Tournament is " + res.get(0));
            System.out.println("\n");
            //System.out.println(" le nombre de matchs joué dans ce tournoi est :" + matchs_tournament);
        }
        else {
        	int i=0;
            
        	while (competitors.size()>1 && i<competitors.size()) {
        		
        		Competitor w = playMatch(competitors.get(i),competitors.get(i+1));
                //matchs_tournament+=1;
                
        		if (w.equals(competitors.get(i))) {
                    res.add(competitors.get(i));
        		}
                
        		else {
        			res.add(competitors.get(i+1));
        		}
        		i+=2;
        		
        		
        	}
        	System.out.println(" the winner after each round " + res);
        	this.play(res);
        	
        }
        
        //return matchs_tournament;
    }

    
}

