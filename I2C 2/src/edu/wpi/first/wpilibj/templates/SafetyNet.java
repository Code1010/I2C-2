/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates;

/**
 *
 * @author Cody
 */
public class SafetyNet implements Runnable{
    int state;
    GY85_I2C array;
    public SafetyNet(){
        array = new GY85_I2C();
        //start the new thread
        (new Thread(new SafetyNet())).start();
        state = 0;
    }
    
    /*
    
    CASE MACHINE STAES:
    0 - Not set up
    1 - 
    
    */
    
    public void run(){
        
        
        
    }
    
    
}
