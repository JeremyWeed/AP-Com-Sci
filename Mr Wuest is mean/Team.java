public class Team{
    int seed;
    String name;
    
    public Team(String name, int seed){
        this.name = name;
        this.seed = seed;
    }
    
    public String toString(){
        return seed + " " + name;
    }
}