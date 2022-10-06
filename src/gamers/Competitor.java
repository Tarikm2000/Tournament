package gamers;

public class Competitor {

    private String name;
    

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
        return this.name ;  
    }

    public boolean equals(Object o ){
        if (! ( o instanceof Competitor)) {
            return false;
        }
        Competitor other = (Competitor) o;
        return this.name.equals(other.name);
    }
}