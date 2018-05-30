import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (Christian lerma) 
 * @version (a version number or a date)
 * 
 * need to add a grid to world 
 * add random amount of enemies on the right 
 * add random amounts of power ups
 * fix attack code so it runs 
 * add code to remove playable charecters when their HP=0
 * add code that give playable stats
 * fix music code
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class MyWorld extends World
{

    int score=0;
    Greenfootsounds bgmusic = new GreenfootSound ("LukHash_THE_OTHER_SIDE.mp3");
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

    public void act()
    {

    }
    //music
    public void started() 
	{
		bgmusic.playLoop();
	}
	
	public void stopped()
	{
		bgmusic.pause();
	}

    public void addObject()
    {
        //add potion


    }
    /*public void addObject()
    {
        //add Enemy


    }*/
}
