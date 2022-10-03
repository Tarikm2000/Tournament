 package gamers;

public class Competitor {

    private String name;
    //private Int points;

    public Competitor (String name){
        this.name=name;
    }

    
    public void setName (String newName){
        this.name=newName;
    }


    public String getName (){
        return this.name;
    }



    public String toString (){
        return " l'equipe " + this.name ;  
    }

}