import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Fire extends Actor
{
    public void act()
    {
        setLocation(getX(), getY() - 5);

        aoTocarEnemyRenascer();
        tocarOutroFire();
        tocarBorda();
        //removerEnemy();
        
        //if (intersects((FireBee)getWorld().getObjects(FireBee.class).get(0))) {
          //  removeTouching(FireBee.class);
        //}
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

    public void removerEnemy(){
        // esta causando o bug de tela branca ao tocar em dois Enemy, nao esta removendo ao tocar o primeiro Enemy.
        if (isTouching(Enemy.class)){
            //getWorld().removeObject(this);
        }
    }
}
