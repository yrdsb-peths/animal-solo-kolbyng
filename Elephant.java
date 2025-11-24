import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Elephant actor
 * Kolby Ng
 * 17/11/2025
 */
public class Elephant extends Actor {

    private GreenfootImage[] elephantAnim= new GreenfootImage[8];
    private GreenfootSound eatSound = new GreenfootSound("elephantcub.mp3");
    private int imageIndex = 0;

    public Elephant() {

        createAnimArray();
        setImage(elephantAnim[0]);
    }

    public void act() {

        if (Greenfoot.isKeyDown("left")) {

            move(-1);
        }
        if (Greenfoot.isKeyDown("right")) {

            move(1);
        }
        if(isTouching(Apple.class)) {

            eat();
        }

        animateElephant();
    }
    
    public void eat() {

        MyWorld world = (MyWorld) getWorld();
        removeTouching(Apple.class);
        world.createApple();
        world.increaseScore();
        eatSound.play();
    }

    public void remove() {

        World world = getWorld();
        world.removeObject(this);
    }

    public void animateElephant() {
        if (timer.millisElapsed() > 100) {
            imageIndex = (imageIndex + 1) % elephantAnim.length;
            setImage(elephantAnim[imageIndex]);
            timer.mark();
        }
    }

    public void createAnimArray() {

        for (int i = 0; i < 8; i++) {

            elephantAnim[i] = new GreenfootImage("elephant_idle/idle" + i + ".png");
        }
    }
}
