import java.util.Scanner;
import java.awt.Color;
public class Methods
{
    static Scanner s = new Scanner(System.in);

    static int acount = 0;
    public static void main(String args[]){
        Methods m = new Methods();
        System.out.println(m.countA("applea"));
    }

    public static void powertsOfTwo(){
        System.out.print("2,4,8,16,32,64,128,256,512,1024");
    }

    public static void alarm(int g){
        for (int i = 0; i < g; i++){
            System.out.println("Alarm!");
        }
    }

    public static int sum100(){
        int y = 0;
        for (int i = 1; i <=100; i++){
            y +=i;
        }
        return y;
    }

    public static int sumRange(int one, int two){
        int range = (two - one);
        int total = 0;
        for (int i = 0; i < range; i++){
            total += (one + i);
        }
        return total;
    }

    public static int maxOfTwo(int y, int x){
        return Math.max(y, x);
    }

    public static boolean larger(double y, double x){
        if(y > x) return true;
        else return false;
    }

    public static int countA(String e){
        if(e.indexOf("A") != -1){
            acount++;
            countA(e.substring(e.indexOf("A")+1));
        }
        return acount;
    }

    public static boolean evenlyDivisible( int y, int x){
        if((y%x == 0) || (x%y == 0)) return true;
        else return false;
    }

    public static double average(int x, int y, int z){
        return (x + y + z)/3.0;
    }

    public static double average(int x, int y, int z, int i){
        return (x+y+z+i)/4.0;
    }

    public static String multiConcat (String s, int i){
        String f = s;
        for (int o = 0; o < i; o++){
            f += s;
        }
        return f;
    }

    public static String multiConcat(String s){
        return s + s;
    }

    public static boolean isAlpha(char c){
        String cs = Character.toString(c);
        cs.toLowerCase();
        if ("abcdefghijklmnopqrstuvwxyz".indexOf(cs) != 0)return true;
        else return false;
    }

    public static int validate(int x, int y, int z){
        if( x<=z && z<=y)return z;
        else {
            System.out.println("Idiot.  That is wrong.  insert a new one");
            return validate(x,y, Integer.parseInt(s.next()));
        }
    }

    public static String reverse(String s){
        return new StringBuffer(s).reverse().toString();

    }

    public static boolean isIsoceles(int x, int y, int z){
        if( x==y && y==z) return false;
        else if ( x==y || x==z || z==y) return true;
        else return false;
    }

    public static int randomInRange(int x, int y){
        return (int)(Math.random() * (y-x + 1) + x);
    }

    public static int randomInRange(int x){
        return (int) (Math.random() * (x) + 1); 
    }

    public static Color randomColor(){
        return new Color( (int)(Math.random() * 256), (int)(Math.random() * 256), (int)(Math.random() * 256));
    }

    public static String firstTwo(String s){
        if (s.length() <=2) return s;
        else return s.substring(0, 2);
    }

    public static String helloName( String s){
        return ("Hello " + s + "!");
    }

    public static String firstHalf(String s){
        return s.substring(0, s.length()/2);
    }

    public static String front22(String s){
        return firstTwo(s) + s + firstTwo(s);
    }

    public static boolean lastDigit(int x, int y){
        if(x%10 == y%10) return true;
        else return false;
    }

    public static boolean mixStart(String s){
        if (s.substring(1, 3).equals("ix"))return true;
        else return false;
    }

    public static String stringBits(String s){
        String r = "";
        for (int i = 0; i <= s.length(); i+=2){
            r += s.substring(i, i +1);
        }
        return r;
    }

    public static String getSandwich(String s){
        if (s.indexOf("bread") == -1) return "";
        else return s.substring(s.indexOf("bread") + 5, s.substring(s.indexOf("bread")+5).indexOf("bread")+5);
    }

    public static int code(String s){
        int num = 0;
        boolean done = false;
        while (!done){
            if ((s.indexOf("co") != -1) && (s.substring(s.indexOf("co")+3, s.indexOf("co") + 4).equals("e"))){
                num++;
                s = s.substring(s.indexOf("co") + 3);
            }
            else{
                done = true;
            }

        }
        return num;
    }

    public static String uCase(String s){
        String r = "";
        if(s.length() <= 3) return s.toUpperCase();
        else{
            r = s.substring(s.length() - 3);
            s = s.substring(0 , s.length() - 3);
            r = r.toUpperCase();
            s += r;
            return s;
        }
    }
}

