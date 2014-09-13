public class Human implements Movable, Locatable{
    private double s, l;
    
    public Human (double speed){
        s = speed;
        l = 0;
    }
    
    public void move(){
        l += s;
    }
    
    public double locate(){
        return l;
    }
}
        
    