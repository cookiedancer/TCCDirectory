import greenfoot.*;

/**
 * Write a description of class STORM here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class STORM extends Actor
{//10
    /**
     * Act - do whatever the STORM wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {//20
     
        checkKeypress();//moves left or right
        
     }//20
    public void checkKeypress()
    {
        if (Greenfoot.isKeyDown("Left"))
        {
            turn(-4);
        }
        if (Greenfoot.isKeyDown("Right"))
        {
            turn(4);
        }
        if (Greenfoot.isKeyDown("Up"))
        {
            move(4);
        }
        
    } 
    {//30    
        GreenfootImage image = getImage();  
        image.scale(30, 30);
        setImage(image);//sets size
    }//31 
}
