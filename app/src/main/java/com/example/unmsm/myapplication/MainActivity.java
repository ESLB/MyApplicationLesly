package com.example.unmsm.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button boton = (Button) findViewById(R.id.button);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(),Main2Activity.class);
                        startActivityForResult(intent,0);
            }
        });
        Button botonn = (Button) findViewById(R.id.button2);
        botonn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(),Main2Activity.class);
                startActivityForResult(intent,0);
            }
        });
        Button bot = (Button) findViewById(R.id.button3);
        bot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(),Main2Activity.class);
                startActivityForResult(intent,0);
            }
        });
    }
}
