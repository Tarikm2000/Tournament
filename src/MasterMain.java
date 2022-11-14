
import java.util.*;
import exceptions.*;
import gamers.Competitor;
import selectiontype.BestTwo;
import selectiontype.BestTwoWithTwoBestThree;
import selectiontype.SelectionInterface;
//import selectiontype.SelectionInterface;
import competition.*;



public class MasterMain {

    public static void main (String [] args) throws NotPowerOfTwoException{

        List<Competitor> final_competitors = new ArrayList<Competitor>() ;

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

        List<Competitor> res=new ArrayList<>();
        
       //SelectionInterface s = new SelectionInterface();
        System.out.println("\n How many competitores you want for this master ( <=12 )? \n");
        Scanner sc = new Scanner(System.in);
        
		int actionInt = sc.nextInt();
        if(actionInt >12 ){
            
            System.out.println("\n\n please give a number under 12 \n");
            System.exit(0);
        }
        
        
        for (int i=0;i<actionInt;i++){
            res.add(final_competitors.get(i));
        }

        System.out.print("how many group you want to have in the master ? \n");
        Scanner sc1=new Scanner(System.in);
        int actionInt1=sc1.nextInt();
        if (actionInt1 > actionInt){
            System.out.println("The number of groups cannot be bigger than number of competitores ");
            System.exit(1);
        }
        //for (int i=0;i<actionInt;i++){
          //  res.add(final_competitors.get(i));
            //}
        Scanner sc2=new Scanner(System.in);
        System.out.println(" Which type of selection you want ? \n");
        System.out.print(" 1- Select the two best of each group \n 2- select the two best of each group and the two best three \n");
        int actionInt2=sc2.nextInt();
        SelectionInterface s;

        if (actionInt2==1){
           s = new BestTwo();
        }
        else {
            s=new BestTwoWithTwoBestThree();
        }
          
        Master m = new Master(res,actionInt1,s); 
        m.play();

       
    }

}
