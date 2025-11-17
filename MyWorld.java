import greenfoot.*;
/**
 * Animal game
 * Author: Kolby Ng
 * Date: 17/11/2025
 */
public class MyWorld extends World {
    public MyWorld() 
    {
        super(600, 400, 1, false);
        Elephant e = new Elephant();
        addObject(e, 300, 200);
        createApple();
    }
    
    public void createApple()
    {
        Apple apple = new Apple();
        addObject(apple, Greenfoot.getRandomNumber(600), 0);
    }
}
