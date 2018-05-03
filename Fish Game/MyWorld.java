import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (sean parnell/brandon harris) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    int score = 0;
    public void counter()
    {
     score = score +1;
     showText("The score is"+ score,90,20);
       
    }

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    //public void act()
    //{
    //int x = Greenfoot.getRandomNumber(600); 
    //int y = Greenfoot.getRandomNumber(400); 
    //addObject(new Delte(), x, y );
    // }
}
