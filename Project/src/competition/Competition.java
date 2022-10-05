package competition;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import exceptions.NotPowerOfTwoException;

import util.MapUtil;
import game.Match;
import gamers.Competitor;



public abstract class Competition {
    protected final List<Competitor> competitors;
    protected final Map<Competitor,Integer> nb_matchs;
    protected final Map <Competitor,Integer> nb_points;
    

  
    public Competition(List<Competitor> competitores){
        this.competitors=competitores;
        this.nb_points=new HashMap<Competitor,Integer>();
        this.nb_matchs=new  HashMap<Competitor,Integer>(); 
            for (Competitor c : competitors){
                this.nb_matchs.put(c,0);
                this.nb_points.put(c,0);
            }
    }



    protected void playMatch(Competitor c1,Competitor c2){
        Match m=new Match(c1,c2);
        Competitor winner= m.winner();
        int points=this.nb_points.get(winner);
        int match_c1=this.nb_matchs.get(c1);
        int match_c2=this.nb_matchs.get(c2);
        this.nb_points.replace(winner,points+1);
        this.nb_matchs.replace(c1,match_c1+1);
        this.nb_matchs.replace(c2,match_c2+1);
        System.out.println(" " + c1.getName() + " vs " + c2.getName() + " --> " + winner.getName() + " wins ! ");
        

    }
    
    protected abstract void play(List<Competitor> l) throws NotPowerOfTwoException ;
    

    public Map<Competitor,Integer> ranking(){
        
        Map <Competitor, Integer> result = MapUtil.sortByDescendingValue(this.nb_points);
        for (Map.Entry m : result.entrySet()) {
            System.out.println(" " + m.getKey()  + " - " + m .getValue());
        }
     
        return result;
    }

    
    public Map<Competitor,Integer> nb_of_match() {
        for (Map.Entry m : this.nb_matchs.entrySet()) {
            System.out.println(m.getKey() + " played " + m.getValue() + " Matchs ");
        }
        return this.nb_matchs;
    }
	
    

    
    
    
    public void play() throws NotPowerOfTwoException {
        this.play(this.competitors);
    }



}