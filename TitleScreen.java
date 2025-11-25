import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author Kolby Ng
 * @version 17/11/2025
 */
public class TitleScreen extends World
{
    public TitleScreen(){    
        super(600, 400, 1); 
        Label title = new Label("Hungry Elephant", 60);
        addObject(title, getWidth() / 2, getHeight() / 2);
        Label instructions = new Label("Press space to start", 40);
        addObject(instructions, getWidth() / 2, getHeight() / 2 + 50);
    }

    public void act() {
        if (Greenfoot.isKeyDown("space")) {
            Greenfoot.setWorld(new MyWorld());
        }
    }
}
