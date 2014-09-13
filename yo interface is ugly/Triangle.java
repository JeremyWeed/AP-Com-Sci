public class Triangle implements Sizable{
    private double a, b, c;
    
    public Triangle(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public double volume(){
        double s = (a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
}
        
    