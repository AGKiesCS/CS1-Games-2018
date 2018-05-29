import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kiran here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kiran extends Playable
{
    int KiranBaseHP= 30;
    int KiranBaseAtk= 50;
    int KiranBaseDef= 15;
    int KiranBaseRes= 40;
    int KiranBaseSpd= 35;

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
    /**
     * Act - do whatever the Kiran wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // shows battle options menu
        if(isTouching(Cursor.class) && Greenfoot.isKeyDown("m"))
        {
            //move right
            if (Greenfoot.isKeyDown("RIGHT"))
            {
                slide(1,0);
            }
            //move left
            if (Greenfoot.isKeyDown("LEFT"))
            {
                slide(-1,0);
            }
            //move up
            if (Greenfoot.isKeyDown("UP"))
            {
                slide(0,1);
            }
            //move down
            if (Greenfoot.isKeyDown("DOWN"))
            {
                slide(0,-1);
            }
        }

        //Battle code
        //attack
        if(isTouching(Shield.class))
        {
            KiranBaseDef= KiranBaseDef + DefUp;
            removeTouching(Shield.class);
            KiranBaseDef= KiranBaseDef;

        }
        if(isTouching(Boltstrike.class))
        {
            KiranBaseAtk= KiranBaseSpd + SpdUp;
            removeTouching(Boltstrike.class);
            KiranBaseSpd= KiranBaseSpd;

        }
        if(isTouching(PowerBand.class))
        {
            KiranBaseAtk= KiranBaseAtk + AtkUp;
            removeTouching(PowerBand.class);
            KiranBaseAtk= KiranBaseAtk;

        }
        if(isTouching(MysticViel.class))
        {
            KiranBaseRes= KiranBaseRes + ResUp;
            removeTouching(MysticViel.class);
            KiranBaseRes= KiranBaseRes;

        }
        
        if(isTouching(potion.class))
        {
            //Restores HP
            KiranBaseHP=KiranBaseHP+25;
            KiranBaseHP=KiranBaseHP;

            // charecters HP + Restored HP=charecters HP

        }

        if(isTouching(Cursor.class) && Greenfoot.isKeyDown("s"))
        {
            // gives stat values

        }   
        if(isTouching(enemy.class) && Greenfoot.isKeyDown("a"))
        {
            // battle
            //check if playable outspeeds
            if(KiranBaseSpd > enemySpd)
            {
                //Able to Attack twice

                //RAyATK
                Damage= enemyDef-KiranBaseAtk;
                Damage= Damage;
                enemyHP=enemyHP-Damage;
                enemyHP=enemyHP;
                //enemyAtk
                Damage=KiranBaseDef-enemyAtk; 
                Damage= Damage;
                KiranBaseHP=KiranBaseHP-Damage;
                KiranBaseHP=KiranBaseHP;
                //RAyATK
                Damage= enemyDef-KiranBaseAtk;
                Damage= Damage;
                enemyHP=enemyHP-Damage;
                enemyHP=enemyHP;

            }
            else if(KiranBaseSpd<enemySpd)
            {
                // only attack once but enemy attacks twice
                //RAyATK
                Damage= enemyDef-KiranBaseAtk;
                Damage= Damage;
                enemyHP=enemyHP-Damage;
                enemyHP=enemyHP;
                //enemyAtk
                Damage=KiranBaseDef-enemyAtk; 
                Damage= Damage;
                KiranBaseHP=KiranBaseHP-Damage;
                KiranBaseHP=KiranBaseHP;
                //enemyAtk
                Damage=KiranBaseDef-enemyAtk; 
                Damage= Damage;
                KiranBaseHP=KiranBaseHP-Damage;
                KiranBaseHP=KiranBaseHP;
            }
            else 
            {
                // only attacks once 
                //RAyATK
                Damage= enemyDef-KiranBaseAtk;
                Damage= Damage;
                enemyHP=enemyHP-Damage;
                enemyHP=enemyHP;
                //enemyAtk
                Damage=KiranBaseDef-enemyAtk; 
                Damage= Damage;
                KiranBaseHP=KiranBaseHP-Damage;
                KiranBaseHP=KiranBaseHP;
            }
            if(KiranBaseHP==0)
            {
                //GameOver

                
            }
            if(enemyHP==0)
            {
                //remove enemy
                removeTouching(enemy.class);
                
                
            }
        }

    }    
}
