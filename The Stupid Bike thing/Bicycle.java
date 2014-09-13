public class Bicycle extends Cycle{
    
    int tw;
    String br;
    
    public Bicycle( String b, int tw, String br){
        
        super(b);
        this.tw = tw;
        this.br = br;
        super.setW(2);
    }
    
    public void move(){
        if (super.getT() > 50){ 
            makePitStop();
        } else {
            super.setP(  super.getP() + (tw /super.getT()) + (int)(Math.random() * 2));
        }
        super.setT(6/super.getW());
        
    }
    
    public void makePitStop(){
        super.setP(super.getP() - (2 * super.getW()));
        super.setT(0);
    }
    
    public void setT(int tw){
        this.tw = tw;
    }
    
    public void setBr(String br){
        this.br = br;
    }
    
    public int getTw(){
        return tw;
    }
    
    public String getBr(){
        return br;
    }
        
}