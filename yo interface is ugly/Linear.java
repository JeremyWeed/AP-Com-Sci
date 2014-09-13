public class Linear implements Function{
    private double[] a = new double[2];
    
    public Linear(double a, double b){
        this.a[0] = a;
        this.a[1] = b;
        
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
        Linear q = (Linear) f;
        int[] i = {
            (int)(a[0] * q.get()[0]),//2
            (int)((a[0] * q.get()[1]) + (a[1] * q.get()[0])),//1
            (int)(a[1] * q.get()[1])};
        return new Polynomial(i);
        //x2 x c
    }
    
    public double[] get(){
        return a;
    }
}
    
        