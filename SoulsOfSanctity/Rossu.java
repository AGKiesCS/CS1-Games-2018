import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rossu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rossu extends Playable
{
    /**
     * Act - do whatever the Rossu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        int RossuBaseHP= 60;
        int RossuBaseAtk= 60;
        int RossuBaseDef= 0;
        int RossuBaseRes= 5;
        int RossuBaseSpd= 10;

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
            RossuBaseHP=RossuBaseHP+25;
            RossuBaseHP=RossuBaseHP;

            // charecters HP + Restored HP=charecters HP

        }

        if(isTouching(Shield.class))
        {
            RossuBaseDef= RossuBaseDef + DefUp;
            removeTouching(Shield.class);
            RossuBaseDef= RossuBaseDef;

        }
        if(isTouching(Boltstrike.class))
        {
            RossuBaseAtk= RossuBaseSpd + SpdUp;
            removeTouching(Boltstrike.class);
            RossuBaseSpd= RossuBaseSpd;

        }
        if(isTouching(PowerBand.class))
        {
            RossuBaseAtk= RossuBaseAtk + AtkUp;
            removeTouching(PowerBand.class);
            RossuBaseAtk= RossuBaseAtk;

        }
        if(isTouching(MysticViel.class))
        {
            RossuBaseRes= RossuBaseRes + ResUp;
            removeTouching(MysticViel.class);
            RossuBaseRes= RossuBaseRes;

        }

        if(isTouching(Cursor.class) && Greenfoot.isKeyDown("s"))
        {
            // gives stat values

        }   
        if(isTouching(enemy.class) && Greenfoot.isKeyDown("a"))
        {
            // battle
            //check if playable outspeeds
            if(RossuBaseSpd > enemySpd)
            {
                //Able to Attack twice
               
                //RAyATK
                Damage= enemyDef-RossuBaseAtk;
                Damage= Damage;
                enemyHP=enemyHP-Damage;
                enemyHP=enemyHP;
                //enemyAtk
                Damage=RossuBaseDef-enemyAtk; 
                Damage= Damage;
                RossuBaseHP=RossuBaseHP-Damage;
                RossuBaseHP=RossuBaseHP;
                 //RAyATK
                Damage= enemyDef-RossuBaseAtk;
                Damage= Damage;
                enemyHP=enemyHP-Damage;
                enemyHP=enemyHP;
                

            }
            else if(RossuBaseSpd<enemySpd)
            {
                // only attack once but enemy attacks twice
                 //RAyATK
                Damage= enemyDef-RossuBaseAtk;
                Damage= Damage;
                enemyHP=enemyHP-Damage;
                enemyHP=enemyHP;
                //enemyAtk
                Damage=RossuBaseDef-enemyAtk; 
                Damage= Damage;
                RossuBaseHP=RossuBaseHP-Damage;
                RossuBaseHP=RossuBaseHP;
                 //enemyAtk
                Damage=RossuBaseDef-enemyAtk; 
                Damage= Damage;
                RossuBaseHP=RossuBaseHP-Damage;
                RossuBaseHP=RossuBaseHP;
            }
            else 
            {
                // only attacks once 
                 //RAyATK
                Damage= enemyDef-RossuBaseAtk;
                Damage= Damage;
                enemyHP=enemyHP-Damage;
                enemyHP=enemyHP;
                //enemyAtk
                Damage=RossuBaseDef-enemyAtk; 
                Damage= Damage;
                RossuBaseHP=RossuBaseHP-Damage;
                RossuBaseHP=RossuBaseHP;
            }
            if(RossuBaseHP==0)
            {
                //GameOver
                //Remove Rossu

                
            }
            if(enemyHP==0)
            {
                //remove enemy
                removeTouching(enemy.class);
            }
        }
    }    
}
