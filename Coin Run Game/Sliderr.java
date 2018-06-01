import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sliderr here.
 * 
 * @author (Cara T. & Ashley A.) 
 * @version (a version number or a date)
 */
public class Sliderr extends Actor
{
   public void slide (int x, int y) 
   {
      setLocation(getX()+x, getY()+y);
       
   }
   
}
