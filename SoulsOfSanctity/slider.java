import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class slider here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class slider extends Actor
{
   public void slide(int X, int Y)
   {
    setLocation (getX()+X, getY()-Y); 
   }
    
    
}
