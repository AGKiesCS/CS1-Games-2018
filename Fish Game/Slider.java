import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Slider here.
 * 
 * @author (Sean Parnell/Brandon Harris) 
 * @version (a version number or a date)
 */
public class Slider extends Actor
{
    
   public void slide(int x, int y)
   {
    setLocation(getX()+x, getY()+y  );
   }
    
    
}
