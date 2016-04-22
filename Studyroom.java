import greenfoot.*;

/**
 * Write a description of class Studyroom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Studyroom extends Areas
{
    /**
     * Act - do whatever the Studyroom wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         if (Greenfoot.mouseClicked(this)) {
        Greenfoot.setWorld(new SR());
    }    
}
}
