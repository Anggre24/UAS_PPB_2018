package com.sttg.pariwisata.pariwisata_garut;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by NOGIZAKA46 on 1/12/2018.
 */

public class menu_utama extends AppCompatActivity {
    ImageButton wisata, kuliner, tentang;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);
        wisata = (ImageButton) findViewById(R.id.wisata);
        wisata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),list_wisata.class);
                startActivity(i);
            }
        });
        kuliner = (ImageButton) findViewById(R.id.wisata_kuliner);
        kuliner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        tentang = (ImageButton)findViewById(R.id.about);
        tentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),Tentang.class);
                startActivity(i);
            }
        });

    }
}

