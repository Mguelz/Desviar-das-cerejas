import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level3to4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3to4 extends Actor
{
    /**
     * Act - do whatever the Level3to4 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        level3to4();
    }
    
    public void level3to4(){
        MouseInfo mouse = Greenfoot.getMouseInfo();

        if (mouse != null){
            if(mouse.getActor() != null) {
                if (mouse.getActor().getClass() == Level3to4.class && mouse.getButton() == 1) {
                    Greenfoot.setWorld(new Level4Final());
                }
            }
        }
    }
}
