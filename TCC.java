import greenfoot.*;

/**
 * Write a description of class TCC here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TCC extends World
{//0

    /**
     * Constructor for objects of class TCC.
     * 
     */
    public TCC()
    {//10
       
        super(970, 690, 1);
        addObject (new STORM(),900,250);
        addObject (new Atc(),374,480);
        addObject (new Cal(),731,548);
        addObject (new Sc(),302,326);
        addObject (new Pa(),166,60);
        addObject (new Kem(),342,145);
        addObject (new Vb(),440,278);
        addObject (new Sb(),341,618);
        addObject (new Jul(),111,542);
        addObject (new Rh(),72,645);
        addObject (new Bs(),218,160);
        addObject (new Pu(),163,275);
        addObject (new Ly(),78,334);
        addObject (new Bw(),93,161);
}//11
public void act()
    {//60
      if (Greenfoot.isKeyDown ("1"))
         {showText("Help Menu",720,110);
          showText("Enter buildings to learn about their functions",720,130);   
          showText("JUST DO IT!",720,150);
        
        }
        //70
        else{showText(null,720,110);
             showText(null,720,130);
             showText(null,720,150);
            }
            checkKeyPress();
//71
}//1
public void checkKeyPress()
{
    if (Greenfoot.isKeyDown("K"))
    {
        Greenfoot.setWorld(new Vbsc());
}
    if (Greenfoot.isKeyDown("H"))
    {
        Greenfoot.setWorld(new Hat());
}

}
}

