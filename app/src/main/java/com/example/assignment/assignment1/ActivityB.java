package com.example.assignment.assignment1;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityB extends AppCompatActivity {

    private TextView txtActivityDesp;
    private Button btnFinish;
    private int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        ActionBar actionBar=getSupportActionBar();
        if(actionBar!=null){
            actionBar.setDisplayShowHomeEnabled(true);
            actionBar.setLogo(R.mipmap.ic_launcher);
            actionBar.setDisplayUseLogoEnabled(true);
        }

        txtActivityDesp=(TextView)findViewById(R.id.text_view_activity_desp);
        txtActivityDesp.setText(getString(R.string.activity_b_desp));
        btnFinish=(Button)findViewById(R.id.btn_finish);
        btnFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent main_intent=new Intent();
                main_intent.putExtra("count",count);
                setResult(RESULT_OK,main_intent);
                ActivityB.this.finish();
            }
        });

        count=getIntent().getExtras().getInt("count");

    }

    @Override
    protected void onResume(){
        super.onResume();
        count++;
    }
}
