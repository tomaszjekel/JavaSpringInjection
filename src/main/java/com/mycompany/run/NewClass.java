/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  com.mycompany.run;

import com.mycompany.spring_w_akcji.api.Logger;
import com.mycompany.spring_w_akcji.api.UsersRepository;
import com.mycompany.spring_w_akcji.domain.User;
import com.mycompany.spring_w_akcji.implementations.LoggerImpl;
import com.mycompany.spring_w_akcji.implementations.UserRepositoryImpl;

/**
 *
 * @author tjekel
 */
public class NewClass {
    public static void main (String[] args){
        Logger logger = new LoggerImpl();
        System.out.println("tralala");
        UsersRepository userRepository = new UserRepositoryImpl();
        userRepository.setLogger(logger);
        User user = userRepository.createUser("Tomasz");
        
    }
}
