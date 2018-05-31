import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Missle here.
 * 
 * @author (Aidan Christian) 
 * @version (a version number or a date)
 */
public class Missle extends Actor
{
    boolean edge = true ;

    /**
     * Act - do whatever the Missle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (isTouching(American.class)== true)
        {
            removeTouching(American.class);
            getWorld().removeObject(this);
            Greenfoot.stop();
            return;
        }
        move(1);

        if(isAtEdge()== true){
            getWorld().removeObject(this);
            return;           
        }
        
        if (isTouching(Missile.class)== true)
        {
            removeTouching(Missile.class);
            getWorld().removeObject(this);
            return;
        }
    }    
}
