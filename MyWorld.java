import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**Avatar.
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World

{

    //how do I add a background
    //setBackground(backgroundSpace_01.1)
    //setBackground(OpenGameBackground.jpeg);

    GreenfootSound bgmusic = new GreenfootSound("sunsai_bg.mp3");
    int score = 0;

    GreenfootImage bg = getBackground();

    // 60 seconds is about 3600    
    int time = 3600;
    int redapplecollector = 0;
    int whatR = 1;
    int scoreR1=0;
    int scoreR2=0; 
    int scoreR3=0;
    int scoreR4=0;
    int AR=35;
    int RA=25;
    public void started () {
        bgmusic.playLoop();

    }

    public void stopped () {
        bgmusic.pause();

    }

    // Add n random Monsters to the screen
    // This code belongs in your World.
    // This code is a method. It belongs inside your World, 
    // but outside any other methods
    public void addSlidder20(int n)
    {
        if ( n < 0 ) n = -n;
        while ( n > 0 )
        {
            int x = getWidth()-1;//Greenfoot.getRandomNumber( getWidth() );
            if( Greenfoot.getRandomNumber(2)==0)
            {
                x = 0;
            }
            int y = Greenfoot.getRandomNumber( getHeight() );
            if(whatR == 3 && Greenfoot.getRandomNumber(2)==0 )
            {
                x = Greenfoot.getRandomNumber( getWidth() );
                y = 0;
                if ( Greenfoot.getRandomNumber(2)==0 ) {
                    y = getHeight()-1;
                }
            }
            addObject( new Slider20(), x, y );
            n = n - 1;
        }
    }

    public void counter ()
    {
        score = score + 1;

    }

    public int applec(){
        return redapplecollector;
    }

    public void apple ()
    {
        redapplecollector = redapplecollector + 1;
    }

    public void act()    
    {

        time = time-1;
        showText( "you have " + (60*time/3600)+" secounds remaining" , 195, 55);
        showText( "the score is " + score , 100 , 100);
        showText( "you have " + redapplecollector+" red apples" , 139, 25);
        showText( "Scores --- Round 1:" + scoreR1 + "    Round 2: " + scoreR2 + "    Round 3: " + scoreR3 , getWidth()/2, getHeight()-15);

        if ( getObjects(Badslidder.class).size() < AR && Greenfoot.getRandomNumber(10)==0 ) {
            addBadlidder(1);
        }


        if ( getObjects(Slider20.class).size() < RA && Greenfoot.getRandomNumber(10)==0 ) {
            addSlidder20(1);
        }

        if( time == 0)
        {
            //reset timer
            time=3600;

            //save score from each Round
            if( whatR == 1)
            {   
                scoreR1 = score;
                AR=45;
                RA=30;
                if(  !getObjects(Avatar.class).isEmpty() )
                {
                    Avatar avatar = getObjects(Avatar.class).get(0);
                    Follower michal = new Follower(avatar, -45, -20);
                    addObject(michal, 0,0);

                }
            }
            else if( whatR == 2)
            {   
                scoreR2 = score;
                AR=55;
                RA=35;
                if(  !getObjects(Avatar.class).isEmpty() )
                {
                    Avatar avatar = getObjects(Avatar.class).get(0);
                    Follower michal = new Follower(avatar, 45, 20);
                    addObject(michal, 0,0);
                }
            }
            else 
            {   
                scoreR3 = score;
                clearscreen();
                showText( " Your final score is "+(scoreR1 + scoreR2 + scoreR3) ,getWidth()/2, getHeight()/2);
                showText( "Scores --- Round 1:" + scoreR1 + "    Round 2: " + scoreR2 + "    Round 3: " + scoreR3 , getWidth()/2, getHeight()-15);
                Greenfoot.stop();
            }

            //reset apple counter
            redapplecollector = 0;
            //reset score
            score = 0;
            //reset screen

            //add level #
            whatR = whatR + 1;
            //prepare
            //prepare();

            //add object avatar

            //show score from each round then add them to geather

        }
    }

    public int time()
    {
        return time;

    }

    public void addBadlidder(int n)
    {
        if ( n < 0 ) n = -n;
        while ( n > 0 )
        {
            int x = getWidth()-1;//Greenfoot.getRandomNumber( getWidth() );Greenfoot.getRandomNumber( getWidth() );
            if(  Greenfoot.getRandomNumber(2)==0)
            {
                x = 0;
            }
            int y = Greenfoot.getRandomNumber( getHeight() );
            
            if(whatR == 3 && Greenfoot.getRandomNumber(2)==0 )
            {
                x = Greenfoot.getRandomNumber( getWidth() );
                y = 0;
                if ( Greenfoot.getRandomNumber(2)==0 ) {
                    y = getHeight()-1;
                }
            }
            
            addObject( new Badslidder(), x, y );
            n = n - 1;

        }
    }

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        setPaintOrder(Avatar.class,Dart.class);
        prepare();
    }

    public void clearscreen()
    {
        removeObjects(getObjects(Actor.class));

        showText( "" , 100 , 100);
        showText( ""  , 195, 55);
        showText( "" , 139, 25);
        showText( "" , getWidth()/2, getHeight()-15);

    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Avatar avatar = new Avatar();
        addObject(avatar,370,363);
    }
}