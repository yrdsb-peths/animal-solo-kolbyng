import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author Kolby Ng
 * @version 17/11/2025
 */
public class TitleScreen extends World
{
    public TitleScreen()
    {    
        super(600, 400, 1); 
        Label title = new Label("Hungry Elephant", 60);
        addObject(title, getWidth() / 2, getHeight() / 2);
    }
}
