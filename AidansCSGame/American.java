import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class American here.
 * 
 * @author (Aidan Christian) 
 * @version (a version number or a date)
 */
public class American extends Slider
{
    /**
     * Act - do whatever the American wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // How to fire missle
         if ( Greenfoot.isKeyDown("left"))
        {
           slide (-2,0); 
        }
       
         if ( Greenfoot.isKeyDown("right"))
        {
           slide (2,0); 
        }
        
         if ( Greenfoot.isKeyDown("up"))
        {
           slide (0,-2); 
        }
        
        if ( Greenfoot.isKeyDown("down"))
        {
           slide (0,2);
        }
        if ( Greenfoot.isKeyDown("space"))
        {
            
        }
        
        
        
        
        
        
        
        
        
        
        
        if (Greenfoot.isKeyDown("space") )
        {
          getWorld() .addObject(new Missile(), getX(), getY()-40) ;
        }
    }    
}
