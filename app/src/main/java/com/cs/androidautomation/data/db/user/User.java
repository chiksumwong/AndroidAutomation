package com.cs.androidautomation.data.db.user;

import android.widget.Button;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity
public class User {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "uid")
    private int uid;

    @ColumnInfo(name = "user_name")
    private String userName;

    @ColumnInfo(name = "email")
    private String email;

    @ColumnInfo(name = "password")
    private String password;

    public User(int uid, String userName, String email, String password){
        this.uid = uid;
        this.userName = userName;
        this.email = email;
        this.password = password;
    }

    @Ignore
    public User(String userName, String email, String password){
        this.userName = userName;
        this.email = email;
        this.password = password;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
