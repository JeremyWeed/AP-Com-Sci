import info.gridworld.actor.Bug;
import info.gridworld.grid.*;
public class ZBug extends Bug{
    private int length;
    private int steps;
    private boolean onD = false;
    private boolean done = false;
    private int i = 0;
    
    public ZBug(int l){
        length = l;
        setDirection(Location.WEST);
    }
    
    public void act()
    {
        if(steps < length && canMove()){
            move();
            steps++;
        }else if(!onD){
            if(i < 5){
                turn();
                i++;
            }else{
                onD = true;
                steps = 0;
                i = 0;
            }
        }else if (!done){
            if(i < 3){
                turn();
                i++;
            }else{
                done = true;
                steps = 0;
            }
        }else if (done){
        }else{
            System.out.println("error");
        }
    }
        
}