import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scoreboard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scoreboard extends Actor
{
    /**
     * Act - do whatever the Scoreboard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    private int points;
    private Font myFont = new Font("Comic Sans MS", true, false, 24);//makes the font comic sans MS in the size of 24

    /**
     * adds the font to the code
     * Puts Score: to the code and places the adding numbers
     * Puts Score: at a specific coordinate
     */
    public Scoreboard()
    {
        points = 0;
        GreenfootImage img = new GreenfootImage(150,30);
        img.setFont( myFont );
        img.drawString("Score: " + points, 5,25);
        setImage(img);
    }

    /**
     * points add to the code
     * says that if the points are less than 11 keep adding the points
     * If not stop the scenerio
     */
    public void addToScore() 
    {
        points++;
        GreenfootImage img = getImage();
        img.clear();
        if(points < 11) {
            img.drawString("Score: " + points, 5,25); 
        } else {
           
            Greenfoot.stop();
        }        
    }    
}

