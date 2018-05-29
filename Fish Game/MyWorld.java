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
    GreenfootSound song = new GreenfootSound("ASliceOfTime2.wav"); 
    //int size = getImage().getWidth();
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
        super(1000, 600, 1);

        prepare();
    }
    
    
    
    
    public void act()
    {
        
        song.playLoop();
        
        if (Greenfoot.getRandomNumber(100)<1) 
        {int x = getWidth()-1;
            int y = Greenfoot.getRandomNumber(getHeight() );
            addObject( new SmallFish(), x, y);

        }
        if (Greenfoot.getRandomNumber(500)<1) 
        {int x = getWidth()-1;
            int y = Greenfoot.getRandomNumber(getHeight() );
            addObject( new MediumFish(), x, y);

        }
        if (Greenfoot.getRandomNumber(1000)<1) 
        {int x = getWidth()-1;
            int y = Greenfoot.getRandomNumber(getHeight() );
            addObject( new LargeFish(), x, y);

        }
        if (Greenfoot.getRandomNumber(3300)<1) 
        {
            int x = getWidth()-1;
            int y = Greenfoot.getRandomNumber(getHeight() );
            addObject( new PowerUp(), x, y); 

    
        }
         if (Greenfoot.getRandomNumber(3000)<1) 
        {
            int x = getWidth()-1;
            int y = Greenfoot.getRandomNumber(getHeight() );
            addObject( new PowerDown(), x, y); 

    
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
        /**
         * Prepare the world for the start of the program.
         * That is: create the initial objects and add them to the world.
         */

    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        MyFish myfish = new MyFish();
        addObject(myfish,507,320);
        myfish.setLocation(492,311);
        myfish.setLocation(521,309);
    }
}
