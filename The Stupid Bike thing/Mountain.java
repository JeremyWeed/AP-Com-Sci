public class Mountain extends Bicycle{
    int m; 
    public Mountain( String b, int tw, String br){
        super(b, tw, br);
        this. m = 1;
    }
    
    public int getM(){
        return m;
    }
    
    public void setM(int m ){
        this.m = m;
        
    }
    
    public void move(){
        super.move();
        m += 1;
        super.setP( 10+ super.getP() - m);
        
    }
    
    public void makePitStop(){
        super.makePitStop();
        m = 0;
        super.setT(0);
    }
}