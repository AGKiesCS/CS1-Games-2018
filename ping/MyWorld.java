import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (Mark Bardewa, Will Grubbs) 
 * @version (a version numer or a date)
 */
public class MyWorld extends World
{

    int time = 3600;
    int Rscore = 0;
    int Rscore2 = 0;
    int Rscore3 = 0;
    int Bscore = 0;
    int Bscore2 = 0;
    int Bscore3 = 0;
    int whatR = 1;
    //what R = whatR +1

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    public void counterBlue()
    {
        Bscore = Bscore + 1;
        showText("Blue Score Is " + Bscore , 146 , 20);  
        //Ball Fred = new Ball();
        //Fred.right = -2;
        //addObject(Fred,300,200);
    }

    public void counterRed()
    {
        Rscore = Rscore + 1;
        showText("Red Score Is " + Rscore , 444 , 20);  
        //Ball Fred = new Ball();
        //addObject(Fred,300,200);

    }

    public void act()
    {
        time = time-1;
        showText( "you have " + (60*time/3600) + " seconds left" , 195,55);
        if ( time == 0 && Rscore > Bscore){
            showText( " Red Wins" , 300,200);

        }
        else if(time == 0 && Bscore > Rscore){
            showText( " Blue Wins" , 300,200);

        }

        if (time < 0){
            Greenfoot.stop();
        }
        //showText( 
        /*showText( "Red Score-Round 1:" + Rscore + "Red Score-Round 2:" + Rscore2 +
        "Red Score-Round 3:" + Rscore3 , getWidth()/2, getHeight()-15); 
        showText( "Blue Score-Round 1:" + Bscore + "blue Score-Round 2:" + Bscore2 +
        "Blue Score-Round 3:" + Bscore3 ,300,350); 
        }

        /**
         * Prepare the world for the start of the program.
         * That is: create the initial objects and add them to the world.
         */
    }

    private int time()
    {
        return time;

    }

    private void prepare()
    {
        Ball ball = new Ball();

        BarLeft barleft = new BarLeft();

        ball.setLocation(300,200);

        addObject(ball,300,200);
        GoalRight goalright = new GoalRight();
        GoalLeft goalleft = new GoalLeft();
        addObject(goalright,599,200);
        addObject(goalleft,1,200);
        goalright.setRotation(-90);

        goalright.setLocation(599,200);
        goalleft.setRotation(90);
        goalleft.setLocation(1,200);
        BarRight barright = new BarRight();
        addObject(barright,514,200);

        addObject(barleft,80,200);
    }
}
