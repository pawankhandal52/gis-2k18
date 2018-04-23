package com.udacity.googleindiascholarships;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.udacity.googleindiascholarships.ui.MainActivity;

public class LoginActivity extends AppCompatActivity {
    
   
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    
    public void login(View view) {
    
    }
    
    @Override
    public void onBackPressed() {
        finishAffinity();
        
    }
}

