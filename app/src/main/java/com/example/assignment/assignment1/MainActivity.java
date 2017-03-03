package com.example.assignment.assignment1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnActivity;
    private Button btnDialog;
    private Button btnCloseApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnActivity=(Button)findViewById(R.id.btn_activity);
        btnDialog=(Button)findViewById(R.id.btn_dialog);

    }
}
