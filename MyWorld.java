import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public int score=0;
    Label scoreLabel;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
        spawnApple();
        
        Label scoreLabel = new Label(score, 80);
        addObject(scoreLabel, 50, 50);
        
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    public void prepare()
    {
        Elephant elephant = new Elephant();
        addObject(elephant,298,195);
        
    }
     public void spawnApple(){
        Apple apple = new Apple();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(apple, x, y);
    }
    public void increaseScore(){
        score++;
        scoreLabel.setValue(score);
    }
}
