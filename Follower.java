import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Follower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Follower extends Slider
{
   
    Avatar owner;
    int X;
    int Y;

    int Gunheat = 0;
    int direction = 0;
    int shootdirection = 0;

    //double scale = 1.0;

    GreenfootImage pic;

    boolean right = true;
    boolean down = true;

    public Follower(Avatar michal, int x, int y) {
        pic = new GreenfootImage( getImage() );
        owner = michal;
        X = x;
        Y = y;        
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
        boolean shootLeft = Greenfoot.isKeyDown("a");
        boolean shootRight = Greenfoot.isKeyDown("d");
        boolean shootUp = Greenfoot.isKeyDown("w");
        boolean shootDown = Greenfoot.isKeyDown("s");
        boolean shoot = shootLeft || shootRight || shootUp || shootDown;

        if ( Gunheat > 0 ) 
        {
            Gunheat = Gunheat - 1;
        }

        if ( Gunheat==0 && shoot == true )
        {
            MyWorld w = (MyWorld)getWorld();
            int width = getImage().getWidth()/2;
            int height = getImage().getHeight()/2;
            int x = getX() + width;
            int y = getY();

            shootdirection = 0;
            if ( shootLeft ) shootdirection = 180;
            else if ( shootUp ) shootdirection = 270;
            else if ( shootDown ) shootdirection = 90;

            if ( shootdirection == 180 ) {
                x = getX() - width;
                y = getY();
            }
            else if ( shootdirection == 270 ) {
                x = getX();
                y = getY()-height;
            }
            else if ( shootdirection == 90 ) {
                x = getX();
                y = getY()+height;
            }

            int apples = ( (MyWorld)getWorld() ).applec();
            if (apples >= 21)
            {
                Dart jim = new Dart();
                Dart jim2 = new Dart();
                Dart jim3 = new Dart();
                getWorld().addObject( jim, x, y );
                getWorld().addObject( jim2, x, y );
                getWorld().addObject( jim3, x, y );
                jim.setRotation(  shootdirection-10  );
                jim2.setRotation(  shootdirection  );
                jim3.setRotation(  shootdirection+10  );
            }
            else
            {
                Dart jim = new Dart();
                getWorld().addObject( jim, x, y );
                jim.setRotation(  shootdirection  );
            }
            Gunheat= 30;

            
        }
        
            
        updateImage();

        
        if (  isTouching(Slider20.class) == true )
        {
            removeTouching(Slider20.class);
            MyWorld W = (MyWorld)getWorld();
            W.apple();            

        }

        if (  isTouching(Badslidder.class) == true )
        {
            removeTouching(Badslidder.class);
            // Shrink!  // Apply powerup....
            

        }

        // follow
        setLocation(  owner.getX() + X ,  owner.getY()+Y );

    }

    void updateImage() {
        GreenfootImage i = new GreenfootImage(pic);
        int width = 1+(int)(Avatar.scale*i.getWidth());
        int height = 1+(int)(Avatar.scale*i.getHeight());
        i.scale(width,height);
        setImage(i);

    }

    
}
