import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AICar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AICar extends Cars
{
    protected Color targetC = Color.GREEN;    

    protected void setColor(Color c) {
        targetC = c;
    }
    
    /**
     * Act - do whatever the AICar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        AIdrive();
    }    

    public void AIdrive() {
        double theta = Math.toRadians(getRotation());
        double r = 50;

        int targetX = (int)(getX() + r*Math.cos(theta));
        int targetY = (int)(getY() + r*Math.sin(theta));
        //getWorld().addObject(new BD(),targetX,targetY);

        GreenfootImage bg = ((MyWorld)getWorld()).getAIMap();
        boolean targetFound = false;
        for ( double dt = 0; dt <= Math.PI/2; dt += Math.PI/24)
        {
            int X = (int)(getX() + r*Math.cos(theta+dt));
            int Y = (int)(getY() + r*Math.sin(theta+dt));
            if ( getColorAt(bg,X,Y).equals(targetC) ) {
                targetX = X;
                targetY = Y;
                targetFound = true;
                //getWorld().addObject(new RD(),targetX,targetY);
                break;
            }
            X = (int)(getX() + r*Math.cos(theta-dt));
            Y = (int)(getY() + r*Math.sin(theta-dt));
            if ( getColorAt(bg,X,Y).equals(targetC) ) {
                targetX = X;
                targetY = Y;
                targetFound = true;
                //getWorld().addObject(new RD(),targetX,targetY);
                break;
            }
        }
        
        if ( targetFound ) {
            turnTowards(targetX, targetY);
            move(3);
        }
        else {
            turn(-1);
            move(2);
        }
    }

    private static Color getColorAt(GreenfootImage i, int x, int y) {
        if ( x < 0 ) x = 0;
        if ( x >= i.getWidth() ) x = i.getWidth()-1;
        if ( y < 0 ) y = 0;
        if ( y >= i.getHeight() ) y = i.getHeight()-1;
        return i.getColorAt(x,y);
    }
    
}
