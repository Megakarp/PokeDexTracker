package net.androidbootcamp.pokedextracker;

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
        Button kantobtn = (Button) findViewById(R.id.btnKanto);
        Button johtobtn = (Button) findViewById(R.id.btnJohto);
        Button hoennbtn = (Button) findViewById(R.id.btnHoenn);
        Button sinnohbtn = (Button) findViewById(R.id.btnSinnoh);
        kantobtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, kantoDex.class  ));
            }
        });
        johtobtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, johtoDex.class  ));
            }
        });
        hoennbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, hoennDex.class  ));
            }
        });
        sinnohbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, sinnohDex.class  ));
            }
        });
    }
}
