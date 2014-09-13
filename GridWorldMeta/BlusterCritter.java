
import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.awt.Color;
import java.util.ArrayList;
public class BlusterCritter extends Critter{
    int c;
    public BlusterCritter(int c){
        this.c = c;
    }
    public ArrayList<Actor> getActors(){
        ArrayList<Actor> actors = new ArrayList<Actor>();
        for(int i = getLocation().getRow()-2; i < getLocation().getRow() + 2; i++){
            for(int e = getLocation().getCol()-2; e < getLocation().getCol() + 2; e++){
                Actor a = getGrid().get(new Location(i,e));
            if (a != null)
                actors.add(a);
            }
        }
        return actors;
    }
    public void processActors(ArrayList<Actor> actors){
        if (actors.size() > c){
            setColor(new Color((int)(getColor().getRed() *.9), (int)(getColor().getGreen() *.9), (int)(getColor().getBlue() *.9)));
        }else{
            setColor(new Color((int)((getColor().getRed() < 255) ? getColor().getRed() *1.01 : 255), (int)((getColor().getGreen() < 255) ? getColor().getGreen() *1.01 : 255), (int)((getColor().getBlue() < 255) ? getColor().getBlue() *1.01 : 255)));
        }
    }

}