import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class FireBee extends Actor
{
    /**
     * atirar na direção em que o lagarto esta mirando, ao invés de seguir a Bee
     * fazer com que o Lagarto atire automaticamente a cada X segundos
     */
    public void act()
    {
        mover();
        atirarNaDireção();
        tocarBorda();
    }
    
    public void mover(){
        move(2);
    }
    
    public void atirarNaDireção() {
        if (getWorld().getObjects(Lagarto.class).size() > 0 ) {
            //turnTowards(getWorld().getObjects(Bee.class).get(0).getX(), getWorld().getObjects(Bee.class).get(0).getY());
            //setRotation(getY());
            //turnTowards(getX(), 537);
            //setLocation(getX(), getY() + 5);
            
        }
    }

    public void tocarBorda() {
        if (isAtEdge()) {
            getWorld().removeObject(this);
        }
    }
}
