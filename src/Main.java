import java.util.ArrayList;
import competition.Competition;
import competition.League;
import competition.Master;
import competition.Tournament;
import game.Match;
import gamers.Competitor;
import selectiontype.BestTwo;
import selectiontype.BestTwoWithTwoBestThree;
import selectiontype.SelectionInterface;
import observer.*;

import java.util.*;


public class Main {

	public static void main(String[] args) {
		

		List<Competitor> res=new ArrayList<Competitor>();

		System.out.println("\n \n ");
		
		System.out.println("Que voulez-vous jouer ? \n 1-Ligue \n 2-Tournoi \n 3-Master");
		System.out.println("Donner un entier  1 ou bien 2 ou bien 3: ");
		
		
		Scanner sc = new Scanner(System.in);
		int actionInt = sc.nextInt(); 
		System.out.println("\n");
		System.out.println("Combien de competitors vous voulez pour la compétetion ?(*** Si vous avez choisi le tournoi : pensez a donner une puissance de 2 pour le nombre de competitor ***) \n");
		
		Scanner sc1 = new Scanner(System.in);
		int actionInt1 = sc1.nextInt();
		

		for (int i=0;i<actionInt1;i++){
            res.add(new Competitor("EQUIPE "+Integer.toString(i)));

        }
		Journalists jour = new Journalists("MASSI");
		Journalists jour2 = new Journalists("TARIK");
		Bookmakers book = new Bookmakers("MOMO HENNI",res);
		Competition cmp1=new League(res);
		Competition cmp2 = new Tournament(res);
		cmp1.addObserver(jour);
		cmp2.addObserver(jour2);
		cmp1.addObserver(book);
		cmp2.addObserver(book);

		
		
			

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
		
		else if (actionInt==3){
			System.out.println("Combien  de groupes voulez-vous ? \n");
			Scanner nbgrp = new Scanner(System.in);
			int actionGroup = nbgrp.nextInt();
			
			System.out.println("Wich type of selection you want : ");
			System.out.println("1 - Select two best of each group ");
			System.out.println("2 - Select two best of each group with two best third \n");

			Scanner selection = new Scanner(System.in);
			int actionSelection = selection.nextInt();
			SelectionInterface s;
			
			 
			if (actionSelection==1){
				s = new BestTwo();
				Master m = new Master(res,actionGroup,s);
				m.addObserver(jour);
				m.addObserver(book);
				try{
					m.play();
					//m.displayRanking();
				}
				catch (Exception e) {
					System.out.println(e);
				}

			}
			else if (actionSelection==2){
				s=new BestTwoWithTwoBestThree();
				Master m = new Master(res,actionGroup,s);
				
				m.addObserver(jour);
				m.addObserver(book);
				try {
					m.play();
					//m.displayRanking();
				}
				catch (Exception e) {
					System.out.println(e);
				}
			}
			else {
				System.out.println("\n");
				System.out.println("!!! put number 1 or 2 for the selection type !!!");
			}
			
		}

		
	} 
		
}	



