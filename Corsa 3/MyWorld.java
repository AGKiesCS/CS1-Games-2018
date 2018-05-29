import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author Connor Hayes and James Barham
 * @version (a version number or a date)
 * 
 * 
 * 
 * 
 */
public class MyWorld extends World
{

    int score =  0;

    GreenfootImage aimap = new GreenfootImage("Map.png");

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(850, 550, 1); 
        //prepare();
        //prepare();
        load("Map.png");

        prepare();
    }

    public GreenfootImage getAIMap() {
        return aimap;
    }

    private void load(String map) {
        GreenfootImage bg = new GreenfootImage(map);
        Blocks bill = new Blocks();

        int bw = bill.getImage().getWidth();
        int bh = bill.getImage().getHeight();
        for ( int x = bw/2; x < getWidth(); x += bw/2 ) {
            for (int y = bh/2; y < getHeight(); y += bh/2 ) {
                if ( bg.getColorAt(x,y).equals(Color.RED) ) {
                    addObject(new Blocks(), x, y);
                    //y += bh;
                }
            }
        }
    }

    public void counter()
    {
        score = score+1;
        showText( "The score is " + score, 50, 50);
    }   

    public void act(){

    }

  
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Car3 car3 = new Car3();
        addObject(car3,465,471);
        Car2 car2 = new Car2();
        addObject(car2,470,501);
        Car1 car1 = new Car1();
        addObject(car1,506,494);
        Car5 car5 = new Car5();
        addObject(car5,511,461);
        Car4 car4 = new Car4();
        addObject(car4,547,492);
        MyCar mycar = new MyCar();
        addObject(mycar,545,463);
    }
}
