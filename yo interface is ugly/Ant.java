public class Ant implements Movable, Locatable{
    private double s, l;
    
    public Ant (double speed){
        s= speed;
        l = 0;
    }
    
    public void move(){
        l += 2 * s;
    }
    
    public double locate(){
        return l;
    }
}