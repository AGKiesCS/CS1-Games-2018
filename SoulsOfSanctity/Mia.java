import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mia extends Playable
{

    /**
     * Act - do whatever the Mia wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int MiaBaseHP= 35;
        int MiaBaseAtk= 30;
        int MiaBaseDef= 20;
        int MiaBaseRes= 40;
        int MiaBaseSpd= 35;
        //int MiaHP= MiaBaseHP-Damage;
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

        // Cursor touching Mia them presseng m when coursor touching to move

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
            MiaBaseHP=MiaBaseHP+25;
            MiaBaseHP=MiaBaseHP;

            // charecters HP + Restored HP=charecters HP

        }

        if(isTouching(Shield.class))
        {
            MiaBaseDef= MiaBaseDef + DefUp;
            removeTouching(Shield.class);
            MiaBaseDef= MiaBaseDef;

        }
        if(isTouching(Boltstrike.class))
        {
            MiaBaseAtk= MiaBaseSpd + SpdUp;
            removeTouching(Boltstrike.class);
            MiaBaseSpd= MiaBaseSpd;

        }
        if(isTouching(PowerBand.class))
        {
            MiaBaseAtk= MiaBaseAtk + AtkUp;
            removeTouching(PowerBand.class);
            MiaBaseAtk= MiaBaseAtk;

        }
        if(isTouching(MysticViel.class))
        {
            MiaBaseRes= MiaBaseRes + ResUp;
            removeTouching(MysticViel.class);
            MiaBaseRes= MiaBaseRes;

        }

        if(isTouching(Cursor.class) && Greenfoot.isKeyDown("s"))
        {
           // gives stat values
           
            
        }   
        
        if(isTouching(enemy.class) && Greenfoot.isKeyDown("a"))
        {
            // battle
            //check if playable outspeeds
            if(MiaBaseSpd > enemySpd)
            {
                //Able to Attack twice
               
                //RAyATK
                Damage= enemyDef-MiaBaseAtk;
                Damage= Damage;
                enemyHP=enemyHP-Damage;
                enemyHP=enemyHP;
                //enemyAtk
                Damage=MiaBaseDef-enemyAtk; 
                Damage= Damage;
                MiaBaseHP=MiaBaseHP-Damage;
                MiaBaseHP=MiaBaseHP;
                 //RAyATK
                Damage= enemyDef-MiaBaseAtk;
                Damage= Damage;
                enemyHP=enemyHP-Damage;
                enemyHP=enemyHP;
                

            }
            else if(MiaBaseSpd<enemySpd)
            {
                // only attack once but enemy attacks twice
                 //RAyATK
                Damage= enemyDef-MiaBaseAtk;
                Damage= Damage;
                enemyHP=enemyHP-Damage;
                enemyHP=enemyHP;
                //enemyAtk
                Damage=MiaBaseDef-enemyAtk; 
                Damage= Damage;
                MiaBaseHP=MiaBaseHP-Damage;
                MiaBaseHP=MiaBaseHP;
                 //enemyAtk
                Damage=MiaBaseDef-enemyAtk; 
                Damage= Damage;
                MiaBaseHP=MiaBaseHP-Damage;
                MiaBaseHP=MiaBaseHP;
            }
            else 
            {
                // only attacks once 
                 //RAyATK
                Damage= enemyDef-MiaBaseAtk;
                Damage= Damage;
                enemyHP=enemyHP-Damage;
                enemyHP=enemyHP;
                //enemyAtk
                Damage=MiaBaseDef-enemyAtk; 
                Damage= Damage;
                MiaBaseHP=MiaBaseHP-Damage;
                MiaBaseHP=MiaBaseHP;
            }
            if(MiaBaseHP==0)
            {
                //GameOver
                //Remove Mia

                
            }
            if(enemyHP==0)
            {
                //remove enemy
                removeTouching(enemy.class);
            }
        }
    }    
}
