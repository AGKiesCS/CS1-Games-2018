import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (Ashley A. & Cara R.) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    GreenfootSound bgmusic = new GreenfootSound("CoinRunMusic.mp3");

    int score = 0;

    int level = 1;

    public void started()
    {
        bgmusic.playLoop();
    }

    public void stopped()
    {
        bgmusic.pause();
    }

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

    public void act() 
    {
        if ( level == 1 ) 
        {
            showText("Objective: collect until you're buried",175, 50 );
            randomCoin();
        }
        else if ( level == 2 )
        {
            showText("ROUND 2",60, 40 );
        }
        else if (level == 3 )
        {
            showText("FINAL ROUND",60, 40 );
        }
        
    } 
    //control amount?
    public void randomCoin() {
        int x = 80 + Greenfoot.getRandomNumber( getWidth()-160 );
        int y = 40 + Greenfoot.getRandomNumber( getHeight()-80 );
        addObject( new deletey(), x, y );

    }
    //The score increases even when Hero isn't collecting coins.
    public void collectcoin()
    {
        score = score + 1;
        showText("The score is "+ score , 100, 20 );

    }

    //How do we set screen boundaries at a given time/game level?
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Hero hero = new Hero();
        addObject(hero,285,380);
    }
}
