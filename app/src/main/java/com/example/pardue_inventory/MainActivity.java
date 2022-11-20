package com.example.pardue_inventory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        defineButtons();
    }

    private void defineButtons() {

        findViewById(R.id.Login).setOnClickListener(buttonClickListener);
        findViewById(R.id.SignUp).setOnClickListener(buttonClickListener);

    }

    private View.OnClickListener buttonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.Login:
                    Intent look = new Intent(MainActivity.this, PermissionActivity4.class);
                    startActivity(look);
                    break;
                case R.id.SignUp:
                    Intent logout = new Intent(MainActivity.this, MainActivity.class);
                    startActivity(logout);
                    break;
            }

        }

    };

}