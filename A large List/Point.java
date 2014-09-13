import java.awt.geom.*;
public class Point implements Comparable<Point>{
    Point2D.Double d;
    private double x,y;
    public Point(double x, double y){
        d = new Point2D.Double(x,y);
    }
    
    public Point(){
        d = new Point2D.Double();
    }
    
    public void setLocation(double x, double y){
        d.setLocation(x,y);
    }
    
    public double getX(){
        return d.getX();
    }
    
    public double getY(){
        return d.getY();
    }
    
    public String toString(){
        return "(" + d.getX() + ", " + d.getY() + ")";
    }
    
    public double distance(Point p){
        return d.distance(new Point2D.Double(p.getX(),p.getY()));
    }
    
    public int compareTo(Point p){
        return (d.distance(new Point2D.Double()) - p.distance(new Point()) > 0) ? -1 :  (d.distance(new Point2D.Double()) - p.distance(new Point()) < 0) ? 1 : 0;
    }
    
}