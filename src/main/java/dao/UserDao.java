/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import java.util.UUID;
import model.User;

/**
 *
 * @author spaceman33
 */
/**
 * Questa interfaccia ci permette di strutturare i metodi che useremo nella
 * classe FakeUserDataAccessService.java
 *
 */
public interface UserDao {

    //Metodo per inserire un nuovo user nel DB
    int insertUser(UUID id, User user);

    //Assegniamo l'id di default
    default int insertUser(User user) {
        UUID id = UUID.randomUUID();
        return insertUser(id, user);
    }

    List<User> selectAllUsers();
}
