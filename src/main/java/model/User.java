/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.UUID;

/**
 *
 * @author spaceman33
 */
/**
 * Questa classe gestisce il nostro oggetto Parametri metodi GETTER e SETTER,
 * EQUALS e HASHCODE
 *
 * implementiamo serializable -> in modo tale che l'oggetto si possa spostare da
 * un'indirizzo di memoria ad un altro.
 */
public class User implements Serializable {

    private UUID id;
    private String usr;
    private String pwd;

    public User() {
    }

    public User(UUID id, String usr, String pwd) {
        this.id = id;
        this.usr = usr;
        this.pwd = pwd;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getUsr() {
        return usr;
    }

    public void setUsr(String usr) {
        this.usr = usr;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

}
