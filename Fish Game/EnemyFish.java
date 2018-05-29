import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyFish here.
 * 
 * @author (Sean Parnell/Brandon Harris) 
 * @version (a version number or a date)
 */
public class EnemyFish extends Slider
{
    int vx = 0;
    int vy =0;
    
    protected void addedToWorld(World w){
        vx = Greenfoot.getRandomNumber(3)+1;
        vy = Greenfoot.getRandomNumber(3)+1;
        
        if ( Greenfoot.getRandomNumber(2) == 0 ) vx = -1 * vx;
        if ( Greenfoot.getRandomNumber(2) == 0 ) vy = -1 * vy;
    }    
    
    /**
     * Act - do whatever the EnemyFish wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        slide (vx,vy);
        
    


        if(isTouching(MyFish.class))
        {

            MyWorld w = (MyWorld) getWorld();
            w.counter();
        }    
    
        // Move around the screen randomly
        // If at the edge of the screen loop around to the other side
        // If bigger than player fish and touching player fish eat player fish 
        // If smaller than player fish and touching player fish die
        // how to get fish to loop around to other side
        // how to kill players fish when touching and bigger
    }    
    
   public void slide(int x, int y)
   {
       
        
       int gotoX = getX()+x;
       int gotoY = getY()+y;
       
       if ( gotoX < 0 )
       {
           gotoX = gotoX + getWorld().getWidth();
       }
       else if ( gotoY >= getWorld().getWidth()  )
       {
           gotoX = gotoX - getWorld().getWidth();
       }
       
       if ( gotoY < 0 )
       {
           gotoY = gotoY + getWorld().getHeight();
       }
       else if ( gotoY >= getWorld().getHeight()  )
       {
           gotoY = gotoY - getWorld().getHeight();
       }
       
       setLocation( gotoX, gotoY  );
       if ( getX() == 0)
        {
            setLocation(999,getY());
        }
        else if (getX() == 999)
        {
            setLocation(0,getY());
        }
        if ( getY() == 0)
        {
            setLocation(getX(),599);
        }
        else if ( getY() == 599)
        {
            setLocation(getX(),0);
        }
   }
    
}
