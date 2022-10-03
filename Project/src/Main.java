import java.util.ArrayList;

import competition.Competition;
import competition.League;
import gamers.Competitor;


public class Main {

	public static void main(String[] args) {
        Competitor c1 = new Competitor("Barca") ; 
		Competitor c2 = new Competitor("real") ; 
		Competitor c3 = new Competitor("bayern") ; 
		Competitor c4 = new Competitor("man city") ; 
		Competitor c5 = new Competitor("losc lille") ; 
		Competitor c6 = new Competitor("rc lens") ; 
		Competitor c7 = new Competitor("psg") ; 
		
		
		ArrayList<Competitor> final_competitors = new ArrayList<Competitor>() ;
		
		final_competitors.add(c1) ; 
		final_competitors.add(c2) ; 
		final_competitors.add(c3) ; 
		final_competitors.add(c4) ; 
		final_competitors.add(c5) ; 
		final_competitors.add(c6) ; 
		final_competitors.add(c7) ; 
		
		
		Competition cmp1 = new League(final_competitors) ; 

		System.out.println("\n\n ");
		cmp1.play();
        //System.out.println(nouvelle_comp.getCompetitorsPoints());
		System.out.println("\n\n*** Rankings ** ");

       cmp1.ranking();	
	   	
        


    }


    }