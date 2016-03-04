/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.run;

import com.mycompany.spring_w_akcji.api.UsersRepository;
import com.mycompany.spring_w_akcji.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author tjekel
 */
public class MainSpring {
       
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("konfiguracja.xml");
        UsersRepository userRepository = context.getBean("repozytoriumUzytkownikow",UsersRepository.class);
        User tomasz = userRepository.createUser("Tomasz_Spring");
    }
}
