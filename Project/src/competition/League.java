package competition;
import java.util.List;
import gamers.Competitor;



public class League extends Competition {
	
	public League (List<Competitor> competitores){
        super(competitores);
    }

    @Override
    public void play (List<Competitor> competitores){
        for(int i=0;i<this.competitors.size();i++){
            for (int j=0;j<this.competitors.size();j++){
                if (i !=j){
                    playMatch(this.competitors.get(i),this.competitors.get(j));
                }
            }
        }
    }

}