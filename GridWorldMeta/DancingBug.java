import info.gridworld.actor.Bug;

public class DancingBug extends Bug{
    int[] i;
    int locationA = 0;
    int r = 0;
    int y = 0;
    public DancingBug(int[] i){
        this.i = i;
    }
    public void act(){
        switch (r){
            case 0:
                if(y < i[locationA]){
                    turn();
                    y++;
                }else{
                    r = 1;
                    y = 0;
                }
              break;
            case 1:
                if(locationA >= i.length - 1){
                    locationA = 0;
                }else{
                    move();
                    locationA++;
                    r = 0;
                }
            }
        }
}