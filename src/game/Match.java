package game;
import gamers.Competitor;
import java.util.Random;
 
public  class Match {
    public Competitor teamA;
    public Competitor teamB;

    /**create a Match beetween 
    *@param teamA the competior of the match
    *@param teamB the second competitor of the match 
    */
    public Match (Competitor teamA,Competitor teamB){
        this.teamA=teamA;
        this.teamB=teamB;
    }
    /** choses a winner randomly beetween 2 competitors 
     * @return the winner of the match 
     */
	public Competitor winner(){
        Random random = new Random();
        int w=random.nextInt(2);
        if (w==0){
            return teamA;
        }
        else {
            return teamB;
        }
    }
    
    
}