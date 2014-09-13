public class RectangularPrism implements Sizable{
    private double height;
    private double length;
    
    public RectangularPrism(double height, double length){
        this.height = height;
        this.length = length;
    }
    
    public double volume(){
        return height * length;
    }
}