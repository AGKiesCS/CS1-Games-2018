import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Delte here.
 * 
 * @author (Sean Parnell/Brandon Harris) 
 * @version (a version number or a date)
 */
public class Delte extends Slider
{
    boolean right = true;
    boolean down = true;

    /**
     * Act - do whatever the Delte wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        walk();
        bounce();

        if(isTouching(Delte.class))
        {
            
            turn(2);
            MyWorld w = (MyWorld) getWorld();
            w.counter();
        }    
    }

    void walk()
    {
        //if walking down, set y coordinate +1
        // else y coordinate -1
        if (down == true)
        {
           slide (0,1);
        }
        else
        {
            slide (0,-1);
        }
        //if walking right, set x coordinate +1
        // else x coordinate -1
        if (right == true)
        {
           slide(1,0);
        }
        else
        {
            slide(-1,0);
        }
    }

    void bounce()
    {
        // if moving right and hitting east wall. set rihgt to false.
        if (right == true && getX() == 599)
        {
            setLocation(0,getY());
        }
        // if moving not-right and hitting east wall. set rihgt to false.
        if (right == false && getX() == 0)
        {
            right = true;
        }
        // if mvoing down and hittng south wall, set down to false
        if (down == true && getY() == 399)
        {
            down = false;
        }
        // // if not-moving down and hittng north wall, set down to false
        if (down == false && getY() == 0)
        {
            down = true;
        }
    } 
}   

    
