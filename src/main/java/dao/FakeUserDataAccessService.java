/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import model.User;

/**
 *
 * @author spaceman33
 */
/**
 * Questa classe sarà la classe che riceve e risponde con il database Infatti si
 * occupa della gestione della persistenza e dell’accesso ai dati nell’ambito di
 * una sorgente dati Questa classe implementa i metodi che lavorano sul DB,
 *
 *
 */
public class FakeUserDataAccessService implements UserDao {

    private static List<User> DB = new ArrayList<>();

    @Override
    public int insertUser(UUID id, User user) {
        DB.add(user);
        return 1;
    }

    @Override
    public List<User> selectAllUsers() {
        return DB;
    }

}
