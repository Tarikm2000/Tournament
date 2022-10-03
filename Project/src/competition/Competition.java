package competition;
//import java.util.Random;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import game.Match;
import gamers.Competitor;


public abstract class Competition {
    protected final List<Competitor> competitors;
    protected final Map<Competitor,Integer> nb_matchs;
    protected final Map <Competitor,Integer> nb_points;
    //protected int points;
    //protected int wins;

  //on initialise le nombre de points de chaque competitor à 0
    public Competition(List<Competitor> competitores){
        this.competitors=competitores;
        this.nb_points=new HashMap<Competitor,Integer>();
        this.nb_matchs=new  HashMap<Competitor,Integer>(); 
            for (int i=0;i<this.competitors.size();i++){
                this.nb_matchs.put(this.competitors.get(i),0);
                this.nb_points.put(this.competitors.get(i),0);
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
        System.out.println(c1.getName()+" vs "+ c2.getName() + " --> "+ winner.getName()+" wins ! ");
        

    }
   
    protected abstract void play(List<Competitor> l);
    

   public Map<Competitor,Integer> ranking(){
    for (Map.Entry m : this.nb_points.entrySet()) {
        System.out.println( m.getKey()  + " - " + m .getValue());
     }
     
     return this.nb_points;
    }

  


    
    public void play(){
        this.play(this.competitors);
        }



}