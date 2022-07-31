import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Fazer com que o Lagarto atire automaticamente a cada "2" segundos
 */
public class Lagarto extends Actor
{
    public void act()
    {
        seguirBee();
        //naDirecaoLagarto(); // "atira" na direção em que o lagarto estiver
        validarMouse();
        
    }
    
    public void seguirBee() {
        if (getWorld().getObjects(Bee.class).size() > 0 ) {
            turnTowards(getWorld().getObjects(Bee.class).get(0).getX(), getWorld().getObjects(Bee.class).get(0).getY());    
        }
    }
    
    public void naDirecaoLagarto() {
        FireBee tiroEnemy = new FireBee();
        tiroEnemy.setRotation(getRotation());
    }
    
    public void validarMouse() {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(mouse != null) {
            if(mouse.getButton() == 1) {
                // TODO adicionar o tiro na rotação do Lagarto
                // tiroEnemy = new FireBee();
                //tiroEnemy.setRotation(getRotation()); 
                //getRotation();
                getWorld().addObject(new FireBee(), getX(), getY());
            }
        }
    }
}
