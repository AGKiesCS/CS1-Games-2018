import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    boolean sound = false;
    GreenfootSound bgmusic = new GreenfootSound("Oscify_The_Room.mp3");

    public MyWorld() {
        super(700,600,1);
    }

    public void started() {
        if ( sound ) ````````````````````````````````bgmusic.playLoop();
    }

    public void stopped() {
        bgmusic.pause();
    }

    public void act() 
    {
        if ( Greenfoot.getRandomNumber(20) == 0 ) {
            randomAsteroid();
        }
    }

    public void randomAsteroids(int n)
    {
        while ( n > 0 )
        {
            randomAsteroid();
            n = n - 1;
        }
    }

    public void randomAsteroid() 
    {
        int x = 0;
        int y = 0;

        if ( Greenfoot.getRandomNumber(2) == 0 ) {
            // Left or right.
            if ( Greenfoot.getRandomNumber(2) == 0 ) {
                // Left
                x = 0;
                y = Greenfoot.getRandomNumber(getHeight());
            }
            else {
                // right
                x = getWidth()-1;
                y = Greenfoot.getRandomNumber(getHeight());
            }
        }
        else {
            // Top or bottom.
            if ( Greenfoot.getRandomNumber(2) == 0 ) {
                // Top
                x = Greenfoot.getRandomNumber(getWidth());
                y = 0;
            }
            else {
                // bottom
                x = Greenfoot.getRandomNumber(getWidth());
                y = getHeight()-1;
            }
        }

        
        addObject( new Asteroid(), x, y );
    }

    
}
