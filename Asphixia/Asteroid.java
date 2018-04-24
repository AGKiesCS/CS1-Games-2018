import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Asteroid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Asteroid extends SpaceMover
{
    public Asteroid()
    {
        double vi = 0.01 + Greenfoot.getRandomNumber(10000)/10000D;
        theta = (Greenfoot.getRandomNumber(1000000)/10000D)%(2D*Math.PI);
        vx = vi*Math.sin(theta); 
        vy = vi*Math.cos(theta);
        vtheta = Greenfoot.getRandomNumber(100000)/1000000D;
    }    
    
    public void spaceAct() 
    {
        // Add your action code here.
    }    
}
