/* 
 * AP(r) Computer Science GridWorld Case Study:
 * Copyright(c) 2005-2006 Cay S. Horstmann (http://horstmann.com)
 *
 * This code is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * @author Cay Horstmann
 * @author Chris Nevison
 * @author Barbara Cloud Wells*
 */

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

/**
 * This class runs a world that contains box bugs. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class BoxBugRunner
{
    public static void main(String[] args)
    {
        int[] i = {2,5,6,8,14,56,5,1,5,4,52,52,5,87,85,542,1,2,6,8,4,5,5,2,1,5,4,5,2,1,5,4,87,5,1,2,4,85,52,7,4,76,36,35,6};
        ActorWorld world = new ActorWorld();
        BoxBug alice = new BoxBug(6);
        DancingBug b = new DancingBug(i);
        alice.setColor(Color.ORANGE);
        BoxBug bob = new BoxBug(3);
        //world.add(new Location(7, 8), alice);
        //world.add(new Location(5, 5), bob);
        world.add(new Location(4,3),b);
        world.show();

    }
}