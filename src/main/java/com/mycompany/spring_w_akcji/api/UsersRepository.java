/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spring_w_akcji.api;

import com.mycompany.spring_w_akcji.domain.User;

/**
 *
 * @author tjekel
 */
public interface UsersRepository {
  User createUser(String name);
  void setLogger(Logger logger);
}
