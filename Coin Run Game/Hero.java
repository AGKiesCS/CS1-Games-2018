import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (Ashley A. Cara t.) 
 * @version (a version number or a date)
 */
public class Hero extends Sliderr
{
    int health = 100;
    boolean direction = false;
    int frame = 0;
    
    int speed = 2;
    int anispeed = 10;
    
    GreenfootImage standR;
    GreenfootImage walk1R;
    GreenfootImage walk2R;
    GreenfootImage standL;
    GreenfootImage walk1L;
    GreenfootImage walk2L;
    
    double scale = 1.0;
    final double SCALEMAX = 2.0;
    final double SCALEMIN = 0.5;
    
    GreenfootImage pic;
    
    public Hero()
    {
        pic = getImage();
        
        standR = new GreenfootImage("standstillHero2.png");
        standL = new GreenfootImage("standstillHero2.png");
        standL.mirrorHorizontally();
        
        walk1R = new GreenfootImage("rightAIRrunHero.png");
        walk2R = new GreenfootImage("rightfootrunHero.png");
        walk1L= new GreenfootImage("rightAIRrunHero.png");
        walk2L= new GreenfootImage("rightfootrunHero.png");
        walk1L.mirrorHorizontally();
        walk2L.mirrorHorizontally();
        
    }
    
    private void grow(double s)
    {
        scale = scale * s;
        if ( scale > SCALEMAX ) scale = SCALEMAX;
        if ( scale < SCALEMIN ) scale = SCALEMIN;
        
        GreenfootImage img = new GreenfootImage(pic);
        int width = (int)(img.getWidth()*scale);
        int height = (int)(img.getHeight()*scale);
        img.scale(  width,height );
        setImage( img );
        
    }
    
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //if player is hitting the right key, move forward
        //if player is hitting the left key, move backwards
        //if player is hitting the up key, move upwards
        //if player is hitting the down key, slide
        //if player hits p key, extract parachute(only at certain points in game)
        if ( isTouching(deletey.class)==true )
        {
            removeTouching(deletey.class);
            //grow
            grow( 1.15 );
        }
        
        if ( isTouching(Spike.class)==true )
        {
            health = health-10;
            getWorld().showText("-10 HP !!!", 300, 200);
        }
        
        if ( Greenfoot.isKeyDown("left") )
        {
            slide(-speed,0);
            direction = false;
            frame++;
            if ( frame < anispeed ) {
                setImage(walk1L);
            }
            else if ( frame < anispeed*2 ) {
                setImage(walk2L);
            }
            else {
                frame = 0;
            }
            
        }
        else if ( Greenfoot.isKeyDown("right") )
        {
            slide(speed,0);
            direction = true;
            frame++;
            if ( frame < anispeed ) {
                setImage(walk1R);
            }
            else if ( frame < anispeed*2 ) {
                setImage(walk2R);
            }
            else {
                frame= 0;
            }
        }
        else
        {
            //GreenfootImage run = new GreenfootImage("rightfootrunHero.png");
            //setImage(run);
            if (direction == true)
            {
                setImage(standR);
            }
            else
            {
                setImage(standL);
            }
        }
        
        if ( Greenfoot.isKeyDown("up") )
        {
            slide(0,-speed);
            
        }
        if ( Greenfoot.isKeyDown("down") )
        {
            slide(0,speed);
            
        }
        //4/16/2018
        //How do we make an animation? Or more specific, how do we make Hero's image change as he walks?
        //How do we set boundaries on the screen at a given time/level?
        
    }
    }
