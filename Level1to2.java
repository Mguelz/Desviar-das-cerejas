import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Level1to2 extends Actor
{
    /**
     * Fara a transição do level 1 para o 2
     */
    public void act()
    {
        level1to2();
    }
    
    public void level1to2(){
        MouseInfo mouse = Greenfoot.getMouseInfo();

        if (mouse != null){
            if(mouse.getActor() != null) {
                if (mouse.getActor().getClass() == Level1to2.class && mouse.getButton() == 1) {
                    Greenfoot.setWorld(new Level2());
                }
            }
        }
    }
}
