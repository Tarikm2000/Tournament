package game;
import gamers.Competitor;
import java.util.Random;

public  class Match {
    public Competitor teamA;
    public Competitor teamB;

    public Match (Competitor teamA,Competitor teamB){
        this.teamA=teamA;
        this.teamB=teamB;
    }

    public Competitor getTeamA() {
		return teamA;
	}

	public void setTeamA(Competitor teamA) {
		this.teamA = teamA;
	}

	public Competitor getTeamB() {
		return teamB;
	}

	public void setTeamB(Competitor teamB) {
		this.teamB = teamB;
	}

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