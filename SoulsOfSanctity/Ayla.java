import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ayla here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ayla extends Playable
{
    /**
     * Act - do whatever the Ayla wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
         int AylaBaseHP= 25;
        int AylaBaseAtk= 40;
        int AylaBaseDef= 25;
        int AylaBaseRes= 25;
        int AylaBaseSpd= 35;

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
            AylaBaseHP=AylaBaseHP+25;
            AylaBaseHP=AylaBaseHP;

            // charecters HP + Restored HP=charecters HP

        }

        if(isTouching(Shield.class))
        {
            AylaBaseDef= AylaBaseDef + DefUp;
            removeTouching(Shield.class);
            AylaBaseDef= AylaBaseDef;

        }
        if(isTouching(Boltstrike.class))
        {
            AylaBaseAtk= AylaBaseSpd + SpdUp;
            removeTouching(Boltstrike.class);
            AylaBaseSpd= AylaBaseSpd;

        }
        if(isTouching(PowerBand.class))
        {
            AylaBaseAtk= AylaBaseAtk + AtkUp;
            removeTouching(PowerBand.class);
            AylaBaseAtk= AylaBaseAtk;

        }
        if(isTouching(MysticViel.class))
        {
            AylaBaseRes= AylaBaseRes + ResUp;
            removeTouching(MysticViel.class);
            AylaBaseRes= AylaBaseRes;

        }

        if(isTouching(Cursor.class) && Greenfoot.isKeyDown("s"))
        {
            // gives stat values

        }   
        if(isTouching(enemy.class) && Greenfoot.isKeyDown("a"))
        {
            // battle
            //check if playable outspeeds
            if(AylaBaseSpd > enemySpd)
            {
                //Able to Attack twice
               
                //RAyATK
                Damage= enemyDef-AylaBaseAtk;
                Damage= Damage;
                enemyHP=enemyHP-Damage;
                enemyHP=enemyHP;
                //enemyAtk
                Damage=AylaBaseDef-enemyAtk; 
                Damage= Damage;
                AylaBaseHP=AylaBaseHP-Damage;
                AylaBaseHP=AylaBaseHP;
                 //RAyATK
                Damage= enemyDef-AylaBaseAtk;
                Damage= Damage;
                enemyHP=enemyHP-Damage;
                enemyHP=enemyHP;
                

            }
            else if(AylaBaseSpd<enemySpd)
            {
                // only attack once but enemy attacks twice
                 //RAyATK
                Damage= enemyDef-AylaBaseAtk;
                Damage= Damage;
                enemyHP=enemyHP-Damage;
                enemyHP=enemyHP;
                //enemyAtk
                Damage=AylaBaseDef-enemyAtk; 
                Damage= Damage;
                AylaBaseHP=AylaBaseHP-Damage;
                AylaBaseHP=AylaBaseHP;
                 //enemyAtk
                Damage=AylaBaseDef-enemyAtk; 
                Damage= Damage;
                AylaBaseHP=AylaBaseHP-Damage;
                AylaBaseHP=AylaBaseHP;
            }
            else 
            {
                // only attacks once 
                 //RAyATK
                Damage= enemyDef-AylaBaseAtk;
                Damage= Damage;
                enemyHP=enemyHP-Damage;
                enemyHP=enemyHP;
                //enemyAtk
                Damage=AylaBaseDef-enemyAtk; 
                Damage= Damage;
                AylaBaseHP=AylaBaseHP-Damage;
                AylaBaseHP=AylaBaseHP;
            }
            if(AylaBaseHP==0)
            {
                //GameOver
                //Remove Ayla

                
            }
            if(enemyHP==0)
            {
                //remove enemy
                removeTouching(enemy.class);
            }
        }
    }    
}
