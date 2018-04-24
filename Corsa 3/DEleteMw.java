import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DEleteMw here.
 * 
 * @author (James Barham and Connor Hayes) 
 * @version (a version number or a date)
 */
public class DEleteMw extends Slider
{   
    boolean right =true;
    boolean down= true; 
    
    /**
     * Act - do whatever the DEleteMw wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    { 
         walk();
         bounce();
         //if ira touching another tthing of its kind... spin
         if (isTouching(DEleteMw.class))
         {
             turn(30);
             MyWorld w = (MyWorld)getWorld();
             w.counter();
         }
            
    }    
    
    void walk()
    {
        // if walking down, set y coordinate +1
        // else y coordinate -1
        if(down==true)
        {
            slide(0,1);
        }
        else
        {
            slide(0,-1);
        }    
   
        
        
        // if walking right, set x coordinate +1
        // else x coordinate -1
        if(right==true)
        {
            setLocation(getX()+1,getY());
        }
        else
        {
            setLocation(getX()-1,getY());
        }    
        
    }
      
    void bounce()
    {
     
       // if moving right and hitting east wall, set right to false. 
       if(right==true && getX()==599)
       {
          right = false;    
       }    
       // if moving not-right and hitting west wall, set right to true. 
       if(right==false && getX()==0)
       {
          right = true;    
       }    
       // if moving down and hitting south wall, set down to false.
       if(down==true && getY()==399)
       {
          down = false;    
       }    
       // if moving not-down and hitting north wall, set down to true. 
       if(down==false && getY()==0)
       {
          down = true;    
       }    
      
        
    }
}
