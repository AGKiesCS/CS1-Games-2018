import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Billy here.
 * 
 * @author (Judd Jenkins and Tate Christian) 
 * @version (a version number or a date)
 */
public class Billy extends MazeSlider
{
    /**
     * Act - do whatever the Billy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //How to make Billy stop at borders?
        // When actor presses right arrow, move forward
        if ( Greenfoot.isKeyDown("left"))
        {
           slide (-2,0); 
        }
        // When actor presses left arrow, move backward
         if ( Greenfoot.isKeyDown("right"))
        {
           slide (2,0); 
        }
        //When actor presses right arrow, move right
         if ( Greenfoot.isKeyDown("up"))
        {
           slide (0,-2); 
        }
        //When actor presses left arrow, move left
        if ( Greenfoot.isKeyDown("down"))
        {
           slide (0,2);
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
