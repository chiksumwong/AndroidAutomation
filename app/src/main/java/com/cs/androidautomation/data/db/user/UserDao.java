package com.cs.androidautomation.data.db.user;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface UserDao {
    @Query("SELECT * FROM user")
    List<User> getUserList();

    @Query("SELECT * FROM user WHERE uid IN (:uid)")
    User getUserById(int uid);

    @Query("SELECT * FROM user WHERE user_name IN (:userName)")
    User getUserbyName(String userName);

    @Insert
    void insertUser(User user);

    @Update
    void updateUser(User user);

    @Delete
    void deleteUser(User user);
}
