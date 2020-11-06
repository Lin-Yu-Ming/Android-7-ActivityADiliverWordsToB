package com.example.android_num7_activitytransvalue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        text_A();
    }
    public void clickBtoA(View v){

        EditText B_Bactivity_InputWord = (EditText)findViewById(R.id.Bactivity_InputWord);

        Intent intent = new Intent(this, MainActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("R",B_Bactivity_InputWord.getText().toString());
        intent.putExtras(bundle);
        startActivity(intent);
    }
    private void text_A() {
        int A_activity_1= 0;
        Bundle bundle = this.getIntent().getExtras();
        if (bundle != null) {
            A_activity_1 = Integer.parseInt(bundle.getString("T"));

            TextView A_activity = (TextView)findViewById(R.id.B_Words);
            A_activity.setText(Integer.toString(A_activity_1));
        }
    }
}