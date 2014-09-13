public class Ship implements Movable, Locatable{
    private double l, s, w;
    
    public Ship(double s, double w){
        this.s = s;
        this.w = w;
        l = 0;
    }
    
    public void move(){
        l += s;
        l -= w;
    }
    
    public double locate(){
        return l;
    }
}