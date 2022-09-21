import greenfoot.*;

public class Bee extends Actor
{
    public int score = 0;
    int a = 0;
    int b = 0;
    int c = 0;

    public void act()
    {
        setRotation(270);

        validarTeclado();
        atirar();
        tocarPlanta();
        //level1to2(); // level 1 para o 2
        //level2to3(); // level 2 para o 3
        //level4Final();
        sistemaLevel(); // forma alternativa para que troque de level

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
     
    public void sistemaLevel(){
        if(score == 15){
            getWorld().addObject(new Level1to2(), 1129, 500);
            getWorld().showText("Next Level", 1129, 540);
        }else if(score == 35){
            getWorld().addObject(new Level2to3(), 1129, 500);
            getWorld().showText("Next Level", 1129, 540);
        }else if(score == 50){
            getWorld().addObject(new Level3to4(), 1129, 500);
            getWorld().showText("Next Level", 1129, 540);
        }else if(score == 60){
            getWorld().showText("You win", 600, 300);
            Greenfoot.stop();
        }
    }
    
    public void level1to2() {
        if(score == 5) { // score = 35
            //Greenfoot.setWorld(new Level2());
        }
    }
    
    public void level2to3() {
        if(score == 10) { // 50
            //Greenfoot.setWorld(new Level3());
        }
    }
    
    public void level4Final(){
        if(score == 15){
            //Greenfoot.setWorld(new Level4Final());
        }
    }
}
