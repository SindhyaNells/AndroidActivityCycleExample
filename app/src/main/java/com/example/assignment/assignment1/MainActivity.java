package com.example.assignment.assignment1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnActivity;
    private Button btnDialog;
    private Button btnCloseApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnActivity=(Button)findViewById(R.id.btn_activity);
        btnActivity.setOnClickListener(this);
        btnDialog=(Button)findViewById(R.id.btn_dialog);
        btnDialog.setOnClickListener(this);
        btnCloseApp=(Button)findViewById(R.id.btn_close_app);
        btnCloseApp.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int id=view.getId();
        switch (id){
            case R.id.btn_activity:
                Intent activity_intent=new Intent(MainActivity.this,ActivityB.class);
                startActivity(activity_intent);
                break;
            case R.id.btn_dialog:
                break;
            case R.id.btn_close_app:
                MainActivity.this.finish();
                break;
        }
    }
}
