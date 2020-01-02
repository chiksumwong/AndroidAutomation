package com.cs.androidautomation.data.api;

import com.cs.androidautomation.data.db.user.User;

import java.util.ArrayList;

public interface CallBack {
    void onSuccess(ArrayList<User> users);
    void onFail(String msg);
}
