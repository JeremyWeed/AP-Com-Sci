
/**
 * Write a description of class Creature here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Creature
{
   int health;
   int attack;
   int luck;
   
   public Creature(int h, int a, int l){
       health = Math.abs(h);
       attack = Math.abs(a);
       luck = Math.abs(l);
       
    }
    
   
    public int roll(){
        int roll = (int)(Math.random()*20) + luck;
        roll = Math.min(roll, 20);
        return roll;
    }
}
