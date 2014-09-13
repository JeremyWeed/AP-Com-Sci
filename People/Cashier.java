public class Cashier extends Employee{
    double s;
    double y;
    public Cashier(String name, String ad, int i,double y, double s){
        super(name,ad,i); this.y=y;this.s=s;
    }
    public double computePay(){
        
        return s*y;
    }
    public void mailCheck(){
        super.mailCheck();
        System.out.print(" with a salary of " + s*y);
    }
    public String toString(){
        return super.toString() + s + y;
    }
    public double gS(){
        return s;
    }
    public double gY(){
        return y;
    }
    public void sS(double s){
        this.s = s;
    }
    public void sY(double y){
        this.y = y;
    }
}