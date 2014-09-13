
import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;
import java.awt.Color;
import java.util.ArrayList;
public class RockHound extends Critter{
    public void ProcessActors(ArrayList<Actor> actors){
        for (int i = 0; i < actors.size(); i ++){
            if(actors.get(i).toString().substring(20,24).equals("Rock")){
                actors.get(i).removeSelfFromGrid();
            }
        }
    }
}