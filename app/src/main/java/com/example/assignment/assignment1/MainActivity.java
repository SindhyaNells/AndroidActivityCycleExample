package com.example.assignment.assignment1;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnActivity;
    private Button btnDialog;
    private Button btnCloseApp;
    private TextView textCount;
    private int count=0;
    private static final int ACTIVITYB_RESULT_CODE=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textCount=(TextView)findViewById(R.id.thread_count);

        btnActivity=(Button)findViewById(R.id.btn_activity);
        btnActivity.setOnClickListener(this);
        btnDialog=(Button)findViewById(R.id.btn_dialog);
        btnDialog.setOnClickListener(this);
        btnCloseApp=(Button)findViewById(R.id.btn_close_app);
        btnCloseApp.setOnClickListener(this);

    }

    @Override
    protected void onResume(){
        super.onResume();
        count++;
        Log.d("count",String.valueOf(count));
        textCount.setText(String.valueOf(count));
    }

    @Override
    public void onClick(View view) {
        int id=view.getId();
        switch (id){
            case R.id.btn_activity:
                Intent activity_intent=new Intent(MainActivity.this,ActivityB.class);
                activity_intent.putExtra("count",count);
                startActivityForResult(activity_intent,ACTIVITYB_RESULT_CODE);
                break;
            case R.id.btn_dialog:
                AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
                builder.setMessage(R.string.dialog_text).setTitle(R.string.dialog_label);
                AlertDialog dialog= builder.create();
                dialog.show();

                break;
            case R.id.btn_close_app:
                MainActivity.this.finish();
                break;
        }
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode==ACTIVITYB_RESULT_CODE){
            if(resultCode==RESULT_OK){
                int res_count= data.getExtras().getInt("count");
                count=res_count;
            }
        }
    }

}
