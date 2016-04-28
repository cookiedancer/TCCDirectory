import greenfoot.*;

/**
 * Write a description of class FitnessKey here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FitnessKey extends Keys
{
    /**
     * Act - do whatever the FitnessKey wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)) {
        Greenfoot.setWorld(new fitness());
      
    }  
     GreenfootImage image = getImage();  
        image.scale(100, 60);
        setImage(image);//sets size
}
}
