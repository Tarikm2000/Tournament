
package selectiontype;

import competition.*;
import exceptions.*;
import game.*;
import gamers.*;
import util.*;
import java.util.*;
import observer.*;


public class BestTwo implements SelectionInterface {
    
    
    /* Select the two first of each List
     * @param winners Competitores of each group 
     * @return the list of the competitors that qulified for the final stage by selecting the two first of each group 
     */
    public List<Competitor> selection (List<League> winners) {
        List<Competitor> result = new ArrayList<Competitor>();
        //Journalists journalist = new Journalists(null);
        //List<ObserverInterface> observers = new ArrayList <ObserverInterface>();
        for (int i =0;i<winners.size();i++) {
            Competition cmp = winners.get(i);
            try {
                
                //cmp.play();
                //cmp.addObserver();
                System.out.println("\n"); 
                System.out.println("Classement apres la phase de groupe");
                cmp.displayRanking();
            }
            catch (Exception e) {
				System.out.println(e);
			}
            
            Map<Competitor,Integer> rank=cmp.ranking();
            Iterator<Competitor> it = rank.keySet().iterator();
            int j=0;
            while(it.hasNext() && j<2 ){
               result.add(it.next());
               // System.out.println(" Les qualifies sont : "+it.next().getName());
                
                j++;
            }
            //System.out.println(result);
            System.out.println("\n");
        }
        System.out.println("Les qulifiés pour la phase final sont : "+result);
        System.out.println("\n");
        return result;
    }

}