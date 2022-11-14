
package selectiontype;

import competition.*;
import exceptions.*;
import game.*;
import gamers.*;
import util.*;
import java.util.*;


public class BestTwo implements SelectionInterface {
    
    
    /* Select the two first of each List
     * @param winners Competitores of each group 
     * @return the list of the competitors that qulified for the final stage by selecting the two first of each group 
     */
    public List<Competitor> selection (List<List<Competitor>> winners) {
        List<Competitor> result = new ArrayList<Competitor>();
        for (int i =0;i<winners.size();i++) {
            Competition cmp = new League (winners.get(i));
            try {
                
                cmp.play(); 
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