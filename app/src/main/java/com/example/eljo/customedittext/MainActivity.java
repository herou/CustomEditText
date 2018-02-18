package com.example.eljo.customedittext;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;


public class MainActivity extends AppCompatActivity {

    EljoPriftiEditText edt_rounded;
    EljoPriftiEditText edt_rectangle;
    EljoPriftiEditText edt_bottomLine;

    ViewGroup transitionsContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        transitionsContainer = findViewById(R.id.transitions_container);
        edt_rounded = findViewById(R.id.edt_rounded);
        edt_rectangle = findViewById(R.id.edt_rectangle);
        edt_bottomLine = findViewById(R.id.edt_bottomLine);

        edt_rounded.init(edt_rounded,transitionsContainer,200,30,250,60);
        edt_rectangle.init(edt_rectangle,transitionsContainer,200,30,250,30);
        edt_bottomLine.init(edt_bottomLine,transitionsContainer,200,30,250,50);

    }
}
