package com.sttg.pariwisata.pariwisata_garut;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
/**
 * Created by NOGIZAKA46 on 1/12/2018.
 */

public class list_wisata extends AppCompatActivity {
    String[] menuItem = {"Pantai Santolo","papandayan","Pemandian Darajat","Tebing Alam Batu Tumpang","Pantai Sayang Heulang"};
    Integer[]menuImage = {
            R.drawable.icon_1,
            R.drawable.icon_2,
            R.drawable.icon_3,
            R.drawable.icon_4,
            R.drawable.icon_5
    };

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_wisata);
        CostumeListAdapter adapter = new CostumeListAdapter(this,menuItem,menuImage);
        listView = (ListView)findViewById(R.id.list_pariwsata);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int a, long l) {
                if (a==0){
                    Intent b =  new Intent(getApplicationContext(),santolo.class);
                    startActivity(b);
                }
                if (a==1){
                    Intent b =  new Intent(getApplicationContext(),papandayan.class);
                    startActivity(b);
                }
                if (a==2){
                    Intent b =  new Intent(getApplicationContext(),darajat.class);
                    startActivity(b);
                }
                if (a==3){
                    Intent b =  new Intent(getApplicationContext(),batu_tumpang.class);
                    startActivity(b);
                }
                if (a==4){
                    Intent b =  new Intent(getApplicationContext(),sayang_heulang.class);
                    startActivity(b);
                }
            }
        });
        }

    }


