public class Cubic implements Function{
    private double[] a = new double[4];
    
    public Cubic(double a, double b, double c, double d){
        this.a[0] = a;
        this.a[1] = b;
        this.a[2] = c;
        this.a[3] = d;
    }
    
    public Function add(Function f){
        Cubic q = (Cubic) f;
        for (int x = 0; x < a.length; x++){
            a[x] += q.get()[x];
        }
        return this;
    }
    public Function subtract(Function f){
        Cubic q = (Cubic) f;
        for (int x = 0; x < a.length; x++){
            a[x] -= q.get()[x];
        }
        return this;
    }
    public Polynomial multiply(Function f){
        Cubic c = (Cubic) f;
        int[] i = {
            (int)(a[0] * c.get()[0]),//6
            (int)((a[0] * c.get()[1]) + (a[1] * c.get()[0])),//5
            (int)((a[1] * c.get()[1]) + (a[0] * c.get()[2]) + (a[2] + c.get()[0])), //4
            (int)((a[0] * c.get()[3]) + (a[3] * c.get()[0]) + (a[2] * c.get()[1]) + (a[1] * c.get()[2])), //3
            (int)((a[1] * c.get()[3]) + (a[3] * c.get()[1]) + (a[2] * c.get()[2])),//2
            (int)((a[2] * c.get()[3]) + (a[3] * c.get()[2])), //1
            (int)(a[3] * c.get()[3])
        };
        return new Polynomial(i);
            //x6 x5 x4 x3 x2 x c
            //x3 x2 x c
    }
    
    public double[] get(){
        return a;
    }
}
    
        