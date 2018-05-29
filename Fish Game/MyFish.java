import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyFish here.
 * 
 * @author (Sean Parnell/Brandon Harris) 
 * @version (a version number or a date)
 */
public class MyFish extends Fish
{
    GreenfootSound bite = new GreenfootSound("ComputerChomp2.wav");
    GreenfootSound eat = new GreenfootSound("PlayerChomp2.wav");
    GreenfootSound down = new GreenfootSound("PowerDown.wav");
    GreenfootSound up = new GreenfootSound("PowerUp.wav");
    GreenfootImage pic;

    protected void addedToWorld(World w){
        pic = getImage();
    }    

    /**
     * Act - do whatever the MyFish wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {

        int size = getImage().getWidth();

        if (isTouching(SmallFish.class)==true) 
        { 
            eat.play();
            removeTouching(SmallFish.class);

            GreenfootImage Fish = new GreenfootImage(pic);
            Fish.scale( getImage().getWidth()+2, getImage().getHeight()+2);
            setImage(Fish);
        }  
        else if ( isTouching(MediumFish.class)==true ) 
        { 
            if ( size >= 120 ) {
                eat.play();
                removeTouching(MediumFish.class);

                GreenfootImage Fish = new GreenfootImage(pic);
                Fish.scale( getImage().getWidth()+5, getImage().getHeight()+5);
                setImage(Fish);
            }
            else {
                bite.play();
                
                GameOver gameover = new GameOver();
                getWorld().addObject(gameover, 500, 300);

                GreenfootImage bg = new GreenfootImage(500,500);
                bg.setColor(Color.BLACK);
                bg.fill();
                getWorld().setBackground(bg);
                getWorld().removeObject(this);
                Greenfoot.stop();
                return; 

            }
        } 
        else if ( isTouching(LargeFish.class)==true) 
        {
            if (size >= 180) {
                eat.play();
                removeTouching(LargeFish.class);

                GreenfootImage Fish = new GreenfootImage(pic);
                Fish.scale( getImage().getWidth()+8, getImage().getHeight()+8);
                setImage(Fish);
            } 
            else {
                bite.play();

                GameOver gameover = new GameOver();
                getWorld().addObject(gameover, 500, 300);

                GreenfootImage bg = new GreenfootImage(500,500);
                bg.setColor(Color.BLACK);
                bg.fill();
                getWorld().setBackground(bg);
                getWorld().removeObject(this);
                Greenfoot.stop();
                return;
            }
        }
        if (isTouching(PowerDown.class)==true) 
        { 
            down.play();
            removeTouching(PowerDown.class);
            //MyFish myfish = new MyFish();
            //getWorld().addObject(myfish, 507, 320);
            //getWorld().removeObject(this); 
            //Greenfoot.start();
            GreenfootImage Fish = new GreenfootImage(pic);
            //Fish.scale( getImage().getWidth()-20, getImage().getHeight()-20);
            setImage(Fish);
            return;
        }  
        
        //int timer = 1;
        
        
        if (isTouching(PowerUp.class))
        {
            
            up.play();
            GreenfootImage Fish = new GreenfootImage(pic);
            Fish.scale( getImage().getWidth()+50, getImage().getHeight()+50);
            setImage(Fish);removeTouching(PowerUp.class);
            
        }
        //else if (isTouching(PowerUp.class)==true &&
        if (Greenfoot.isKeyDown("left") )
        {
            //slide(-2,0);    t
            turn (-4);
        }
        if (Greenfoot.isKeyDown("right") )
        {
            //slide(2,0);   
            turn(4);
        }
        if (Greenfoot.isKeyDown("up") )
        {
            //slide(0,-2);  
            move(-5);
        }
        if (Greenfoot.isKeyDown("down") )
        {
            //slide(0,2);    
            move(5);
        }
        if ( getX() == 0)
        {
            setLocation(999,getY());
        }
        else if (getX() == 999)
        {
            setLocation(0,getY());
        }
        if ( getY() == 0)
        {
            setLocation(getX(),599);
        }
        else if ( getY() == 599)
        {
            setLocation(getX(),0);
        }

        //why wont my fish go through the left side or top side
        //how to have enemy fish be eaten only when they are smaller 
    }    
}
