/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.UserDao;
import java.util.List;
import model.User;

/**
 *
 * @author spaceman33
 */
/**
 * Questa è la nostra BUSINESS LOGIC Accede alla classe del DB UserDao
 * implementa i suoi metodi Esegue query, inserisce nuovi user, "prende" gli
 * user o la lista degli user
 */
public class UserService {

    private final UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public int addUser(User user) {
        userDao.insertUser(user);
        return 1;
    }

    public List<User> getAllUsers() {
        return userDao.selectAllUsers();
    }
}
