import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mia extends Playable
{

    /**
     * Act - do whatever the Mia wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int MiaBaseHP= 35;
        int MiaBaseAtk= 30;
        int MiaBaseDef= 20;
        int MiaBaseRes= 40;
        int MiaBaseSpd= 35;
        int MiaHP= MiaBaseHP-Damage;
        int Damage;
        // Cursor touching Mia them presseng m when coursor touching to move

        if(isTouching(Cursor) && Greenfoot.isKeyDown("m"))
        {
            //move right
            if (Greenfoot.isKeyDown("RIGHT"))
            {
                slide(1,0);
            }
            //move left
            if (Greenfoot.isKeyDown("LEFT"))
            {
                slide(-1,0);
            }
            //move up
            if (Greenfoot.isKeyDown("UP"))
            {
                slide(0,1);
            }
            //move down
            if (Greenfoot.isKeyDown("DOWN"))
            {
                slide(0,-1);
            }
        }

        if(Playable==true && isTouching(potion)==true)
        {
            //Restores HP
            // charecters HP + Restored HP=charecters HP

        }
       
    }    
}
