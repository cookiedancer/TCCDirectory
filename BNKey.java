import greenfoot.*;

/**
 * Write a description of class BNKey here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BNKey extends Keys
{
    /**
     * Act - do whatever the BNKey wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       GreenfootImage image = getImage();  
        image.scale(50, 30);
        setImage(image);//sets size
    }    
}
