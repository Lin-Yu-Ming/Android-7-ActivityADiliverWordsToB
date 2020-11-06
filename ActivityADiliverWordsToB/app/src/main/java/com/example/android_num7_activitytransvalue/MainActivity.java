package com.example.android_num7_activitytransvalue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_B();
    }
    public void clickAtoB(View v){

        EditText A_Activity_inputWord = (EditText)findViewById(R.id.Aactivity_inputWord);

        Intent intent = new Intent(this, SecondActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("T", A_Activity_inputWord.getText().toString());
        intent.putExtras(bundle);
        startActivity(intent);
    }
    private void text_B(){
        int B_activity_1 = 0;
        Bundle bundle = this.getIntent().getExtras();
        if(bundle != null) {
            B_activity_1 = Integer.parseInt(bundle.getString("R"));

            TextView B_activity = (TextView) findViewById(R.id.B_Words);
            B_activity.setText(Integer.toString(B_activity_1));
        }
    }
}