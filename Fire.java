import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Fire extends Actor
{
    public void act()
    {
        setLocation(getX(), getY() - 5);

        aoTocarEnemyRenascer();
        tocarOutroFire();
        tocarBorda();
    }

    public void aoTocarEnemyRenascer() {
        if (isTouching(Enemy.class)) {
            getWorld().addObject(new Enemy(), Greenfoot.getRandomNumber(1200), 4);
        }
    }

    public void tocarOutroFire() {
        if (isTouching(FireBee.class)) {
            removeTouching(FireBee.class);
        }
    }
    
    public void tocarBorda() {
        if (isAtEdge()){
            getWorld().removeObject(this);
        }
    }

    
}
