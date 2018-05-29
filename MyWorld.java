//Tate Christian and Judd Jenkins
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (Judd Jenkins and Tate Christian) 
 * @version (a version number or a date)
 * If Billy Touches Guard then game over
 * If Billy touches Gold it diseappears and Billy gets one point
 * create a score counter and have a set time limit of 3 min
 * add backgraound music from sound folder (beatsdiscaunted song)(Played on loop)
 * How to get the guard the move through the walls back and forth
 * What do we do with the source notepad?
 * 
 */
public class MyWorld extends World
{
    int score = 0;
GreenfootSound bgmusic = new GreenfootSound("");
// How do we scale the maze to fit the world's borders?
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        prepare();
    }

    public void counter ()
    {
        score = score + 1;

        showText ( "The score is " + score , 100, 100);

    }
    
    
    // how do we keep adding score after we get coins from a chest.
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Billy billy = new Billy();
        addObject(billy,215,174);
        Gold gold = new Gold();
        addObject(gold,504,130);
        gold.act();
        gold.setLocation(504,130);
        gold.setLocation(504,130);
        gold.setLocation(504,130);
        gold.setLocation(504,130);
        gold.setLocation(504,130);
        gold.setLocation(504,130);
        gold.setLocation(504,130);
        gold.setLocation(504,130);
        gold.setLocation(504,130);
        gold.setLocation(504,130);
        gold.setLocation(504,130);
        gold.setLocation(504,130);
        gold.setLocation(504,130);
        gold.setLocation(504,130);
        gold.setLocation(504,130);
        gold.setLocation(504,130);
        gold.setLocation(504,130);
        gold.setLocation(504,130);
        gold.setLocation(504,130);
        gold.setLocation(504,130);
        gold.setLocation(504,130);
        gold.setLocation(504,130);
        gold.setLocation(504,130);
        gold.setLocation(504,130);
        gold.setLocation(504,130);
        gold.setLocation(504,130);
        gold.setLocation(504,130);
        gold.setLocation(504,130);
        gold.setLocation(504,130);
        gold.setLocation(504,130);
        gold.setLocation(504,130);
        gold.setLocation(504,130);
        removeObject(gold);
        removeObject(billy);
        Gold gold2 = new Gold();
        addObject(gold2,263,143);
        removeObject(gold2);
    }
}
