public abstract class Employee{
    String name;
    String ad;
    int i;
    public Employee(String name, String ad, int i){
        this.name = name;
        this.ad = ad;
        this.i = i;
    }
    public abstract double computePay();
    
    public void mailCheck(){
        System.out.print("Mailing a check to " + name + " at " + ad);
    }
    
    public String  toString(){
        return name + ad + i;
    }
    public String gN(){
        return name;
    }
    public String gA(){
        return ad;
    }
    public int gI(){
        return i;
    }
    public void sN(String n){
        name= n;
    }
    
    public void sA(String a){
        ad = a;
    }
    public void sI(int i){
        this.i = i;
    }
}