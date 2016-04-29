import greenfoot.*;

/**
 * Takes you back to the previous world.
 * 
 * Ethan, Chris, Andrew
 * Version 2.4.2
 */
public class Back extends Keys
{
    /**
     * Act - do whatever the Apple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         if (Greenfoot.mouseClicked(this)) {
        Greenfoot.setWorld(new TCC());
       }  
      
}
   
}
