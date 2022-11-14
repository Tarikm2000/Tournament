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
		Competitor c4 = new Competitor("Dortmund") ; 
		Competitor c5 = new Competitor("losc lille") ; 
		Competitor c6 = new Competitor("rc lens") ; 
		Competitor c7 = new Competitor("inter") ;	
		Competitor c8 = new Competitor("milan"); 
		Competitor c9 = new Competitor("ManUnited");
        Competitor c10 = new Competitor("ManCity");
        Competitor c11 = new Competitor("Marseille");
        Competitor c12 = new Competitor("Liverpool");
		
		
		List<Competitor> final_competitors = new ArrayList<Competitor>() ;
		List<Competitor> res=new ArrayList<Competitor>();
		
		final_competitors.add(c1) ; 
		final_competitors.add(c2) ; 
		final_competitors.add(c3) ; 
		final_competitors.add(c4) ; 
		final_competitors.add(c5) ; 
		final_competitors.add(c6) ; 
		final_competitors.add(c7) ;
		final_competitors.add(c8) ;
		final_competitors.add(c9) ;
		final_competitors.add(c10) ;
		final_competitors.add(c11) ;
		final_competitors.add(c12) ;


				
		//Competition cmp1  ;
		//Competition cmp2 = new Tournament(res) ; 

		System.out.println("\n \n ");
		
		System.out.println("Que voulez-vous jouer ? \n 1-Ligue \n 2-Tournoi \n");
		System.out.println("Donner un entier  1 ou bien 2 : ");
		
		
		Scanner sc = new Scanner(System.in);
		int actionInt = sc.nextInt(); 
		System.out.println("\n");
		System.out.println("*** Si vous avez choisi le tournoi : pensez a donner une puissance de 2 pour le nombre de competitor ***");
		System.out.println("\n");
		System.out.println("Combien de competitors vous voulez pour la compétetion ?    (<=12):  \n");
		
		Scanner sc1 = new Scanner(System.in);
		int actionInt1 = sc1.nextInt();
		if(actionInt1 >12 ){
            
            System.out.println("\n\n please give a number under 12 \n");
            System.exit(0);
        }

		for (int i=0;i<actionInt1;i++){
            res.add(final_competitors.get(i));

        }
		Competition cmp1=new League(res);
		Competition cmp2 = new Tournament(res); 
			

		if (actionInt==1){
			
			try {
				System.out.println("***Le deroulement de la ligue ***\n");
				cmp1.play();
				System.out.println("\n");			
			}
		
			catch (Exception e) {
				System.out.println(e);
			}
		
			
			System.out.println("\n");
			System.out.println("*** Rankings ***\n");
			cmp1.displayRanking();	
    	}
		
		else if (actionInt==2){
			
			try {
				
				cmp2.play();
				System.out.println("***Le deroulement du tournoi*** \n");
				System.out.println("\n");
				System.out.println("\n");
				System.out.println("*** Rankings ***\n");
				cmp2.displayRanking();
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
	} 
		
}	



