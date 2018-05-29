import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Playable here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Playable extends  Charectors
{
    /**
     * Act - do whatever the Playable wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void Movement() 
    {
        // Add your action code here.
          //move right
          int Playable;
          int damage;
          int DefUp=5;
          int AtkUp=5;
          int ResUp=5;
          int SpdUp=5;
          
       if (Greenfoot.isKeyDown("RIGHT"))
       {
           slide(3,0);
        }
        //move left
         if (Greenfoot.isKeyDown("LEFT"))
       {
           slide(-3,0);
        }
        //move up
        if (Greenfoot.isKeyDown("UP"))
       {
           slide(0,3);
        }
        //move down
        if (Greenfoot.isKeyDown("DOWN"))
       {
           slide(0,-3);
        }
        
    }    
}
