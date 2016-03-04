/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spring_w_akcji.implementations;

import com.mycompany.spring_w_akcji.api.Logger;
import java.util.Date;

/**
 *
 * @author tjekel
 */
public class LoggerImpl implements Logger{
    public void log(String message){
      System.out.println(new Date()+ ": " + message);
    }
}
