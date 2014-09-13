public class Square  implements Sizable{
    private double side;
    
    public Square(double side){
        this.side = side;
    }
    
    public double volume(){
        return side*side;
    }
}