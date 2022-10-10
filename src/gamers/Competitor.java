package gamers;

public class Competitor {
    private String name;
    
     /**create a Competitor
      * @param name name of the competitor
      */
    public Competitor (String name){
        this.name=name;
    }

    /**sets the name of the competitor 
      * @param newName name of the competitor
      */
    public void setName (String newName){
        this.name=newName;
    }

   /** get the name of the competitor
      * @return name of the competitor 
      */
    public String getName (){
        return this.name;
    }


    /**get informations about competitor
      * @return name of the copmetitor 
      */
    public String toString (){
        return this.name ;  
    }
    /**check if two competitors are equals
      * @param o the competitor 
      *@return true if two competitors are equals ,else return false 
      */
    public boolean equals(Object o ){
        if (! ( o instanceof Competitor)) {
            return false;
        }
        Competitor other = (Competitor) o;
        return this.name.equals(other.name);
    }
}