package com.example.hackohio2019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class login_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);


        Button btnLogin = (Button)findViewById((R.id.btnLogin));
        btnLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent loginIntent = new Intent(getApplicationContext(),home_page.class);
                startActivity(loginIntent);
            }
        });

        TextView txtSignUp = (TextView) findViewById((R.id.txtSignUp));
        txtSignUp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent signupIntent = new Intent(getApplicationContext(),signup_page.class);
                startActivity(signupIntent);
            }
        });
    }
}


