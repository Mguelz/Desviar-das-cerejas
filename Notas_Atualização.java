import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * ADICIONADO NESTA VERSÃO:
 * Ao Enemy tocar no fire o Enemy se desloca para o topo do mundo.
 * 
 * ATUALIZAÇÕES FUTURAS:
 * 
 * 1- Colocar musica no jogoc (só falta achar uma musica)
 * 2- Colocar delay ao iniciar o jogo...
 * 3- Fazer com que o "jogador" não atire rapidamente (só poder atirar a cada x segundos)
 * 4- FireBee seja atira na direção em que o Lagarto estiver mirando, e não seguir a Bee
 * 5- Se o Fire tocar FireBee fazer com que ele elimine o projetil inimigo
 * 6- Ao Fire tocar a Planta, remover projetil
 * 7- Lagarto atirar automaticamente
 */
public class Notas_Atualização extends World
{
    /**
     * Constructor for objects of class Notas_Atualização.
     * 
     */
    public Notas_Atualização()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    }
}
