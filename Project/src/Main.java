import java.util.ArrayList;

import competition.Competition;
import competition.League;
import competition.Tournament;
import gamers.Competitor;
import java.util.*;


public class Main {

	public static void main(String[] args) {
        Competitor c1 = new Competitor("Barca") ; 
		Competitor c2 = new Competitor("real") ; 
		Competitor c3 = new Competitor("bayern") ; 
		Competitor c4 = new Competitor("man city") ; 
		Competitor c5 = new Competitor("losc lille") ; 
		Competitor c6 = new Competitor("rc lens") ; 
		Competitor c7 = new Competitor("psg") ;
		Competitor c8 = new Competitor("milan"); 
		
		
		ArrayList<Competitor> final_competitors = new ArrayList<Competitor>() ;
		
		final_competitors.add(c1) ; 
		final_competitors.add(c2) ; 
		final_competitors.add(c3) ; 
		final_competitors.add(c4) ; 
		final_competitors.add(c5) ; 
		final_competitors.add(c6) ; 
		final_competitors.add(c7) ;
		final_competitors.add(c8) ;
		
		
		Competition cmp1 = new League(final_competitors) ;

		Competition cmp2 = new Tournament(final_competitors); 

		System.out.println("\n \n ");
		
		System.out.println("Que voulez-vous jouer \n 1-Ligue \n 2-Tournoi \n");
		System.out.println("\n");
		Scanner sc = new Scanner(System.in);
		int actionInt = sc.nextInt();
		System.out.println("\n");

		if (actionInt==1){
			
	   try {
			System.out.println("***Le deroulement de la ligue ***\n");
			cmp1.play();
			System.out.println("\n");
			
		}
		
		catch (Exception e) {
			System.out.println(e);
		}
		
		//System.out.println("*** Nombres de matchs joué (League) ***");
		//cmp1.nb_of_match();
		System.out.println("\n");
		System.out.println("*** Rankings ***\n");
		cmp1.ranking();

    }else if (actionInt==2) {
		try {
			System.out.println("***Le deroulement du tournoi***");
			cmp2.play();
			System.out.println("\n");
			cmp2.nb_of_match();
		}
		catch(Exception e){
			System.out.println(e);
		}

	} else { 
		System.out.println("veuillez donner un entier 1 ou 2 ");
	}
}}


