import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cursor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cursor extends Playable
{
    /**
     * Act - do whatever the Cursor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        //coursers movement
        //move right
        //GifImage Coursor = new Gifimage("coursor.)
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
       
       if ( isTouching(Playable) && Greenfoot.isKeyDown("m") )
       {
           
        }
        
        
        

       }
     
   }    

