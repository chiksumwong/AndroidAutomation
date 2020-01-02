package com.cs.androidautomation.view.login;

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
import com.cs.androidautomation.data.db.user.User;
import com.cs.androidautomation.data.db.user.UserDatabase;

public class LoginActivity extends AppCompatActivity {

    private EditText username;
    private EditText pw;
    private Button loginBtn;
    private TextView signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.usrusr);
        pw = findViewById(R.id.pswrdd);
        loginBtn = findViewById(R.id.lin);
        signup = findViewById(R.id.sup);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usernameText = username.getText().toString();

                UserDatabase appDb = UserDatabase.getInstance(getApplicationContext());
                User user = appDb.userDao().getUserbyName(usernameText);
                if (user.getPassword().equals(pw.getText().toString())){
                    // Toast
                    Toast.makeText(getApplicationContext(), "HI! " + usernameText, Toast.LENGTH_LONG).show();

                    // Store the user info in local - SharedPreferences
                    SharedPreferences sharedPreferences;
                    sharedPreferences = getSharedPreferences("UserInfo", MODE_PRIVATE);
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putString("USER_NAME", usernameText);
                    editor.apply();
                }
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
