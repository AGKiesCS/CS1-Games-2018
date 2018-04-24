import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Laser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Laser extends Slider
{
    
    /**
     * Act - do whatever the Laser wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if ( isTouching(Deleteme.class) == true ) 
        {
            removeTouching(Deleteme.class);
            getWorld().removeObject(this);
            return;
        }
        
        
        //slide(0,-10);
        move(10);
        
        if ( isAtEdge() == true ) {
            getWorld().removeObject(this);
            return;
        }
    } 
    
    public void move(int n) {
        super.move(n);
        if ( isTouching(Asteroid.class) ) 
        {
            super.move(-n);
        }
    }
    
}
