import greenfoot.*;

public class Bee extends Actor
{
    int score = 0;
    public void act()
    {
        setRotation(270);
        
        validarTeclado();
        atirar();
        tocarPlanta();
        proximoLevel();
    }
    
    public void validarTeclado() {
        if (Greenfoot.isKeyDown("a")) {
            setLocation(getX() - 7, getY());
        }
        if (Greenfoot.isKeyDown("d")) {
            setLocation(getX() + 7, getY());
        }
    }
    
    public void atirar() {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(mouse != null) {
            if(mouse.getButton() == 1) {
                getWorld().addObject(new Fire(), getX(), getY() - 40);
            }
        }
    }
    
    public void tocarPlanta() {
        if (isTouching(Planta.class)) {
            removeTouching(Planta.class);
            score++;
            getWorld().showText("Score: " + score, 570, 20);
        }
        if (isTouching(Planta2.class)) {
            removeTouching(Planta2.class);
            score++;
            getWorld().showText("Score: " + score, 570, 20);
        }
    }
    
    public void proximoLevel() {
        if(score == 35) {
            getWorld().showText("Parabéns você ganhou!", 600, 300); //getWorld().getWidht() - 60 para pegar o tamanho do mundo
            getWorld().showText("Congratulations you win!", 600, 320);
            Greenfoot.stop();
            Greenfoot.setWorld(new Level2());
        }
    }
}
