package com.cs.androidautomation.ui.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.cs.androidautomation.R;

public class LoginActivity extends AppCompatActivity {

    private EditText username;
    private Button loginBtn;
    private TextView signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.usrusr);
        loginBtn = findViewById(R.id.lin);
        signup = findViewById(R.id.sup);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usernameText = username.getText().toString();

                // Store the user info in local - SharedPreferences
                SharedPreferences sharedPreferences;
                sharedPreferences = getSharedPreferences("UserInfo", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("USER_NAME", usernameText);
                editor.apply();

                // Toast
                Toast.makeText(getApplicationContext(), "HI! " + usernameText, Toast.LENGTH_LONG).show();
            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent
                Intent intent = new Intent(getApplicationContext(), SignupActivity.class);
                startActivity(intent);
            }
        });

    }
}
