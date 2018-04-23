import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Badslidder here.
 * 
 * @author (Haedan) 
 * @version (a version number or a date)
 */
public class Badslidder extends Slider
{
    boolean right = true;
    boolean down = true;

    /**
     * Act - do whatever the Slider20 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        walk();
        bounce();
    } 

    void walk()
    { 
        // if walking down, set y coordinate +1 
        // else y cordinate -1
        if ( down == true)
        {
            slide(0,1);
        }
        else
        {
            slide(0,-1);
        }
        // if walking right, set x coordinate +1
        // else x coordinate -1
        if ( right == true)
        {
            slide (1,0);
        }
        else
        {
            slide (-1,0);
        }
    }

    void bounce()
    {

        // if moving right and hitting east wall, set right to false.
        if ( right == true && getX() == 599)
        {
            right = false;
        }
        // if moving not-right and hitting west wall, set right to false.
        if ( right == false && getX() == 0)
        {
            right = true;
        }
        // if moving down and hitting south wall, set down to false.
        if ( down == true && getY() == 399)
        {
            down = false;
        }
        // if moving not-down and hitting, north wall, set down to true 
        if ( down == false && getY() == 0)
        {
            down = true;
        }

        // Add your action code here.
        // jump when you press the up arrow key
        // move down when you press the down arrow key
        //move left when you press the left arrow key
        // move right when you press the right arrow key

            
    }
}
