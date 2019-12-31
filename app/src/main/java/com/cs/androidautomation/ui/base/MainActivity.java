package com.cs.androidautomation.ui.base;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.cs.androidautomation.R;
import com.cs.androidautomation.ui.login.LoginActivity;
import com.cs.androidautomation.ui.login.SignupActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goLogin(View view){
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

    public void goSignup(View view){
        Intent intent = new Intent(this, SignupActivity.class);
        startActivity(intent);
    }

    public void goSkip(View view){
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
}
