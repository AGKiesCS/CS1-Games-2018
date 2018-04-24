import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Deleteme here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Deleteme extends Slider
{
    boolean right = true;
    boolean down = true;   
    
    
    /**
     * Act - do whatever the Deleteme wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        walk();
        bounce();
        
        // If it's touching another thing of its kind.... spin!
        if ( isTouching(Deleteme.class)   ) 
        {
            turn(3);
            MyWorld w = (MyWorld)getWorld();
        }
        
    } 
    
    void walk()
    {
        // if walking down, set y coordinate +1
        // else y coordinate -1
        if ( down == true )
        {
            slide(0,1);
        }
        else
        {
            slide(0,-1);
        }
        // if walking right, set x coordinate +1
        // else x coordinate -1
        if ( right == true )
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
        // if moving right and hitting east wall, set right to false.
        if ( right == true && getX() == 599 )
        {
            //setLocation(0,getY());
            right=false;
        }
        // if moving not-right and hitting west wall, set right to true.
        if ( right == false && getX() == 0 )
        {
            //setLocation(599,getY());
            right=true;
        }
        // if moving down and hitting south wall, set down to false.
        if ( down == true && getY() == 399 )
        {
            //setLocation(getX(),0);
            down = false;
        }
        // if moving not-down and hitting north wall, set down to true.
        if ( down == false && getY() == 0 )
        {
            //setLocation(getX(),399);
            down = true;
        }
    }
    
}
