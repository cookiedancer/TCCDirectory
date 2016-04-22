import greenfoot.*;

/**
 * Write a description of class GamingKey here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GamingKey extends Keys
{
    /**
     * Act - do whatever the GamingKey wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
       if (Greenfoot.mouseClicked(this)) {
        Greenfoot.setWorld(new Gaming());
     
    }  
     GreenfootImage image = getImage();  
        image.scale(50, 30);
        setImage(image);//sets size
    
}
}
