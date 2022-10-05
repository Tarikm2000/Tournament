
package competition;
import gamers.Competitor;
import game.Match;
import java.util.List;
import exceptions.NotPowerOfTwoException;
import java.util.ArrayList;

public class Tournament extends Competition {
    
    public Tournament (List<Competitor> competitores){
        super(competitores);

    }

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
    // ya a un probleme qu'on rajoute le winner dans la liste des resultats ; j'ai essayé de le verifier avec equals() mais y a toujours ce problème
    
    @Override
    public void play (List<Competitor> competitores) throws NotPowerOfTwoException {
        
        if ( !PowerOfTwo(competitores.size()) ) {
            throw new NotPowerOfTwoException("Cannot play the tournament ,the list of competitors is not full");
        
        }
        
        List<Competitor> res = new ArrayList<>();
        
        if (competitores.size()==1) {
        	res.add(competitores.get(0));
        }
        else {
        	int i=0;
        	while (competitores.size()>1 && i<competitores.size()) {
        		Match m = new Match(competitores.get(i),competitores.get(i+1));
        		playMatch(competitores.get(i),competitores.get(i+1));
        		Competitor w = m.winner();
        		
        		if (w.getName().equals(competitores.get(i))) {
        			res.add(competitores.get(i));
        		}
        		else {
        			res.add(competitores.get(i+1));
        		}
        		i+=2;
        		System.out.println(" the winner after each round " + res);
        		
        	}
        	
        	this.play(res);
        	
        }
        
    }




}

/*
if (!PowerOfTwo(competitores.size()) ) {
            throw new NotPowerOfTwoException ("Cannot play the tournament : the list of compititors is not full ");
        }
*/