package com.cs.androidautomation.ui.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.cs.androidautomation.R;
import com.cs.androidautomation.data.db.user.User;
import com.cs.androidautomation.data.db.user.UserDatabase;

public class SignupActivity extends AppCompatActivity {

    private EditText userName;
    private EditText password;
    private EditText email;
    private Button signup;
    private TextView goLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        signup = findViewById(R.id.sup);
        userName = findViewById(R.id.usrusr);
        email = findViewById(R.id.mail);
        password = findViewById(R.id.pswrdd);
        goLogin = findViewById(R.id.lin);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                UserDatabase appDb = UserDatabase.getInstance(getApplicationContext());
                User user = new User(userName.getText().toString(), email.getText().toString(), password.getText().toString());
                appDb.userDao().insertUser(user);

                // Toast
                Toast.makeText(getApplicationContext(), "Welcome! " + userName.getText().toString(), Toast.LENGTH_LONG).show();
            }
        });

        goLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
            }
        });



    }
}
