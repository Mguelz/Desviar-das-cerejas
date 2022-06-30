import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Enemy extends Actor
{
    public void act()
    {
        setRotation(90);
        move(Greenfoot.getRandomNumber(10)); 
        
        tocarBorda();
        tocarEnemy();
        tocarFire();
    }
    
    public void tocarBorda() {
        if (isAtEdge()) {
            setLocation(Greenfoot.getRandomNumber(1200),(Greenfoot.getRandomNumber(10)));
        }
    }
    
    public void tocarEnemy() {
        if (isTouching(Bee.class)) {
            removeTouching(Bee.class);
            getWorld().showText("A cereja te pegou e voce perdeu", 600, 300);
            Greenfoot.stop();
        }
    }
    
    public void tocarFire() {
        if (isTouching(Fire.class)) {
            setLocation(Greenfoot.getRandomNumber(1200), 4);
        }
    }
}
