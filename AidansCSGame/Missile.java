import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Missile here.
 * 
 * @author (Aidan Christian) 
 * @version (a version number or a date)
 */
public class Missile extends Actor
{
    /**
     * Act - do whatever the Missile wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        if (isTouching(Korea.class)== true)
        {
          removeTouching(Korea.class);
        }
        move(-10);
        if (isTouching(Missle.class)== true)
        {
          removeTouching(Missle.class);
        }
        
      
    }    
}
