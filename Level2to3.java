import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2to3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2to3 extends Actor
{
    /**
     * Act - do whatever the Level2to3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        level2to3();
    }
    
    public void level2to3(){
        MouseInfo mouse = Greenfoot.getMouseInfo();

        if (mouse != null){
            if(mouse.getActor() != null) {
                if (mouse.getActor().getClass() == Level2to3.class && mouse.getButton() == 1) {
                    Greenfoot.setWorld(new Level3());
                }
            }
        }
    }
}
