package com.example.mylogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ImageView ivImage;
    private TextView tvLogin_page;
    private EditText etEmail, etPassword;
    private Button btnLogin;
    private TextView tvUser, tvSignup, tvForgot_password, tvRecover;

    private String email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivImage = findViewById(R.id.ivImage);
        tvLogin_page = findViewById(R.id.tvLogin_page);
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);
        tvUser = findViewById(R.id.tvUser);
        tvSignup = findViewById(R.id.tvsignup);
        tvForgot_password = findViewById(R.id.tvForgot_password);
        tvRecover = findViewById(R.id.tvRecover);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                email = etEmail.getText().toString().trim();
                password = etPassword.getText().toString().trim();

                validate();
            }
        });


    }

    private void validate() {
        if (email.isEmpty()) {
            etEmail.setError("email cannot be empty");
        }else if {password.isEmpty() || password.length() < 4) {
            etPassword.setError("password cannot be empty and or less than 4");
        } else {
             Toast.makeText(getApplicationContext(),  "Login sucessful", Toast.LENGTH_LONG).show();
        }

    }
}