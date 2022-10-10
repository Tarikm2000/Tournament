package competition;
import java.util.*;
import java.util.*;

import exceptions.NotPowerOfTwoException;

import util.MapUtil;
import game.Match;
import gamers.Competitor;



public abstract class Competition {
    protected final List<Competitor> competitors;
    protected final Map<Competitor,Integer> nb_matchs;
    protected final Map <Competitor,Integer> nb_points;
    

    /**construct a competetition ,at the  beginning each team has 0 points and played 0 match
     * @param competitores the competitors that will participate at the competetion  
     */
    public Competition(List<Competitor> competitores){
        this.competitors=competitores;
        this.nb_points=new HashMap<Competitor,Integer>();
        this.nb_matchs=new  HashMap<Competitor,Integer>(); 
            for (Competitor c : competitors){
                this.nb_matchs.put(c,0);
                this.nb_points.put(c,0);
            }
    }


     /**
     * see how many much points a competitor c has
     * @param c the competitor we want to see how much points he has
     * @return number of points a competitor c has
     */
    public int getNbPoints(Competitor c) {
        return this.nb_points.get(c);
    }


    /**
     * see how many matchs a competitor c played
     * @param c the competitor we want to see how many matchs he played
     * @return number of matchs a competitor c played
     */
    public int getNbMatch(Competitor c){
        return this.nb_matchs.get(c);}



     /**
     * returns the winner of the match beetween two competitores
     * @param c1 the  competitor to play a match 
     * @param c2 the second competitor to play the match
     * @return winner of the match beetween the two competitors
     */
    protected Competitor playMatch(Competitor c1,Competitor c2){
        Match m=new Match(c1,c2);
        Competitor winner= m.winner();
        int points=this.nb_points.get(winner);
        int match_c1=this.nb_matchs.get(c1);
        int match_c2=this.nb_matchs.get(c2);
        this.nb_points.replace(winner,points+1);
        this.nb_matchs.replace(c1,match_c1+1);
        this.nb_matchs.replace(c2,match_c2+1);
        System.out.println(" " + c1.getName() + " vs " + c2.getName() + " --> " + winner.getName() + " wins ! ");
        return winner;

    }
    

    
    

    
    
    /** 
     * play the competition either a tournament or a league
     * @param   l  the competitors that will particpate at the competition 
     * @throws NotPowerOfTwoException if an exception occurred
    */
    protected abstract void  play(List<Competitor> l) throws NotPowerOfTwoException ;
     

    /**
     * order an hashmap by values from the highest  to the lowest 
     * @return the hashmap ordered from the competitor who has the highes points to the lowest 
     */
    public Map<Competitor,Integer> ranking(){
        
        Map <Competitor, Integer> result = MapUtil.sortByDescendingValue(this.nb_points);
        for (Map.Entry m : result.entrySet()) {
            System.out.println(" " + m.getKey()  + " - " + m .getValue());
        }
      return result;
    }

    /** 
     * get the winner of competetion (league)
     * @return the winner of the competition
    */
    public Competitor finalWinner() {
        List<Competitor> res =  new ArrayList<>();
        for (Competitor m : this.ranking().keySet()){
            res.add(m);
        }
        return res.get(0);
    }
    

     /**
     * play the competition ,League or Tournament
     */
    public void play() throws NotPowerOfTwoException {
        this.play(this.competitors);
    }



}