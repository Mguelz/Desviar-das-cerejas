import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Fazer com que o Lagarto atire automaticamente a cada # segundos
 * x 570 y 537
 */
public class Lagarto extends Actor
{
    public void act()
    {
        seguirBee();
        validarMouse();
        
    }
    
    public void seguirBee() {
        if (getWorld().getObjects(Bee.class).size() > 0 ) {
            turnTowards(getWorld().getObjects(Bee.class).get(0).getX(), getWorld().getObjects(Bee.class).get(0).getY());
        }
    }
    
    public void validarMouse() {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(mouse != null) {
            if(mouse.getButton() == 1) {
                getRotation();
                getWorld().addObject(new FireBee(), getX(), getY());
            }
        }
    }
}
