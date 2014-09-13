public class Rectangle implements Sizable{
    private double length;
    private double width;
    
    public Rectangle(double length, double width){
        this.width = width;
        this.length = length;
    }
    
    public double volume(){
        return width * length;
    }
}