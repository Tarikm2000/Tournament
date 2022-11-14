package selectiontype;

import java.util.*;
import competition.*;
import game.Match;
import gamers.Competitor;




public interface SelectionInterface {



    /** select the competitores that will go to the final stage 
     * @param winners List of Competitores of each Group 
     * @return Competitores that will go to final stage 
     */
    public  List<Competitor> selection (List<List<Competitor>> winners);
} 