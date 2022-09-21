import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Start extends World
{
    public Start()
    {    
        super(1200, 600, 1); 
        
        addObject(new BotaoStart(), 853,340); // adicionando o botao no mundo

        showText("Pressione o botão para jogar", 829, 179);
        showText("Press the button for start", 810, 200);
        
        //tocar musica
        //Greenfoot.playSound(Musica.extenção);
    }
    
    public void act() {
        if(Greenfoot.isKeyDown("space")) {
            Greenfoot.setWorld(new Level1()); // ao clicar no botao ira iniciar o level 1
        }
    }
}
