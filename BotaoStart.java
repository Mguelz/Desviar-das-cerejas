import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *  Ao clicar neste botao sera redirecionado ao começo do jogo
 */
public class BotaoStart extends Actor
{
    public BotaoStart() {
        GreenfootImage startImage = new GreenfootImage ("botaoStart.png");
        startImage.scale(150, 150);
        setImage(startImage);
    }

    public void act()
    {
        iniciarJogo();
    }

    public void iniciarJogo() {
        MouseInfo mouse = Greenfoot.getMouseInfo();

        if (mouse != null){
            if(mouse.getActor() != null) {
                if (mouse.getActor().getClass() == BotaoStart.class && mouse.getButton() == 1) {
                    Greenfoot.setWorld(new Level1());
                }
            }
        }
    }
}
