
package selectiontype;

import competition.Competition;
import competition.League;
import gamers.Competitor;
import util.MapUtil;

import java.util.*;

public class BestTwoWithTwoBestThree implements SelectionInterface {

    /* select the two first of each group and the 2 best three 
     * @winners   competitores of the competetion
     * @return Competitors selected to play the final stage 
     */
    public List<Competitor> selection (List<List<Competitor>> winners) {
        List<Competitor> result = new ArrayList<Competitor>();
        Map<Competitor,Integer> resultinter =new HashMap<Competitor,Integer>();
        

        for (int i=0;i<winners.size();i++) {
            Competition cmp = new League(winners.get(i));
            try {
                cmp.play();
                System.out.println( " \n RANKING AFTER GROUP STAGE :  \n");
                cmp.displayRanking();
            }
            catch (Exception e) {
                System.out.println(e);
            }

            Map<Competitor,Integer> rank=cmp.ranking();
            Iterator<Competitor> it = rank.keySet().iterator();
            Iterator<Competitor> it1 = rank.keySet().iterator();
            
            int j=0;
            while (it.hasNext() && j<2){
                result.add(it.next());
                j++;
            }
            
            int k=0;
            while (it1.hasNext() && k<3){
                Competitor c=it1.next();
                if (k==2){
                    resultinter.put(c,cmp.getNbPoints(c));
                }
                k++;
            }
            

            System.out.println("\n");
            System.out.println("Le équipes en 3 place de chaque groupe : " + resultinter);
            System.out.println("les 2 équipes premières " + result);
            System.out.println("\n");
            

        }

        Map<Competitor,Integer> res = MapUtil.sortByDescendingValue(resultinter);
        System.out.println("Le équipes en 3 place en ordre decroissant des points : " + res);
        Iterator<Competitor> it2 = res.keySet().iterator();
        
        int z=0;
        while(it2.hasNext() && z<2 ){
            result.add(it2.next());
            z++;
        }
        
        System.out.println("Les qulifiés pour la phase final sont : "+result);
        System.out.println("\n");
        return result;
    }

}