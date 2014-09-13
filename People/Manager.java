public class Manager extends Employee{
    double s;
    int y;
    public Manager(String name, String ad, int i,int y){
        super(name,ad,i); this.y=y;
    }
    public double computePay(){
        s = (y<=5) ? 50000 : (y<=7)? 60000: 75000;
        return s;
    }
    public void mailCheck(){
        super.mailCheck();
        System.out.print(" with a salary of " + s);
    }
    public String toString(){
        return super.toString() + s + y;
    }
    public double gS(){
        return s;
    }
    public int gY(){
        return y;
    }
    public void sS(double s){
        this.s = s;
    }
    public void sY(int y){
        this.y = y;
    }
}