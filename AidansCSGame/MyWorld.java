import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (Aidan Christian) 
 * @version (a version number or a date)
 * A korea ship needs to generate on the left side of the screen every .5 seconds
 * The American Missile needs to come out of the front of the heli, one at a time.
 * game needs to end when American class dies
 * Missiles need to die when they reach end of the world
 * 
 * 
 * 
 * 
 * 
 */
public class MyWorld extends World
{
int score=0;

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
     
    
    public void counter()
    {
    score = score +1;
    showText( " The score is "+ score , 100,100);
    
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
