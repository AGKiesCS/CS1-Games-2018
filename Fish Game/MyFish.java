import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyFish here.
 * 
 * @author (Sean Parnell/Brandon Harris) 
 * @version (a version number or a date)
 */
public class MyFish extends Slider
{
    /**
     * Act - do whatever the MyFish wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {

        if (isTouching(SmallFish.class)==true) 
        {
            removeTouching(SmallFish.class);

            GreenfootImage Fish = getImage();
            Fish.scale( Fish.getWidth()+5, Fish.getHeight()+5);
            setImage(Fish);
        }    
        if (isTouching(LargeFish.class)==true) 
        {
            removeTouching(LargeFish.class);

            GreenfootImage Fish = getImage();
            Fish.scale( Fish.getWidth()+5, Fish.getHeight()+5);
            setImage(Fish);
        }  
        if (isTouching(MediumFish.class)==true) 
        {
            removeTouching(MediumFish.class);

            GreenfootImage Fish = getImage();
            Fish.scale( Fish.getWidth()+5, Fish.getHeight()+5);
            setImage(Fish);
        }  
        if (isTouching(PowerUp.class)==true)
        {
          removeTouching(PowerUp.class);
        }
        
        if (Greenfoot.isKeyDown("left") )
        {
            //slide(-2,0);    t
            turn (-2);
        }
        if (Greenfoot.isKeyDown("right") )
        {
            //slide(2,0);   
            turn(2);
        }
        if (Greenfoot.isKeyDown("up") )
        {
            //slide(0,-2);  
            move(-5);
        }
        if (Greenfoot.isKeyDown("down") )
        {
            //slide(0,2);    
            move(5);
        }
        if ( getX() == 0)
        {
            setLocation(599,getY());
        }
        if (getX() == 599)
        {
            setLocation(0,getY());
        }
         if ( getY() == 0)
        {
            setLocation(getX(),399);
        }
        if ( getY() == 399)
        {
            setLocation(getX(),0);
        }

        //why wont my fish go through the left side or top side
        //how to have enemy fish be eaten only when they are smaller 
    }    
}
