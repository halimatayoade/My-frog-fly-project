import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 10 marks
 */
public class Frog extends Creature
{
    // The Frog's speed ...
    private int speed;
    
    public Frog()
    {        
        // set the Frog's speed to a random number between 4 and 8
      speed = Greenfoot.getRandomNumber(4 + 4);
    }
    
    public void act() 
    {
        // make the Frog move at its speed, in the direction it is facing
        move(10);
        /*
         * Make the frog turn off course 35% of the time.
         * It will turn left or right 15 degrees equally as often. 
         */ 
        if (Greenfoot.getRandomNumber(100) < 35)
           {
               turn(-15);
           }
        if (Greenfoot.getRandomNumber(2)<1)
        {
            turn(15);
        }  
       
        /*
         * If the frog is near an edge of the world, make it turn
         * 7 degrees to the right. 
         * 
         * Hint: use the atEdgeOfWorld method in the Creature class.
         */
        if (isAtEdge() == true)
        {
            turn(7);
        }
        
        
        /*
         * If the frog encounters the fly, the game ends, so
         * stop the scenario 
         */ 
        
        if (isTouching (Fly.class) == true)
        {
            Greenfoot.stop();
            removeTouching(Fly.class);
        }
    }    
}
