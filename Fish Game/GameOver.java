import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends Actor
{
    /**
     * Act - do whatever the GameOver wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public GameOver()
    {
       //GreenfootImage img = new GreenfootImage(400,300); 
       //img.drawString("Game Over" , 89,60);
       //setImage(img);
       setImage(new GreenfootImage(" Game Over ",51, Color.WHITE,Color.BLACK));
    }
}