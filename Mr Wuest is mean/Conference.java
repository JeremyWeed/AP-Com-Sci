import java.util.*;
public class Conference{
    ArrayList<Team> t = new ArrayList<Team>();
    String s;
    
    public Conference(String s){
        Importer i = new Importer(s);
        parse(i.importIt());
        String r[] = s.split("\\.");
        this.s = r[0];
    }
    
    public Team winner(){
        System.out.println("---" + s + "---");
        return Conference.findWinner(t);
    }
    
    public void parse(ArrayList<String> a){
        for(String s:a){
            String r[] = s.split(" ");
            String u[] = Arrays.copyOfRange(r,1,r.length);
            String l = "";
            for (int i = 0; i < u.length; i++){
                l += u[i] + " ";
            }
            l = l.trim();
            t.add(new Team(l,Integer.parseInt(r[0])));
        }
    }
    
    public static Team findWin(Team one, Team two){
        Team t;
        Team t2;
        
        if(one.name.equals("Duke")) {
            t = two;
            t2 = one;
        }
        else if (two.name.equals("Duke")){
            t = one;
            t2 = two;
        }else{
            
            if (calcOdds(two) < calcOdds(one)){
                t = two;
                t2 = one;
            }else {
                t = one;
                t2 = two;
            }
        }
        System.out.println(t.name + " won against " + t2.name);
        return t;
    }
    
    public static int calcOdds(Team t){
        return t.seed * (int) (Math.random() * 16);
    }
    
    public static Team findWinner(ArrayList<Team> t){
        ArrayList<Team> t2 = new ArrayList<Team>();
        for (int i = 0; i < t.size()/2; i++){
            t2.add(findWin(t.get(i), t.get((t.size()-1)-i)));
        }
        if(t2.size() == 1){
            return t2.get(0);
        }else{
            return findWinner(t2);
        }
    }
}