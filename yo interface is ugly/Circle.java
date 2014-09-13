public class Circle implements Sizable{
    private double radius;
    public Circle(double radius){
    this.radius = radius;
    }
    
    public double volume(){
        return 2 * Math.PI * radius * radius;
    }
}