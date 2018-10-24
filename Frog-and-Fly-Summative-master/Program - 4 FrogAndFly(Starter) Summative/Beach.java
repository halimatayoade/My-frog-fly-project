import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 5 marks
 */
/**

 * Name: Hali Ayoade

 * Class: Software Development 10S

 * Teacher: ]Mr. Hardman

 * Date Last Modified: 10/23/2018
 */
public class Beach extends World
{
   private Scoreboard score;
   
   /**
    * Makes some the scoreboards functions
    * Makes the score text be at the top-left part of the screen
    * Makes the fly class appear in random spots everytime
    * Makes the frog class appear in the middle of the screen
    */
    public Beach()
    {    
       super(800, 600, 1); 
       // add 10 Food objects to the world (NOTE: YOU SHOULD BE CALLING A METHOD FROM THIS CLASS TO 
        addFood(10);
        
       // add a Fly object at a random position somewhere in the world
        addObject(new Fly(),Greenfoot.getRandomNumber(getWidth()),Greenfoot.getRandomNumber( getHeight()));
        
       // add a Frog object at the center of the world 
        addObject(new Frog(), getWidth()/2, getHeight()/2);
        
        score = new Scoreboard();
        addObject(score,75,25);
    }
    
    /**
     * Adds n Food objects to the world
     */
    public void addFood(int n)
    {
        addObject( new Food(), Greenfoot.getRandomNumber(getWidth() ), Greenfoot.getRandomNumber(getHeight() ) );
        addObject( new Food(), Greenfoot.getRandomNumber(getWidth() ), Greenfoot.getRandomNumber(getHeight() ) );
        addObject( new Food(), Greenfoot.getRandomNumber(getWidth() ), Greenfoot.getRandomNumber(getHeight() ) );
        addObject( new Food(), Greenfoot.getRandomNumber(getWidth() ), Greenfoot.getRandomNumber(getHeight() ) );
        addObject( new Food(), Greenfoot.getRandomNumber(getWidth() ), Greenfoot.getRandomNumber(getHeight() ) );
        addObject( new Food(), Greenfoot.getRandomNumber(getWidth() ), Greenfoot.getRandomNumber(getHeight() ) );
        addObject( new Food(), Greenfoot.getRandomNumber(getWidth() ), Greenfoot.getRandomNumber(getHeight() ) );
        addObject( new Food(), Greenfoot.getRandomNumber(getWidth() ), Greenfoot.getRandomNumber(getHeight() ) ); addObject( new Food(), Greenfoot.getRandomNumber(getWidth() ), Greenfoot.getRandomNumber(getHeight() ) );
        addObject( new Food(), Greenfoot.getRandomNumber(getWidth() ), Greenfoot.getRandomNumber(getHeight() ) );
    }
    /**
     * adds a frog in the middle of the world
     */
    public void addFrog()
    {
        addObject(new Frog(), getWidth()/2, getHeight()/2);
    }
    /**
     * adds numbers to the score
     * the update is going to the fly class. So that when a fly touches fruit it adds on to the score.
     */
    public void update()
    {
        score.addToScore();
    } 
}
