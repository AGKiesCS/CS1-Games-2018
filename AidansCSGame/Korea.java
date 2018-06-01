import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Korea here.
 * 
 * @author (Aidan Christian) 
 * @version (a version number or a date)
 */
public class Korea extends Slider
{
    
    boolean up= true;
    
    
    /**
     * Act - do whatever the Korea wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        
       
        if(up==true) {
            slide(0,-1);
            
        }
        else{
            slide(0,1);
            
        }
        
        if (isAtEdge()== true){
            up = !up;
            
        }
        if (isTouching(American.class)== true)
        {
          removeTouching(American.class);
        }
        
        
    }    
    
}
