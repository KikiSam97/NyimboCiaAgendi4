package com.example.kamau.nyimbociaagendi;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Content extends AppCompatActivity {


    SearchView search;
    ListView lstview;

  static   String [] items={"" +
            "1. Nĩngũinĩra Ngai Hoti ",
            "2. He Bibilia Njata Ya Gĩkeno",
            "3. Mbuku Ya Ngai",
            "4. Meha Arĩa Mamenyagĩrĩra ",
            "5. Igua Wega Ciugo Cia Jesũ",
            "6. Ndongoria Rĩu Jehova",
            "7. Reke Njerage Nawe Ngai",
            "8. Ngai Witũ Nĩ Ta Rũaro",
            "9. We Nĩũkeyũmia Rũhuho",
            "10. Gathai Ngai Andũ Aya "};


 ArrayAdapter<String> adapter;

@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    requestWindowFeature(Window.FEATURE_NO_TITLE);
    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_content);
        lstview=(ListView)findViewById(R.id.lst_view);
        search=(SearchView) findViewById(R.id.search_bar) ;

         adapter=new ArrayAdapter<String>(Content.this,android.R.layout.simple_list_item_1,items);
        lstview.setAdapter(adapter);


        lstview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i>3){
                    Toast.makeText(Content.this, "Not Available", Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent intent = new Intent(Content.this, Songs.class);
                    intent.putExtra("key_position", i);

                    startActivity(intent);
                }

                Toast.makeText(Content.this, "Thanks For Opening "+items[i], Toast.LENGTH_SHORT).show();

            }
        });


search.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
    @Override
    public boolean onQueryTextSubmit(String query) {
        ArrayList<String> nd=new ArrayList<String>();
        for(String  a:items){
            if(a.toLowerCase().contains(query.toLowerCase())) {
                nd.add(a);
            }
        }
        adapter=new ArrayAdapter<String>(Content.this,android.R.layout.simple_list_item_1,nd);
        lstview.setAdapter(adapter);


        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
     adapter.getFilter().filter(newText);

        lstview.setAdapter(adapter);



        return false;
    }
});

//        search.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//                adapter.getFilter().filter(charSequence);
//                lstview.setAdapter(adapter);
//            }
//
//            @Override
//            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//                adapter.getFilter().filter(charSequence);
//                lstview.setAdapter(adapter);
//            }
//
//            @Override
//            public void afterTextChanged(Editable editable) {
//
//            }
//        });
    }
}