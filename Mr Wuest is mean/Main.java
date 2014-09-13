import java.util.*;
public class Main{
    static Conference west = new Conference("west.txt");
    static Conference east = new Conference("east.txt");
    static Conference midwest = new Conference("midwest.txt");
    static Conference south = new Conference("south.txt");
    
    public static void main(String[] args){
        ArrayList<Team> t = new ArrayList<Team>(Arrays.asList(west.winner(),midwest.winner(),east.winner(),south.winner()));
        System.out.println("---Finals---");
        System.out.println(Conference.findWinner(t).name + " won!");
    }
}