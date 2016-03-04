/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spring_w_akcji.implementations;
import com.mycompany.spring_w_akcji.api.Logger;
import com.mycompany.spring_w_akcji.api.UsersRepository;
import com.mycompany.spring_w_akcji.domain.User;

/**
 *
 * @author tjekel
 */
public class UserRepositoryImpl implements UsersRepository{
    private Logger logger;
    public User createUser(String name){
        logger.log("Tworzenie użytkownika " + name);
        return new User(name);
    }


    public void setLogger(Logger logger) {
        this.logger = logger;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
    }

}
