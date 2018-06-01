import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Ball extends slider
{  
    GreenfootSound boop = new GreenfootSound("186669__fordps3__computer-boop.wav");
    
    int right = 2;
    int down = 2;
    /**
     * Act - do whatever the Ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        walk();
        bounce();
        
        // World edge is solid, ball hits world edge it bounces back
        if(isTouching(GoalLeft.class))
        {
            //right = -right;
            //down = -down;
            MyWorld w = (MyWorld) getWorld();
            w.counterRed();
        }
        if(isTouching(GoalRight.class))
        {
            //right = -right;
            //down = -down;
            MyWorld w = (MyWorld) getWorld();
            w.counterBlue();
        }
        if(isTouching(BarRight.class) || isTouching(BarLeft.class) )
        {
            right = -right;
            //playGreenfootSound boop;
        }
       
    }

    void walk()
    {
        
            slide(right,down);
    }

    void bounce()
    {
        //if moving right and hitting east wall, set right to false.
        if(right > 0 && getX() == getWorld().getWidth()-1)
        {
            right = -3; //- Greenfoot.getRandomNumber(5);
         
        }
        //if moving not-right and hitting west wall, set right to true.
        if( right < 0 && getX() == 0)
        {
            right = 3; //+ Greenfoot.getRandomNumber(5);
        }
        //if moving down and hitting south wall, set down to false.
        if( down > 0 && getY() == getWorld().getHeight()-1)
        {
            down = - 3; //- Greenfoot.getRandomNumber(5);
        }
        //if moving not-down and hitting north wall, set down to true.if( down == false && getY() == 0)
        if(down < 0 && getY() == 0)
        {
            down = 3; // + Greenfoot.getRandomNumber(5);
        }

    }
}
