package observer;

import gamers.*;
import competition.*;
import game.*;


public interface ObserverInterface {

     /** give information about a game 
      * @param match The match we want to get the informationnn about 
      */
    public void update(Match match);
    
} 