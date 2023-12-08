package com.rafsan.class238layoutinflaterpart2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout mainLayout,myLayout;

    Button buttonAdd,buttonRemove;

    LayoutInflater layoutInflater;

    ImageView imageRaf;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainLayout = findViewById(R.id.mainLayout);
        buttonAdd = findViewById(R.id.buttonAdd);
        buttonRemove = findViewById(R.id.buttonRemove);

        myLayout = findViewById(R.id.myLayout);

//  ============ (imageRaf) ai khane initialize korle programme Crash korbe=======
        //imageRaf = findViewById(R.id.imageRaf);



        layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View myView =  layoutInflater.inflate(R.layout.layout_inflater,myLayout);

        
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View myView =  layoutInflater.inflate(R.layout.layout_inflater,myLayout);
            }
        });

        imageRaf = myView.findViewById(R.id.imageRaf);

        imageRaf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                buttonAdd.setText("Hello Rafsan,How r You?");

            }
        });

        buttonRemove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            myLayout.removeAllViews();

            }
        });



    }
}