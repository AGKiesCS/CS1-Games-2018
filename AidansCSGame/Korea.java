import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Korea here.
 * 
 * @author (Aidan Christian) 
 * @version (a version number or a date)
 */
public class Korea extends Slider
{
    
    
    
    /**
     * Act - do whatever the Korea wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        
       
        slide(1,0);
        
        if (isAtEdge()== true){
            getWorld().removeObject(this);
            return;
        }
        
        
        
    }    
    
}
