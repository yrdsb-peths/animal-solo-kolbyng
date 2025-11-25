import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Apple actor
 * Kolby Ng
 * 17/11/2025
 */
public class Apple extends Actor {

    private int speed = 1;

    public void act() {
        setSpeed();
        setLocation(getX(), getY() + speed);

        MyWorld myWorld = (MyWorld) getWorld();
        World world = getWorld();
        if (getY() > world.getHeight()) {

            myWorld.gameOver();
            world.removeObject(this);
            Elephant elephant = myWorld.getElephant();
            elephant.remove();
        }
    }

    public void setSpeed() {
        MyWorld myWorld = (MyWorld) getWorld();
        speed = myWorld.getLevel();
    }
}
