package com.example.assignment.assignment1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityB extends AppCompatActivity {

    private Button btnFinish;
    private int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

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
