import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    int score=0;
    //Greenfootsounds bgmusic = new GreenfootSound ("");
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(4000, 3000, 1); 
    }
    public void counter ()
    {
        score= score + 1;
        showText("the score is"+ score ,90,2980 );
    }
    
   /* public void act()
    {
        
    }
    //music
     public void started()
    {
        bgmusic. playloop();
    }
     public void stopped()
    {
        bgmusic.pause();
    }*/
}
