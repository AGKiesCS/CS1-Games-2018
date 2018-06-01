import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class deletey here.
 * 
 * @author (Ashley A. & Cara T.) 
 * @version (a version number or a date)
 */
public class deletey extends Sliderr
{
    /* 
     * How can a class damage another class(health/armor system)?
     * How can a class collect another class?
     * How you apply a class to another class(Hero collecting armor/health potion)?
     * How do you resize an image? -probably in gimp 
     */
    boolean right = true;
    boolean down = true;
    
    /**
     * Act - do whatever the deletey wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        walk();
        bounce();
        
        //if it's touching another thing of its kind....spin
        if (isTouching (deletey.class))
        {
            
            MyWorld w = (MyWorld)getWorld();
            w.collectcoin();
        }
        
      
    }    
    
    void walk()
    {
        //if walking down, set y coordinate +1
        //else y coordinate -1
        if (down == true)
        {
            slide(0,1);
        }
        else
        {
            slide(0,-1);
        }
        //if walking right, set x coordinate +1
        //else x coordinate -1
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
        
        // if moving right and hitting east wall, set right to false.
        if ( right == true && getX() == 599 )
        {
            right = false;
        }
        
        // if moving !right and hitting west wall, set right to true.
        if ( !right == true && getX() == 0 )
        {
            right = true;
        }
        
        // if moving down and hitting south wall, set right to false.
        if ( down == true && getY() == 399 )
        {
            down = false;
        }
        
        // if moving !down and hitting north wall, set right to true.
        if ( !down == true && getY() == 0 )
        {
            down = true;
        }
        
    }  
}

