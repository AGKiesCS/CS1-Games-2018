import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Ball extends slider
{  
    GreenfootSound boop = new GreenfootSound("186669__fordps3__computer-boop.mp3");
    
    boolean right = true;
    boolean down = true;
    /**
     * Act - do whatever the Ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        walk();
        bounce();
        
        // World edge is solid, ball hits world edge it bounces back
        if(isTouching(Ball.class))
        {
            turn(2);
            MyWorld w = (MyWorld) getWorld();
            w.counter();
        }
       
    }

    void walk()
    {
        // if walking down, set y cord + 1 else y cord -1
        if(down == true)
        {
            slide(0,1);
        }
        else
        {
            slide (0,-1);
        }
        // if walking right, set x cord + 1 else x cord -1
        if (right == true)
        {
            slide (2,0);
        }
        else
        {
            slide(-1,0);
        }
    }

    void bounce()
    {
        //if moving right and hitting east wall, set right to false.
        if(right == true && getX() == 599)
        {
            right = false;
         
        }
        //if moving not-right and hitting west wall, set right to true.
        if( right == false && getX() == 0)
        {
            right = true;
        }
        //if moving down and hitting south wall, set down to false.
        if( down == true && getY() == 399)
        {
            down = false;
        }
        //if moving not-down and hitting north wall, set down to true.if( down == false && getY() == 0)
        if(down == false && getY() == 0)
        {
            down = true;
        }

    }
}
