import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BarLeft here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BarLeft extends Bar
{
    /**
     * Act - do whatever the BarLeft wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("W"))
        {
            slide(0,-2);
        }  
        if(Greenfoot.isKeyDown("S"))
        {
            slide(0,2);
        }  
    }    
}
