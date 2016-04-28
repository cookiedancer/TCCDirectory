import greenfoot.*;

/**
 * Write a description of class StudyKey here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StudyKey extends Keys
{
    /**
     * Act - Sets a new World on top of the old one. 
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)) {
        Greenfoot.setWorld(new StudyArea());
    }
        GreenfootImage image = getImage();  
        image.scale(100, 60);
        setImage(image);//sets size
    }    
}
