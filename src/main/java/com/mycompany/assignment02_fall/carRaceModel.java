/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment02_fall;

import javafx.scene.paint.Paint;
import java.lang.Math;

/**
 *
 * @author mikly
 */
public class carRaceModel {
    
    public String blueCarType = "BMW";
    public int blueCarNumber = 67;
    public int blueCarXPosition = 0;
    public int blueCarYPosition = 0;
    public int blueCarSpeed = 0;
    public String blueCarColour = "Blue";
    
    public String redCarType = "Lamborghini";
    public int redCarNumber = 11;
    public int redCarXPosition = 0;
    public int redCarYPosition = 0;
    public int redCarSpeed = 0;
    public String redCarColour = "Red";
    
    public String greenCarType = "Ferrari";
    public int greenCarNumber = 99;
    public int greenCarXPosition = 0;
    public int greenCarYPosition = 0;
    public int greenCarSpeed = 0;
    public String greenCarColour = "Green";
    
    public String yellowCarType = "Porsche";
    public int yellowCarNumber = 8;
    public int yellowCarXPosition = 0;
    public int yellowCarYPosition = 0;
    public int yellowCarSpeed = 0;
    public String yellowCarColour = "Yellow";  
    
    public static int setCarSpeed() {
        return (int) ((Math.random() * 8) + 2);
    }

    public carRaceModel() {
        
    }

    public String getBlueCarType() {
        return blueCarType;
    }

    public String getRedCarType() {
        return redCarType;
    }

    public String getGreenCarType() {
        return greenCarType;
    }

    public String getYellowCarType() {
        return yellowCarType;
    }

    public int getBlueCarNumber() {
        return blueCarNumber;
    }

    public int getRedCarNumber() {
        return redCarNumber;
    }

    public int getGreenCarNumber() {
        return greenCarNumber;
    }

    public int getYellowCarNumber() {
        return yellowCarNumber;
    }

    public int getBlueCarSpeed() {
        return blueCarSpeed;
    }

    
    public int getRedCarSpeed() {
        return redCarSpeed;
    }

    public int getGreenCarSpeed() {
        return greenCarSpeed;
    }

    public int getYellowCarSpeed() {
        return yellowCarSpeed;
    }
    
    public String getBlueCarColour() {
        return blueCarColour;
    }

    public String getRedCarColour() {
        return redCarColour;
    }

    public String getGreenCarColour() {
        return greenCarColour;
    }

    public String getYellowCarColour() {
        return yellowCarColour;
    }
    
    public void setBlueCarSpeed() {
        this.blueCarSpeed = setCarSpeed();
    }

    public void setRedCarSpeed() {
        this.redCarSpeed = setCarSpeed();
    }

    public void setGreenCarSpeed() {
        this.greenCarSpeed = setCarSpeed();
    }

    public void setYellowCarSpeed() {
        this.yellowCarSpeed = setCarSpeed();
    }  
}
