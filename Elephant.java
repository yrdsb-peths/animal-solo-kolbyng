import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Elephant actor
 * Kolby Ng
 * 17/11/2025
 */
public class Elephant extends Actor {

    private GreenfootImage[] idleRightAnim= new GreenfootImage[8];
    private GreenfootImage[] idleLeftAnim= new GreenfootImage[8];
    private GreenfootSound eatSound = new GreenfootSound("sounds/elephantcub.mp3");
    private int imageIndex = 0;
    private String direction = "right";

    public Elephant() {

        createAnimArray();
        setImage(idleRightAnim[0]);
    }

    public void act() {

        if (Greenfoot.isKeyDown("left")) {

            direction = "left";
            move(-5);
        }
        if (Greenfoot.isKeyDown("right")) {

            direction = "right";
            move(5);
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
        eatSound.setVolume(100);
        eatSound.play();
    }

    public void remove() {

        World world = getWorld();
        world.removeObject(this);
    }

    public void animateElephant() {
        MyWorld world = (MyWorld) getWorld();
        SimpleTimer timer = world.getTimer();
        if (timer.millisElapsed() >= 100) {
            if (direction.equals("right")) {
                imageIndex = (imageIndex + 1) % idleRightAnim.length;
                setImage(idleRightAnim[imageIndex]);
            } else {
                imageIndex = (imageIndex + 1) % idleLeftAnim.length;
                setImage(idleLeftAnim[imageIndex]);
            }
            timer.mark();
        }
    }

    public void createAnimArray() {

        for (int i = 0; i < 8; i++) {

            idleRightAnim[i] = new GreenfootImage("elephant_idle/idle" + i + ".png");
            idleLeftAnim[i] = new GreenfootImage("elephant_idle/idle" + i + ".png");
            idleLeftAnim[i].mirrorHorizontally();
        }
    }
}
