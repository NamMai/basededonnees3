package com.example.nam.basededonnees;

/**
 * Created by Nam on 25/05/2015.
 */
public class utilisateur {
    int id;
    String login;
    String pass;




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }



    public utilisateur(int id, String login, String pass) {
        this.id = id;
        this.login = login;
        this.pass = pass;

    }
}
