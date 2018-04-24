import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class delete here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class delete extends slider
{
    boolean right = true;
    boolean down = true;
    
    
    
    
    
    /**
     * Act - do whatever the delete wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        walk();
        bounce();
        // spin if touch same kind
        if(isTouching(delete.class))
        {
          turn(90);
          MyWorld w = (MyWorld)getWorld();
          w.counter();
        }
        
    }    
    
    void walk()
    {
        // if walking down, set y coordanate +1
        if ( down == true)
        {
           slide(0,1);
        }
        else // else y coordanate-1
        {
            slide(0,-1);
        }
       
         // if walking right, set x coordanate +1
         if ( right == true)
        {
             slide(1,0);
        }
        // else x coordanate-1
        else 
        {
            slide(-1,0);
        }
       
    }    
     void bounce()
    {
      // if moving right and hitting east wall, set right to false
      if( right==true && getX()==1999)
      {
          right= false;
        }
      // if moving not-right and hitting wast wall, set right to true
      if( right==false && getX()==0)
      {
          right= true;
        }
      // if moving down and hitting south wall, set down to false
      if( down==true && getY()==1999)
      {
          down= false;
        }
      // if moving not-down and hitting north wall, set down to true
      
       if( down==false && getY()==0)
      {
          down= true;
        }
    }    
}
