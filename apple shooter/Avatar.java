import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Avatar here.
 * 
 * @author (Haedan) 
 * @version (a version number or a date)
 */
public class Avatar extends Slider
{

    GreenfootSound dartsound = new GreenfootSound("dartthud.mp3");

    int Gunheat = 0;
    int direction = 0;

    double scale = 1.0;

    GreenfootImage pic;

    boolean right = true;
    boolean down = true;

    public Avatar() {
        pic = new GreenfootImage( getImage() );
    }

    /**
     * Act - do whatever the Avatar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {

        //walk();
        //bounce();
        // if its touching another thing of its kind.... spin

        if ( Gunheat > 0 ) 
        {
            Gunheat = Gunheat - 1;
        }

        if ( Gunheat==0 && Greenfoot.isKeyDown("space") == true )
        {
            Dart jim = new Dart();
            getWorld().addObject( jim, getX(), getY() );
            jim.setRotation(  direction  );
            Gunheat= 30;

            dartsound.play();
        }
        if( isTouching(Avatar.class))
        {

        }
        if (  isTouching(Badslidder.class) == true )
        {
            removeTouching(Badslidder.class);
            // Shrink!  // Apply powerup....
            scale = scale*0.9;
            if ( scale < 0.25 ) {
                scale = 0.25;
            }
            updateImage();

        }
        if (isTouching(Slider20.class) == true )
        {
            removeTouching(Slider20.class);
            // Grow!  // Apply powerup....
            scale = scale*1.1;
            
            if ( scale > 2.5 ) {
                scale = 2.5;
            }
            
            updateImage();

            MyWorld W = (MyWorld)getWorld();
            W.counter();

        }
        // how do I make a limit to the size it can grow
        // movement 
        if ( Greenfoot.isKeyDown("left") )
        {
            slide(-2,0);
            direction = 180;
        }
        if ( Greenfoot.isKeyDown("right") )
        {
            slide(2,0);
            direction = 0;
        } 
        if ( Greenfoot.isKeyDown("down") )
        {
            slide(0,2);
            direction = 90;
        } 
        if ( Greenfoot.isKeyDown("up") )
        {
            slide(0,-2);
            direction =270 ;
        }

    }

    void updateImage() {
        GreenfootImage i = new GreenfootImage(pic);
        int width = 1+(int)(scale*i.getWidth());
        int height = 1+(int)(scale*i.getHeight());
        i.scale(width,height);
        setImage(i);

    }
    void walk()
    { 
        // if walking down, set y coordinate +1 
        // else y cordinate -1
        if ( down == true)
        {
            slide(0,1);
        }
        else
        {
            slide(0,-1);
        }
        // if walking right, set x coordinate +1
        // else x coordinate -1
        if ( right == true)
        {
            slide (1,0);
        }
        else
        {
            slide (-1,0);
        }
    }

    void bounce()
    {

        // if moving right and hitting east wall, set right to false.
        if ( right == true && getX() == 599)
        {
            right = false;
        }
        // if moving not-right and hitting west wall, set right to false.
        if ( right == false && getX() == 0)
        {
            right = true;
        }
        // if moving down and hitting south wall, set down to false.
        if ( down == true && getY() == 399)
        {
            down = false;
        }
        // if moving not-down and hitting, north wall, set down to true 
        if ( down == false && getY() == 0)
        {
            down = true;
        }

        // Add your action code here.
        // jump when you press the up arrow key
        // move down when you press the down arrow key
        //move left when you press the left arrow key
        // move right when you press the right arrow key

    }
}
