import java.util.*;
import greenfoot.*;
import java.util.ArrayList;
import java.io.*;
// (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.reflect.Constructor;

/**
 * Write a description of class Classroom here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Classroom extends World
{
    private ArrayList<Object> listo = new ArrayList<Object>();
    /**
     * Constructor for objects of class Classroom.
     *
     */
    public Classroom()
    {
        // Create a new world with 10x6 cells with a cell size of 130x130 pixels.
        super(10, 6, 130);

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */

     private void prepare()
    {
        JoeyHuang joeyhuang = new JoeyHuang("Joey", "Huang", 1, 1);
        joeyhuang.setPeriod(2);
        addObject(joeyhuang, 1, 1);
        joeyhuang.sitDown(); 
        
        SaiBalakumar saibalakumar = new SaiBalakumar("Sai", "Balakumar", 1, 2);
        saibalakumar.setPeriod(2);
        addObject(saibalakumar, 1, 2);
        saibalakumar.sitDown();
        
        TanishB tanishbaranwal = new TanishB("Tanish", "Baranwal", 2, 1);
        tanishbaranwal.setPeriod(3);
        addObject(tanishbaranwal, 2, 1);
        tanishbaranwal.sitDown(); 
        
        AyushBandopadhyay ayushbandopadhyay = new AyushBandopadhyay("Ayush", "Bandopadhyay", 2, 2);
        ayushbandopadhyay.setPeriod(3);
        addObject(ayushbandopadhyay, 2, 2);
        ayushbandopadhyay.sitDown();
        setPeriod(2);
    }
    public void setPeriod(int period){
        for (Object obj : getObjects(null)){
            if (((Student) obj).getPeriod() != period)
                ((Student) obj).getImage().setTransparency(0);
            else{
                ((Student) obj).getImage().setTransparency(100);
            }
    }
}

}

