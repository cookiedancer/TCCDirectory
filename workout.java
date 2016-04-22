import greenfoot.*;

/**
 * Write a description of class workout here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class workout extends Areas
{
    /**
     * Act - do whatever the workout wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       if (Greenfoot.mouseClicked(this)) {
        Greenfoot.setWorld(new fitness());
    }    
}
}
