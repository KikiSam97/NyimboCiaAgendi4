package com.example.kamau.nyimbociaagendi;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class Songs extends AppCompatActivity {
TextView textViewSong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_songs);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        Intent intent=getIntent();
        int pos=intent.getIntExtra("key_position",0);

        getSupportActionBar().setTitle(Content.items[pos]);


     textViewSong=(TextView)findViewById(R.id.txt_song);
        textViewSong.setText(songs[pos]);



    }






    String[]songs={
        "Nĩngũinĩra Ngai hoti\n" +
                "Nĩngũinĩra Ngai hoti ya maũndu mothe,\n" +
                "Ombire irĩma na o na matu mothe,\n" +
                "Ũũgi wake watũmire riũa rĩthamake,\n" +
                "Mweri wathage ũtukũ na njata ikamũigua.\n" +
                "\n" +
                "Wega wa Mwathani witũ ũtũheaga irio,\n" +
                "Arikiia kũũmba indo ciothe oigire nĩ njega,\n" +
                "Kũria guothe ndaikia maitho no ũrirũ waku\n" +
                "Tĩĩ ũyũ o na matu nĩ cia kugegania\n" +
                "\n" +
                "Mĩtĩ yothe na mahũa ii na riiri waku,\n" +
                "Matu mathiũrũrũkaga o rĩrĩa ũngienda,\n" +
                "Ciũmbe ciothe iina muoyo uumite harĩ we,\n" +
                "Kũria guothe tũngiurĩra no ũgakorũo kuo. \n" ,
            "",

    };
}
