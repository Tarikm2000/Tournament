package competition;

import java.util.*;
import exceptions.*;
import gamers.Competitor;
import selectiontype.SelectionInterface;
import observer.*;


public class Master extends Competition {

    private int nbGroup;
    private SelectionInterface selection;


    /** Constructor of a master 
     * @param competitors competitors of the master 
     * @param nbGroup  number of groupes during the first stage
     * @param selection selction methid that will be used of to derminate  competitores that will play final stage
     */
    public Master(List<Competitor> competitors, int nbGroup ,SelectionInterface selection) {
        super(competitors);
        this.nbGroup=nbGroup;
        this.selection=selection;
    }


    /**
     * get the selection that used in the master 
     * @return selection used by master 
     */
    public SelectionInterface getSelection(){
        return this.selection;
    }
     





    /** divide all the competitors into groups to play poolstage 
     * @return List of competitores divided into pools ,the first list is the first pool ,the second list is the second pool ...
     */
    public List<League> partitionGroups() {
        
        List<List<Competitor>> result = new ArrayList<List<Competitor>>();
        int nbTeamEachGroup = this.competitors.size()  / this.nbGroup ;

        Iterator<Competitor> it = this.competitors.iterator();

        for (int i=0;i<this.nbGroup;i++) {
            int j = 0;
            List<Competitor> poules = new ArrayList<Competitor>();
            
            while (j<nbTeamEachGroup){
                if (it.hasNext()){
                    poules.add(it.next());
                }
                j+=1;
            }
            result.add(poules);
            
        }
        
        
        while (it.hasNext()){
            result.get(0).add(it.next());
        }
        List<League> resultfinal = new ArrayList<>();
        for (List<Competitor> l : result){
            resultfinal.add(new League(l));
        }
        
        return resultfinal;
    }
    

    /* play the master group stage and final stage
     * @param l competitores of the master 
     * @throws NotPowerOfTwoException if the number of competitors of the tournament is not power of two 
     */
    @Override
    public void play(List<Competitor> l) throws NotPowerOfTwoException{
        List<League> poules = this.partitionGroups();

        // créer les leagues
        // play() sur les leagyes
        for(League l1 :poules){
            for(ObserverInterface o : this.observers){
                l1.addObserver(o);
            }
            l1.play();
            // recuperer le nb de points de chaque competitors
            for (Competitor c : l1.ranking().keySet()) {
                this.nb_points.put(c,l1.ranking().get(c));
            }
        }
        List<Competitor> gagnats = this.getSelection().selection(poules);
        Competition cmp = new Tournament(gagnats);
        
        for(ObserverInterface o : this.observers){
            cmp.addObserver(o);
        }
        
        // ajouter à cmp les observers de la compétitions
        try {
            cmp.play();
        }
        catch (Exception e) {
            System.out.println("WARNING : Tournament cannot be organised because final Competitores are not power of 2, You have not chosen number of competitores and their type of  selection correctly . \n");
        }
        
    }

    
} 