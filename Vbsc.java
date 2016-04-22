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
        
        super(850, 520, 1); 
       
         addObject (new TaskBar(),485,520);
         addObject (new Back(),550,50);
         addObject (new StudyKey(),32,383);
         addObject (new FitnessKey(),87,383);
         addObject (new GamingKey(),140,383);
         addObject (new BNKey(),194,383);
         addObject (new CafeKey(),251,383);
         
    }
}

