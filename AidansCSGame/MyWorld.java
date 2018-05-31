import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (Aidan Christian) 
 * @version (a version number or a date)
 * DONE A korea ship needs to generate on the left side of the screen every .5 seconds
 * DONE The American Missile needs to come out of the front of the heli, one at a time.
 * DONE game needs to end when American class dies
 * DONE Missiles need to die when they reach end of the world
 * 
 * 
 * 
 * 
 * 
 */
public class MyWorld extends World
{
    int score=0;
    int drop = 0;
    int count = 10;

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
    
    public void act() {
        if ( drop > 0 ) 
        {
            drop = drop - 1;
        }
        
        if ( drop == 0 ) 
        {
            drop = count;
            addObject( new Korea(), 0, Greenfoot.getRandomNumber(getHeight()) );
        }
        
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
        American american = new American();
        addObject(american,549,222);
    }
}
