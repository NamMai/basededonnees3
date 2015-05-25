package com.example.nam.basededonnees;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Nam on 25/05/2015.
 */
public class UserManager {

    DBManager dbm;
    SQLiteDatabase db;

    public UserManager(Context context) {
        dbm= new DBManager(context, "mabase", null, 1);
    }

    public void open()
    {
        db= dbm.getWritableDatabase();
    }
    public void close()
    {
        db.close();
    }

    public long AddUser(utilisateur u)
    {
        ContentValues vals= new ContentValues();
        vals.put("id", u.getId());
        vals.put("LOG", u.getLogin());
        vals.put("PASS", u.getPass());

        return db.insert("utilisateur",null, vals );
    }
}
