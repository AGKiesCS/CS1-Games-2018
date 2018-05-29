import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tyu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tyu extends Playable
{
    /**
     * Act - do whatever the Tyu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
         int TyuBaseHP= 20;
        int TyuBaseAtk= 50;
        int TyuBaseDef= 40;
        int TyuBaseRes= 40;
        int TyuBaseSpd= 30;

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
            TyuBaseHP=TyuBaseHP+25;
            TyuBaseHP=TyuBaseHP;

            // charecters HP + Restored HP=charecters HP

        }

        if(isTouching(Shield.class))
        {
            TyuBaseDef= TyuBaseDef + DefUp;
            removeTouching(Shield.class);
            TyuBaseDef= TyuBaseDef;

        }
        if(isTouching(Boltstrike.class))
        {
            TyuBaseAtk= TyuBaseSpd + SpdUp;
            removeTouching(Boltstrike.class);
            TyuBaseSpd= TyuBaseSpd;

        }
        if(isTouching(PowerBand.class))
        {
            TyuBaseAtk= TyuBaseAtk + AtkUp;
            removeTouching(PowerBand.class);
            TyuBaseAtk= TyuBaseAtk;

        }
        if(isTouching(MysticViel.class))
        {
            TyuBaseRes= TyuBaseRes + ResUp;
            removeTouching(MysticViel.class);
            TyuBaseRes= TyuBaseRes;

        }

        if(isTouching(Cursor.class) && Greenfoot.isKeyDown("s"))
        {
            // gives stat values

        }   
        if(isTouching(enemy.class) && Greenfoot.isKeyDown("a"))
        {
            // battle
            //check if playable outspeeds
            if(TyuBaseSpd > enemySpd)
            {
                //Able to Attack twice
               
                //RAyATK
                Damage= enemyDef-TyuBaseAtk;
                Damage= Damage;
                enemyHP=enemyHP-Damage;
                enemyHP=enemyHP;
                //enemyAtk
                Damage=TyuBaseDef-enemyAtk; 
                Damage= Damage;
                TyuBaseHP=TyuBaseHP-Damage;
                TyuBaseHP=TyuBaseHP;
                 //RAyATK
                Damage= enemyDef-TyuBaseAtk;
                Damage= Damage;
                enemyHP=enemyHP-Damage;
                enemyHP=enemyHP;
                

            }
            else if(TyuBaseSpd<enemySpd)
            {
                // only attack once but enemy attacks twice
                 //RAyATK
                Damage= enemyDef-TyuBaseAtk;
                Damage= Damage;
                enemyHP=enemyHP-Damage;
                enemyHP=enemyHP;
                //enemyAtk
                Damage=TyuBaseDef-enemyAtk; 
                Damage= Damage;
                TyuBaseHP=TyuBaseHP-Damage;
                TyuBaseHP=TyuBaseHP;
                 //enemyAtk
                Damage=TyuBaseDef-enemyAtk; 
                Damage= Damage;
                TyuBaseHP=TyuBaseHP-Damage;
                TyuBaseHP=TyuBaseHP;
            }
            else 
            {
                // only attacks once 
                 //RAyATK
                Damage= enemyDef-TyuBaseAtk;
                Damage= Damage;
                enemyHP=enemyHP-Damage;
                enemyHP=enemyHP;
                //enemyAtk
                Damage=TyuBaseDef-enemyAtk; 
                Damage= Damage;
                TyuBaseHP=TyuBaseHP-Damage;
                TyuBaseHP=TyuBaseHP;
            }
            if(TyuBaseHP==0)
            {
                //GameOver
                //Remove Tyu

                
            }
            if(enemyHP==0)
            {
                //remove enemy
                removeTouching(enemy.class);
            }
        }
    }    
}
