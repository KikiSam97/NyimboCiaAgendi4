package com.example.kamau.nyimbociaagendi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button Search, About;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Search=(Button)findViewById(R.id.search);
        About=(Button)findViewById(R.id.about);




        Search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(MainActivity.this, Content.class);
                startActivity(i);


            }
        });

        About.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent e=new Intent(MainActivity.this, About.class);
                startActivity(e);


            }
        });


    }


}
