package game;
import gamers.Competitor;
import java.util.Random;
 
public  class Match {
    private Competitor teamA;
    private Competitor teamB;
    private Competitor win = new Competitor(null);
    private Competitor los = new Competitor(null);

    /**create a Match beetween 
    *@param teamA the competior of the match
    *@param teamB the second competitor of the match 
    */
    public Match (Competitor teamA,Competitor teamB){
        this.teamA=teamA;
        this.teamB=teamB;
    }

    public Competitor getFirstCompetitor() {
        return teamA;
    }   
    
    public Competitor getSecondCompetitor() {
        return teamB;
    }
    /** choses a winner randomly beetween 2 competitors 
     * @return the winner of the match 
     */
    
	public Competitor winner(){
        Random random = new Random();
        int w=random.nextInt(2);
        if (w==0){
            win = teamA;
            los = teamB;
            return teamA;
        }
        else {
            win = teamB;
            los=teamA;
            return teamB;
        }
    }


    /* 
    public void resultMatch() {
        Random random = new Random();
        int w =random.nextInt(2);
        
        if (w==0) {
            win = teamA;
            los = teamB;
        }
        else {
            win = teamB;
            los=teamA;
        }
    }
    */
    
    public Competitor getloser(){
        
        return this.los;
    }
    
    public Competitor getwinner() {
        
        return this.win;
    }
    

}