import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dart extends Actor
{
    /**
     * Act - do whatever the Dart wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {

        move(5);
        
        if (isTouching(Slider20.class) == true )
        {
            removeTouching(Slider20.class);
            
            MyWorld W = (MyWorld)getWorld();
            W.counter();

        }

        if ( isTouching(Badslidder.class) == true )
        {
            removeTouching(Badslidder.class);  
            MyWorld W = (MyWorld)getWorld();
            W.counter();

        }

        if (  isAtEdge() == true ) 
        {
            getWorld().removeObject(this);
            return;
        }

        
    }
          
    
}
