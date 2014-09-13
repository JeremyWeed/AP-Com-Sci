import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.awt.Color;
import java.util.ArrayList;
public class KingCrab extends CrabCritter{
    public void processActors(ArrayList<Actor> actors){
        for (int i = 0; i < actors.size(); i++){
            try{
                actors.get(i).moveTo(actors.get(i).getLocation().getAdjacentLocation(getLocation().getDirectionToward(actors.get(i).getLocation())));
            }catch(Exception e){
                actors.get(i).removeSelfFromGrid();
            }
        }
    }
}