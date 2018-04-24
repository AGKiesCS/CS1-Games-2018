import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BarRight here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BarRight extends Bar
{
    /**
     * Act - do whatever the BarRight wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("Up"))
        {
            slide(0,-2);
        }
        if(Greenfoot.isKeyDown("Down"))
        {
            slide(0,2);
        }  
    }
}
