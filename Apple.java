import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Apple actor
 * Kolby Ng
 * 17/11/2025
 */
public class Apple extends Actor {

    public void act() {

        setLocation(getX(), getY() + 1);

        MyWorld myWorld = (MyWorld) getWorld();
        World world = getWorld();
        if (getY() > world.getHeight()) {

            myWorld.gameOver();
            world.removeObject(this);
            Elephant elephant = myWorld.getElephant();
            elephant.remove();
        }
    }
}
