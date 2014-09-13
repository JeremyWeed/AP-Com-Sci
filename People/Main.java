public class Main{
    Manager m = new Manager("m","123 Seasame Street", 2, 3);
    Secretary s = new Secretary("s","124 Seasame Street", 3, 175);
    Cashier c = new Cashier("c","125 Seasame Street" , 5,7.50,80);
    Employee[] e = {m,s,c};
    public void main(){
        for (int i = 0; i < e.length; i ++){
            e[i].computePay();
            e[i].mailCheck();
        }
    }
}