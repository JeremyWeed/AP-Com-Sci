public class Plane implements Movable, Locatable{
    private double s, l, r;
    
    public Plane(double s, double r){
        this.s = s;
        this.r = r;
        l = 0;
    }
    
    public void move(){
        l += s/r;
    }
    
    public double locate(){
        return l;
    }
}
    