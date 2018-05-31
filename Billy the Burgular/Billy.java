import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Billy here.
 * 
 * @author (Judd Jenkins and Tate Christian) 
 * @version (a version number or a date)
 */
public class Billy extends MazeSlider
{
    int speed = 2;
    
    /**
     * Act - do whatever the Billy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //How to make Billy stop at borders?
        // When actor presses right arrow, move forward
        boolean L = Greenfoot.isKeyDown("left");
        boolean R = Greenfoot.isKeyDown("right");
        boolean U = Greenfoot.isKeyDown("up");
        boolean D = Greenfoot.isKeyDown("down");
        
        boolean move = L || R || U || D;
        if ( move == true ) 
        {
            int dx = 0;
            int dy = 0;
            if ( L && !R ) dx = -speed;
            else if ( R && !L ) dx = speed;
            if ( U && !D ) dy = -speed;
            else if ( D && !U ) dy = speed;
            slide(dx,dy);
        }
        
        if ( isTouching (Gold.class)==true )
        {
            removeTouching(Gold.class);
            ((MyWorld)getWorld()).counter();
        }
        
        Actor guard = getOneIntersectingObject(Guard.class);        
        if ( guard != null )
        {
            MyWorld w = (MyWorld)getWorld();
            if ( w.noWall(this,guard) )
            {
                w.gameOver();
                return;
            }
        }
        
        
        /*
        if (isTouching (Billy.class)==true)
        {
            removeTouching(Billy.class);
        }
        
        if (isTouching (Billy.class)==true)
        {
            removeTouching(Billy.class);
        }
        */
        // When actor presses space in front of chest, open chest
        
        
        // when actor presses up arrow in front of coins, pick up coins
        // when actor presses up arrow in front of ladder, move up ladder
        // When actor presses down arrow in front of ladder move down ladder
    }    
}
