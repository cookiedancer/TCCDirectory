import greenfoot.*;

/**
 * Write a description of class CafeKey here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CafeKey extends Keys
{
    /**
     * Act - do whatever the CafeKey wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
     {
        if (Greenfoot.mouseClicked(this)) {
        Greenfoot.setWorld(new Cafe());
      
    }  
     GreenfootImage image = getImage();  
        image.scale(100, 60);
        setImage(image);//sets size
}
}
