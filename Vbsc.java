import greenfoot.*;

/**
 * Write a description of class Vbsc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vbsc extends World
{

    /**
     * Constructor for objects of class Vbsc.
     * 
     */
    public Vbsc()
    {    
        
        super(970, 690, 1); 
       
         addObject (new TaskBar(),487,665);
         addObject (new Back(),564,664);
         addObject (new StudyKey(),449,671);
         addObject (new FitnessKey(),349,674);
         addObject (new GamingKey(),259,671);
         addObject (new BNKey(),162,671);
         addObject (new CafeKey(),62,671);
         
    }
}

