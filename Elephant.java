import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Elephant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Elephant extends Actor
{
    /**
     * Act - do whatever the Elephant wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private final int GRAVITY = 1;
    private int velocity;
    private boolean isFacingRight=true;
    public Elephant(){
        
    }
    public void act()
    {
        fall();
        move();
        if(Greenfoot.isKeyDown("space") && getY()>getWorld().getHeight()-50){
            jump();
        }
        
        if(isTouching(Apple.class)){
        removeTouching(Apple.class);
        MyWorld world = (MyWorld) getWorld();
        world.increaseScore();
        world.spawnApple();
        }
    }
    public void move(){
        int x=getX();
        int y=getY();
        /*if(Greenfoot.isKeyDown("W")){
            y-=2;
        }
        if(Greenfoot.isKeyDown("S")){
            y+=2;
        }
        */
        if(Greenfoot.isKeyDown("A")){
            isFacingRight=true;
            x-=4;
        }
        if(Greenfoot.isKeyDown("D")){
            isFacingRight=false;
            x+=4;
        }
        setLocation(x,y);
    }
    public void fall(){
        setLocation(getX(), getY() + velocity);
        if(getY()>getWorld().getHeight()-50){
            velocity=0;
        }
        else{
            velocity+=GRAVITY;
        }
    }
    public void jump(){
        velocity = -20;
    }
}
