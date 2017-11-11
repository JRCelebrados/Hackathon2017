package com.example.jasmine.hackathonapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
public class MainActivity extends AppCompatActivity {

    private static Button button_stdt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            OnClickButtonListener();

        public void OnClickButtonListener(){
            button_stdt=(Button)findViewById(R.id.button);
            button_stdt.setOnClickListener(
                    new View.OnClickListener(){
                        @Override
                        public void OnClick(View V) {
                            Intent intent = new Intent("com.example.jasmine.hackathonapp.Main2Activity");
                            startActivity(intent);

                        }
                    }
        }

    }

    }

