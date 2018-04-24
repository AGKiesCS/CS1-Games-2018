import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends SpaceMover
{

    GreenfootSound laser = new GreenfootSound("sfx_laser2.mp3");
    
    double thruster = 0.05;
    double turnSpeed = 0.05;
    
    int gunHeat = 0;

	public Player() {
		super();
		getImage().rotate(90);
	}

    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void spaceAct() 
    {

        

        if ( Greenfoot.isKeyDown("left")  ) 
        {
            //slide(-2,0);
			turn(-turnSpeed);
        }
        if ( Greenfoot.isKeyDown("right")  ) 
        {
            //slide(2,0);
			turn(turnSpeed);
        }
        if ( Greenfoot.isKeyDown("up")  ) 
        {
            //slide(0,-2);
			thrust(thruster);
        }
        if ( Greenfoot.isKeyDown("down")  ) 
        {
            //slide(0,2);
			thrust(-thruster);
        }

        if ( gunHeat > 0 ) {
			gunHeat = gunHeat - 1;
        }        

        if ( gunHeat == 0 && Greenfoot.isKeyDown("space")  ) 
        {
			Laser sorry = new Laser();
            getWorld().addObject( sorry , getX(), getY() );
			sorry.setRotation( getRotation()  );
            gunHeat = 20;
            laser.play();
        }

        
        
        
        
        
        
        
        
        // If the player is hitting the up arrow, thrust forward.
        // If the player is hitting the down arrow, thrust backward.
        // If the player is hitting the left arrow, turn left.
        // If the player is hitting the right arrow, turn right.

        // If the player is hitting the spacebar, create a laser.
        // Also, after putting laser on screen, turn it to face our direction.

        // If we're touching an asteroid.... ow.. die.

    }    
}
