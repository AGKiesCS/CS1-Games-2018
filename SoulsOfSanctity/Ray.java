import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ray here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ray extends Playable
{
    /**
     * Act - do whatever the Ray wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        int RayBaseHP= 35;
        int RayBaseAtk= 40;
        int RayBaseDef= 30;
        int RayBaseRes= 20;
        int RayBaseSpd= 35;

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
            RayBaseHP=RayBaseHP+25;
            RayBaseHP=RayBaseHP;

            // charecters HP + Restored HP=charecters HP

        }

        if(isTouching(Shield.class))
        {
            RayBaseDef= RayBaseDef + DefUp;
            removeTouching(Shield.class);
            RayBaseDef= RayBaseDef;

        }
        if(isTouching(Boltstrike.class))
        {
            RayBaseAtk= RayBaseSpd + SpdUp;
            removeTouching(Boltstrike.class);
            RayBaseSpd= RayBaseSpd;

        }
        if(isTouching(PowerBand.class))
        {
            RayBaseAtk= RayBaseAtk + AtkUp;
            removeTouching(PowerBand.class);
            RayBaseAtk= RayBaseAtk;

        }
        if(isTouching(MysticViel.class))
        {
            RayBaseRes= RayBaseRes + ResUp;
            removeTouching(MysticViel.class);
            RayBaseRes= RayBaseRes;

        }

        if(isTouching(Cursor.class) && Greenfoot.isKeyDown("s"))
        {
            // gives stat values

        }   
        if(isTouching(enemy.class) && Greenfoot.isKeyDown("a"))
        {
            // battle
            //check if playable outspeeds
            if(RayBaseSpd > enemySpd)
            {
                //Able to Attack twice
               
                //RAyATK
                Damage= enemyDef-RayBaseAtk;
                Damage= Damage;
                enemyHP=enemyHP-Damage;
                enemyHP=enemyHP;
                //enemyAtk
                Damage=RayBaseDef-enemyAtk; 
                Damage= Damage;
                RayBaseHP=RayBaseHP-Damage;
                RayBaseHP=RayBaseHP;
                 //RAyATK
                Damage= enemyDef-RayBaseAtk;
                Damage= Damage;
                enemyHP=enemyHP-Damage;
                enemyHP=enemyHP;
                

            }
            else if(RayBaseSpd<enemySpd)
            {
                // only attack once but enemy attacks twice
                 //RAyATK
                Damage= enemyDef-RayBaseAtk;
                Damage= Damage;
                enemyHP=enemyHP-Damage;
                enemyHP=enemyHP;
                //enemyAtk
                Damage=RayBaseDef-enemyAtk; 
                Damage= Damage;
                RayBaseHP=RayBaseHP-Damage;
                RayBaseHP=RayBaseHP;
                 //enemyAtk
                Damage=RayBaseDef-enemyAtk; 
                Damage= Damage;
                RayBaseHP=RayBaseHP-Damage;
                RayBaseHP=RayBaseHP;
            }
            else 
            {
                // only attacks once 
                 //RAyATK
                Damage= enemyDef-RayBaseAtk;
                Damage= Damage;
                enemyHP=enemyHP-Damage;
                enemyHP=enemyHP;
                //enemyAtk
                Damage=RayBaseDef-enemyAtk; 
                Damage= Damage;
                RayBaseHP=RayBaseHP-Damage;
                RayBaseHP=RayBaseHP;
            }
            if(RayBaseHP==0)
            {
                //GameOver
                //Remove ray

                
            }
            if(enemyHP==0)
            {
                //remove enemy
                removeTouching(enemy.class);
            }
        }

    }    
}
