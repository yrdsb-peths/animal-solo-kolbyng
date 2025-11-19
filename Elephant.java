import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Elephant actor
 * Kolby Ng
 * 17/11/2025
 */
public class Elephant extends Actor
{
    GreenfootSound eatSound = new GreenfootSound("elephantcub.mp3");
    public void act()
    {
        if (Greenfoot.isKeyDown("left"))
        {
            move(-1);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            move(1);
        }
        if(isTouching(Apple.class))
        {
            eat();
        }
    }
    
    public void eat()
    {
        MyWorld world = (MyWorld) getWorld();
        removeTouching(Apple.class);
        world.createApple();
        world.increaseScore();
        eatSound.play();
    }

    public void remove()
    {
        World world = getWorld();
        world.removeObject(this);
    }
}
