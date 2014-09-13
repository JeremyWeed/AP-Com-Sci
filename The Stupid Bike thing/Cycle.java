public abstract class Cycle{
    int p;
    int w;
    int t;
    String b;
    
    public Cycle( String b){
        this.p = 0;
        this.w = 0;
        this.t = 1;
        this.b = b;
    }
    
    public void reset(){
        this.p = 0;
        this.w = 0;
        this.t = 0;
        };
    abstract public void move();
    abstract public void makePitStop();
    
    public void setP(int p){
        this.p = p;
    }
    
    public void setW(int w){
        this.w = w;
    }
    
    public void setT(int t){
        this.t = t;
    }
    
    public void setB(String b){
        this.b = b;
    }
    
    public int getP(){
        return p;
    }
    
    public int getW(){
        return w;
    }
    
    public int getT(){
        return t;
    }
    
    public String getB(){
        return b;
        
    }
}