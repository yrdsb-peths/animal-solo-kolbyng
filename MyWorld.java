import greenfoot.*;
/**
 * Animal game
 * Author: Kolby Ng
 * Date: 17/11/2025
 */
public class MyWorld extends World {
    private int score = 0;
    private Label scoreLabel;
    Elephant e;
    public MyWorld() 
    {
        super(600, 400, 1, false);
        e = new Elephant();
        addObject(e, 300, 200);

        createApple();

        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);
    }
    
    public void createApple()
    {
        Apple apple = new Apple();
        addObject(apple, Greenfoot.getRandomNumber(600), 0);
    }
    
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
    }
    
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game over", 100);
        addObject(gameOverLabel, 300, 200);
        Greenfoot.stop();
    }

    public Elephant getElephant()
    {
        return e;
    }
}
