import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyCar here.
 * 
 * @author (James Barham and Connor Hayes) 
 * @version (a version number or a date)
 */
public class MyCar extends Cars
{
    GreenfootSound EngineStart = new GreenfootSound("CarEngineStart.mp3");
    GreenfootSound EngineRunning = new GreenfootSound("CarEngineRunning.mp3");

    /**
     * Act - do whatever the MyCar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public MyCar()
    {  
        super();
        getImage(). rotate(90);
    }

    public void act() 
    {

        if(Greenfoot.isKeyDown("up"))
        {
            move(2);
            EngineStart.play();
            EngineRunning.playLoop();
        } 
        else{
            EngineRunning.pause();
        }
        if(Greenfoot.isKeyDown("down"))
        {
            move (-2);
        }    
        if(Greenfoot.isKeyDown("right"))
        {
            turn(3);
        }    
        if(Greenfoot.isKeyDown("left"))
        {
            turn(-3);
        }    
    }

    public void move(int n) {
        super.move(n);
        if ( isTouching(AICar.class) ) {
            super.move(-n);
        }
    }
}

