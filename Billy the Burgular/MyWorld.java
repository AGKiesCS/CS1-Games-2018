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
    int startCoins = 500;
    int startGuards = 25;
    
    
    int score = 0;
    GreenfootSound bgmusic = new GreenfootSound("beatsdiscaunted.mp3");
    // How do we scale the maze to fit the world's borders?
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        showText ( "The score is " + score , getWidth()/2, 5);
        Billy billy = new Billy();
        addObject(billy,22,18);
        addGold(startCoins);
        addGuard(startGuards);
    }

    public void started() 
    {
        bgmusic.playLoop();
    }

    public void stopped()
    {
        bgmusic.stop();
    }

    public void counter()
    {
        score = score + 1;
        showText ( "The score is " + score , getWidth()/2, 5);
    }

    public void gameOver()
    {
        Greenfoot.stop();
        for ( int x = 100; x <= 500; x += 125 ) {
            for ( int y = 100; y <= 500; y += 50 ) {
                showText ( "GAME OVER", x, y);
            }
        }
    }

    public void addGuard(int n) 
    {
        for ( int i = 0; i < n; i++ ) addGuard();
    }

    public void addGuard() 
    {
        int delta = 150;
        int x = Greenfoot.getRandomNumber(getWidth());
        int y = Greenfoot.getRandomNumber(getHeight());
        GreenfootImage bg = getBackground();
        while ( (x <= delta && y <= delta) || bg.getColorAt(x,y).equals(Color.BLACK) ) {
            x = Greenfoot.getRandomNumber(getWidth());
            y = Greenfoot.getRandomNumber(getHeight());
        }
        addObject(new Guard(), x, y);
    }

    public void addGold(int n) 
    {
        for ( int i = 0; i < n; i++ ) addGold();
    }

    public void addGold() 
    {
        int x = Greenfoot.getRandomNumber(getWidth());
        int y = Greenfoot.getRandomNumber(getHeight());
        GreenfootImage bg = getBackground();
        while ( bg.getColorAt(x,y).equals(Color.BLACK) ) {
            x = Greenfoot.getRandomNumber(getWidth());
            y = Greenfoot.getRandomNumber(getHeight());
        }
        addObject(new Gold(), x, y);
    }

    
}
