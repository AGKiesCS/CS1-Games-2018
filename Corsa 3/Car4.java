import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Car4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car4 extends AICar
{
     
    public void act() {
        super.act();
        
        if ( Greenfoot.getRandomNumber(100) == 0 ) {
            setColor(Color.BLUE);
        }
        if ( Greenfoot.getRandomNumber(100) == 0 ) {
            setColor(Color.GREEN);
        }
        
    }
    
}
