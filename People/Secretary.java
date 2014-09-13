public class Secretary extends Employee{
    double s;
    double y;
    public Secretary(String name, String ad, int i,double y){
        super(name,ad,i); this.y=y;
    }
    public double computePay(){
        s = (y<100) ? 25000 : (y<150)? 28000: (y<200)? 30000 : 35000;
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