public class Unicycle extends Cycle{
    int a;
    
    public Unicycle( String b){
        super(b);
        super.setW(1);
        this.a = 0;
    }
    
    public void makePitStop(){
        super.setP(super.getP() - (2 * super.getW()));
        a = 0;
        super.setT(0);
    }
    
    public void move(){
        if(a > 50 || super.getT() > 50){
            makePitStop();
        }
        else{
            super.setP(  super.getP() + (int)(12.0* super.getW())/super.getT() + (int)(Math.random() * 2));
        }
        super.setT(6/super.getW());
        a++;
    }
    
    public void setA(int a){
        this.a = a;
    }
    
    public int getA(){
        return a;
    }
}