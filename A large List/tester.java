import java.util.*;
public class tester{
    ArrayList<Point> pl = new ArrayList<Point>(Arrays.asList(new Point(5,3), new Point(4,6), new Point(5,-8), new Point(-9,0), new Point(6,-7)));
    static ArrayList<String> s = new ArrayList<String>(Arrays.asList("hello" , "sam", "you", "are", "a", "wierdo"));
    static ArrayList<Integer> i = new ArrayList<Integer>(Arrays.asList(3,2,1));
    static ArrayList<Integer> i2 = new ArrayList<Integer>(Arrays.asList(2,1));
    public Point[] closest(){
        double d = pl.get(0).distance(pl.get(1));
        Point[] p = {pl.get(0), pl.get(1)};
        for (int i = 0; i < pl.size(); i++){
            for (int e = 0; e < pl.size(); e++){
                if (e != i){
                    if(d > pl.get(i).distance(pl.get(e))){
                        d = pl.get(i).distance(pl.get(e));
                        p[0] = pl.get(i);
                        p[1] = pl.get(e);
                    }
                }
            }
        }
        return p;
    }
    
    public Point closeToOrigin(Point one, Point two){
        return ((one.compareTo(two) > 0) ? one : two);
    }
    
    public static void main(String args[]){

        AssigOne a = new AssigOne();
        System.out.println(a.averageVowels(s));
        System.out.println(a.swapPairs(s));
        System.out.println(a.intersect(i, i2));
        System.out.println(a.removeEvenLength(s));
        System.out.println(a.doubleList(s));
        System.out.println(a.minToFront(i));
        System.out.println(a.removeDuplicates(s));
        System.out.println(a.stutter(s,2));
    }
    

}