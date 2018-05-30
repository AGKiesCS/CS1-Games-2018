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
        //setLocation(getX()+x , getY()+y);
        int X = getX();
        int Y = getY();
        int dX = X + x;
        int dY = Y + y;
        //super.slide(x , y);
        GreenfootImage bg = getWorld().getBackground();
        if ( !bg.getColorAt( dX, dY ).equals(Color.BLACK) ) {
            setLocation(dX,dY);
        }
        else if ( !bg.getColorAt( dX, Y ).equals(Color.BLACK) ) {
            setLocation(dX,Y);
        }
        else if ( !bg.getColorAt( X, dY ).equals(Color.BLACK) ) {
            setLocation(X,dY);
        }
    }
}
