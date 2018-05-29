import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MazeSlider here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MazeSlider extends Slider
{
    public void slide (int x, int y) {
        int bx = getX();
        int by = getY();
        super.slide(x , y);
        GreenfootImage bg = getWorld().getBackground();
        if ( bg.getColorAt( getX(), getY() ).equals(Color.BLACK) ) {
            setLocation(bx,by);
        }
    }
}
