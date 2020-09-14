/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import greenfoot.*;
public class Button extends Actor 
{
    // instance variables - replace the example below with your own
    private GreenfootImage button_1 = new GreenfootImage("./images/period2.jpg");
    private GreenfootImage button_2 = new GreenfootImage("./images/period3.jpg");
  
  // Creates boolean that will assist in diffrentiationg between when period 2 or period 3 is set
    private boolean mouseDown;

    public Button() {
        button_1.scale(50, 50);
        button_2.scale(50, 50);
        setImage(button_1);
        mouseDown = false;
    }

  // If based on the value for the mousDown variable and wether the button was clicked or not the if statements will intiate the worlds for either of the periods
    public void act() {
        if (!mouseDown && Greenfoot.mousePressed(this)){
            setImage(button_2);
            ((Classroom)getWorld()).setPeriod(3);
        }
        if (mouseDown && Greenfoot.mouseClicked(this)) {
            setImage(button_1);
            ((Classroom)getWorld()).setPeriod(2);
        }
  }
}
