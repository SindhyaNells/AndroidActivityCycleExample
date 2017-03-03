package com.example.assignment.assignment1;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class DialogActivity extends Activity {

    private TextView textDialog;
    private Button buttonOk;
    private int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_dialog);

        textDialog=(TextView)findViewById(R.id.dialog_msg);
        textDialog.setText(getString(R.string.dialog_text));
        buttonOk=(Button)findViewById(R.id.btn_dialog_ok);
        buttonOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent main_intent=new Intent();
                main_intent.putExtra("count",count);
                setResult(RESULT_OK,main_intent);
                DialogActivity.this.finish();
            }
        });

        count=getIntent().getExtras().getInt("count");
    }

    @Override
    protected void onResume() {
        super.onResume();
        count++;

    }
}
