package observer;

import competition.*;
import gamers.*;
import game.*;
import java.util.*;


public class Bookmakers implements ObserverInterface {
    private Map<Competitor,Integer> cotes;
    private List<Competitor> competitors;
    private String name;
	
    /**construct a Bookmakers  
     */
    public Bookmakers (String name , List<Competitor> competitors ) {
        this.cotes = new HashMap<Competitor,Integer>();
        this.name=name;        
        for (Competitor c : competitors){
            this.cotes.put(c,2);
        }
        
    }

    /** update the cote of the winner 
     * 
     * @param c the Competitor 
     */
    public void coteOfWinner(Competitor c) {
        if (this.cotes.get(c)-1 < 0 ) {
            this.cotes.put(c,0);
        }
        else {
            this.cotes.put(c,this.cotes.get(c)-1);
        }
    }

    /** update the cote of the loser     
     * 
     * @param c the Competitor 
     */
    public void coteOfLoser(Competitor c) {
        this.cotes.put(c,this.cotes.get(c)+1);
    }

    /**display information about a match
     * @param match the match we want to get information about
     */
    public void update(Match match){
        Competitor c1 = match.getwinner();
        Competitor c2 = match.getloser();

        this.coteOfWinner(c1);
        this.coteOfLoser(c2);

        System.out.println(this.name + " : Victoire de " + c1.getName() + " ( cote " + this.cotes.get(c1) + " ) " + " face à " + c2.getName() + " ( cote " + this.cotes.get(c2) + " ) . " );

        // on doit remettre les cotes a 2 apres chaque fin de match 
        //this.cotes.put(c1,2);
        //this.cotes.put(c2,2);

    }   

}