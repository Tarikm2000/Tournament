

package observer;

import competition.*;
import gamers.*;
import game.*;

public class Journalists implements ObserverInterface{

    private String name;

    /** construct a journalist
      * @param name name of the journalist 
      */
    public Journalists (String name ) {
      this.name = name;
        
    }

    
    /** get information about the game 
      * @param match The match we want to get the informationnn about 
      */
    public void update (Match match) {
      System.out.println("\n");
      System.out.println(this.name + " : Pour ce match entre " + match.getFirstCompetitor().getName() + " et " + match.getSecondCompetitor().getName() + " => " + match.getwinner() + " a gagné " + " et " + match.getloser() + " a perdu ");
    } 
    
}
