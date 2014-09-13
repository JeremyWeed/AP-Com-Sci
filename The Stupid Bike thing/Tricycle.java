public class Tricycle extends Cycle{
   
    public Tricycle( String b){
        
        super(b);
        super.setW(3);
    }
    
    public void move(){
    if (super.getT() > 50){ 
            makePitStop();
        } else {
            super.setP( super.getP() + ( super.getW() /super.getT()) + (int)(Math.random() * 2));
        }
        super.setT(6/super.getW());
    }
    
    public void makePitStop(){
          super.setP(super.getP() - (2 * super.getW()));
          super.setT(0);
        }
    }
    