import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpaceMover here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpaceMover extends Actor
{
    
    protected double X,Y,vx,vy,theta,vtheta;
    
    private double WIDTH,HEIGHT;
    
    protected void addedToWorld(World w)
    {
        WIDTH = w.getWidth();
        HEIGHT = w.getHeight();
        X = getX();
        Y = getY();
    }
    
    public void act() 
    {
        X += vx;
        X %= WIDTH;
        if ( Double.compare(X,0) < 0 ) X += WIDTH + X;
        Y += vy;
        Y %= HEIGHT;
        if ( Double.compare(Y,0) < 0 ) Y = HEIGHT + Y;
        setLocation(X,Y);
        theta += vtheta;
        setRotation(theta);
        spaceAct();
    }    
    
    protected void turn(double t)
    {
        vtheta = t;
    }
    
    protected void thrust(double t)
    {
        vx += t*Math.cos(theta);
        vy += t*Math.sin(theta);
    }
    
    private void setRotation(double angle)
    {
        super.setRotation( (int)Math.round(angle / Math.PI * 180D) );
    }
    
    private void setLocation(double x, double y)
    {
        super.setLocation((int)Math.round(x),(int)Math.round(y));
    }
    
    public void spaceAct() 
    {
    }
}
