import greenfoot.*;

/**
 * Write a description of class Sc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sc extends Buildings
{
    /**
     * Act - do whatever the Sc wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
   {if (Greenfoot.mouseClicked(this)) 
    {
        Greenfoot.setWorld(new Vbsc());
 
    }    
}
}
