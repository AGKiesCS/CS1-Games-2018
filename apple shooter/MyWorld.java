import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World

{

    //how do I add a background
    //setBackground(backgroundSpace_01.1)
    //setBackground(OpenGameBackground.jpeg);

    GreenfootSound bgmusic = new GreenfootSound("415804__sunsai__mushroom-background-music.mp3");
    int score = 0;

    public void started () {
        bgmusic.playLoop();

    }

    public void stopped () {
        bgmusic.pause();

    }

    // Add n random Monsters to the screen
    // This code belongs in your World.
    // This code is a method. It belongs inside your World, 
    // but outside any other methods
    public void addSlidder20(int n)
    {
        if ( n < 0 ) n = -n;
        while ( n > 0 )
        {
            int x = Greenfoot.getRandomNumber( getWidth() );
            int y = Greenfoot.getRandomNumber( getHeight() );
            addObject( new Slider20(), x, y );
            n = n - 1;
        }
    }

    public void counter ()
    {
        score = score + 1;

        showText( "the score is " + score , 100 , 100);

    }

    // 
    public void act()
    {
        if( score == 100 );
        {
            //how do I add a background
            setBackground("tilesetOpenGameBackground.png");
            //setBackground(OpenGameBackground.jpeg);   

        }
    }

    public void addBadlidder(int n)
    {
        if ( n < 0 ) n = -n;
        while ( n > 0 )
        {
            int x = Greenfoot.getRandomNumber( getWidth() );
            int y = Greenfoot.getRandomNumber( getHeight() );
            addObject( new Badslidder(), x, y );
            n = n - 1;
        }
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

}
