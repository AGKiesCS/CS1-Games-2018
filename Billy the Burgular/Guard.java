import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Guard here.
 * 
 * @author (Tate Christian and Judd Jenkins) 
 * @version (a version number or a date)
 */
public class Guard extends MazeSlider
{
    boolean L = Greenfoot.getRandomNumber(2)==0;
    boolean R = Greenfoot.getRandomNumber(2)==0;
    boolean U = Greenfoot.getRandomNumber(2)==0;
    boolean D = Greenfoot.getRandomNumber(2)==0;
    
    int speed = 3;
    
    int wander = 100;
    
    /**
     * Act - do whatever the Guard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // How do we make the guard turn around every 3 seconds?
        if ( Greenfoot.getRandomNumber(wander)==0 ) L = Greenfoot.getRandomNumber(2)==0;
        if ( Greenfoot.getRandomNumber(wander)==0 ) R = Greenfoot.getRandomNumber(2)==0;
        if ( Greenfoot.getRandomNumber(wander)==0 ) U = Greenfoot.getRandomNumber(2)==0;
        if ( Greenfoot.getRandomNumber(wander)==0 ) D = Greenfoot.getRandomNumber(2)==0;
        
        boolean move = L || R || U || D;
        if ( move == true ) 
        {
            int dx = 0;
            int dy = 0;
            if ( L && !R ) dx = -speed;
            else if ( R && !L ) dx = speed;
            if ( U && !D ) dy = -speed;
            else if ( D && !U ) dy = speed;
            slide(dx,dy);
        }
        
    }    
}
