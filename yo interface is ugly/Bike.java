public class Bike implements Movable, Locatable{
    private double r, l;
    
    public Bike(double radius){
        r = radius;
        l = 0;
    }
    
    public void move(){
        l += 2 * Math.PI * r;
    }
    
    public double locate(){
        return l;
    }
}