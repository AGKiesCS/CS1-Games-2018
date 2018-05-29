import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Blaze here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Blaze extends Playable
{
    
    
    /**
     * Act - do whatever the Blaze wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int BlazeBaseHP= 35;
        int BlazeBaseAtk= 40;
        int BlazeBaseDef= 20;
        int BlazeBaseRes= 0;
        int BlazeBaseSpd= 31;

        int Damage;
        int DefUp=5;
        int AtkUp=5;
        int ResUp=5;
        int SpdUp=5;

        int enemyHP=45;
        int enemyAtk=35;
        int enemyDef=25;
        int enemyRes=25;
        int enemySpd=35;
        if(isTouching(Cursor.class) && Greenfoot.isKeyDown("m"))
        {
            //move right
            if (Greenfoot.isKeyDown("RIGHT"))
            {
                slide(3,0);
            }
            //move left
            if (Greenfoot.isKeyDown("LEFT"))
            {
                slide(-3,0);
            }
            //move up
            if (Greenfoot.isKeyDown("UP"))
            {
                slide(0,3);
            }
            //move down
            if (Greenfoot.isKeyDown("DOWN"))
            {
                slide(0,-3);
            }

        }

        if(isTouching(potion.class))
        {
            //Restores HP
            BlazeBaseHP=BlazeBaseHP+25;
            BlazeBaseHP=BlazeBaseHP;

            // charecters HP + Restored HP=charecters HP

        }

        if(isTouching(Shield.class))
        {
            BlazeBaseDef= BlazeBaseDef + DefUp;
            removeTouching(Shield.class);
            BlazeBaseDef= BlazeBaseDef;

        }
        if(isTouching(Boltstrike.class))
        {
            BlazeBaseAtk= BlazeBaseSpd + SpdUp;
            removeTouching(Boltstrike.class);
            BlazeBaseSpd= BlazeBaseSpd;

        }
        if(isTouching(PowerBand.class))
        {
            BlazeBaseAtk= BlazeBaseAtk + AtkUp;
            removeTouching(PowerBand.class);
            BlazeBaseAtk= BlazeBaseAtk;

        }
        if(isTouching(MysticViel.class))
        {
            BlazeBaseRes= BlazeBaseRes + ResUp;
            removeTouching(MysticViel.class);
            BlazeBaseRes= BlazeBaseRes;

        }

        if(isTouching(Cursor.class) && Greenfoot.isKeyDown("s"))
        {
            // gives stat values

        }   
        if(isTouching(enemy.class) && Greenfoot.isKeyDown("a"))
        {
            // battle
            //check if playable outspeeds
            if(BlazeBaseSpd > enemySpd)
            {
                //Able to Attack twice
               
                //RAyATK
                Damage= enemyDef-BlazeBaseAtk;
                Damage= Damage;
                enemyHP=enemyHP-Damage;
                enemyHP=enemyHP;
                //enemyAtk
                Damage=BlazeBaseDef-enemyAtk; 
                Damage= Damage;
                BlazeBaseHP=BlazeBaseHP-Damage;
                BlazeBaseHP=BlazeBaseHP;
                 //RAyATK
                Damage= enemyDef-BlazeBaseAtk;
                Damage= Damage;
                enemyHP=enemyHP-Damage;
                enemyHP=enemyHP;
                

            }
            else if(BlazeBaseSpd<enemySpd)
            {
                // only attack once but enemy attacks twice
                 //RAyATK
                Damage= enemyDef-BlazeBaseAtk;
                Damage= Damage;
                enemyHP=enemyHP-Damage;
                enemyHP=enemyHP;
                //enemyAtk
                Damage=BlazeBaseDef-enemyAtk; 
                Damage= Damage;
                BlazeBaseHP=BlazeBaseHP-Damage;
                BlazeBaseHP=BlazeBaseHP;
                 //enemyAtk
                Damage=BlazeBaseDef-enemyAtk; 
                Damage= Damage;
                BlazeBaseHP=BlazeBaseHP-Damage;
                BlazeBaseHP=BlazeBaseHP;
            }
            else 
            {
                // only attacks once 
                 //RAyATK
                Damage= enemyDef-BlazeBaseAtk;
                Damage= Damage;
                enemyHP=enemyHP-Damage;
                enemyHP=enemyHP;
                //enemyAtk
                Damage=BlazeBaseDef-enemyAtk; 
                Damage= Damage;
                BlazeBaseHP=BlazeBaseHP-Damage;
                BlazeBaseHP=BlazeBaseHP;
            }
            if(BlazeBaseHP==0)
            {
                //GameOver
                //Remove Blaze

                
            }
            if(enemyHP==0)
            {
                //remove enemy
                removeTouching(enemy.class);
            }
        }
    }    
}
