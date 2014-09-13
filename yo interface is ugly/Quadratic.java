public class Quadratic implements Function{
    private double[] a = new double[3];
    
    public Quadratic(double a, double b, double c){
        this.a[0] = a;
        this.a[1] = b;
        this.a[2] = c;
        
    }
    
    public Function add(Function f){
        Quadratic q = (Quadratic) f;
        for (int x = 0; x < a.length; x++){
            a[x] += q.get()[x];
        }
        return this;
    }
    public Function subtract(Function f){
        Quadratic q = (Quadratic) f;
        for (int x = 0; x < a.length; x++){
            a[x] -= q.get()[x];
        }
        return this;
    }
    public Polynomial multiply(Function f){
        Quadratic q = (Quadratic) f;
        int[] i = {
            (int)(a[0] * q.get()[0]),//4
            (int)((a[0] * q.get()[1]) + (q.get()[0] * a[1])),//3
            (int)((a[0] * q.get()[2]) + (q.get()[0] * a[2]) + (q.get()[1] * a[1])),//2
            (int)((a[2] * q.get()[1]) + (a[1] * q.get()[2])),//1
            (int)(a[2] * q.get()[2])};
        return new Polynomial(i);
        //x4, x3, x2, x, C
        //x2 x c
    }
    
    public double[] get(){
        return a;
    }
}
    
        