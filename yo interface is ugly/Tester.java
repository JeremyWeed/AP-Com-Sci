public class Tester{
    public static Sizable[] array = {new Square(3.3), new Circle(3.3), new Rectangle(3.3,6.6), new RectangularPrism(3.3,6.6),new Triangle(3.3,9.9,12.12)};
    public static Movable[] aray = {new Human(5), new Bike(2.0/5.0), new Ant(10), new Plane(5.5, 2.5), new Ship(15.5, 5)};
    public static void main(String[] args){
        
    }
    
    public static void vol(){
        for (Sizable s:array){
            System.out.println(s.volume());
        }
    }
    
    public static void mov(){
        for (int x = 0; x < 5; x++){
            for (Movable m:aray){
                m.move();
                System.out.println(((Locatable) m).locate());
            }
        }
    }
}
            