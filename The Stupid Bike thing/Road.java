public class Road extends Bicycle{
    int ph;
    
    public Road( String b, int tw, String br){
        super( b, tw, br);
        this.ph = 1;
    }
    
    public void move(){
        super.move();
        ph += 1;
        super.setP( 10+ super.getP() - ph);
    }
    
    public void setPh(int ph){
        this.ph = ph;
    }
    
    public int getPh(){
        return ph;
    }
    
    public void makePitStop(){
        super.makePitStop();
        ph = 0;
        super.setT(0);
    }
}