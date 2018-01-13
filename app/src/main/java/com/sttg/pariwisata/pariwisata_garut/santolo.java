package com.sttg.pariwisata.pariwisata_garut;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

/**
 * Created by NOGIZAKA46 on 1/12/2018.
 */

public class santolo extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pantai_santolo);

        WebView web_2 = (WebView)findViewById(R.id.web_2);
        String view = "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "\t<title></title>\n" +
                "</head>\n" +
                "<body>\n" +
                "\t<p style=\"text-align: justify;\">\n" +
                "\t\tPantai Santolo adalah sebuah pantai yang terletak di Kabupaten Garut, Jawa Barat, Indonesia. Garut tidak hanya terkenal dengan Jeruk Garut tetapi salah satu pantai yang populer terdapat di Kabupaten Garut yaitu Pantai Santolo. Terletak di kec. Cikelet, sebelah selatan pusat kota Garut atau biasa disebut Garut Selatan, Garsel atau Garsela, jarak tempuh dalam waktu 3,5 jam perjalanan atau sekitar 88 km dari Garut Kota. Pantai ini cukup dikenal di kota Bandung dan merupakan daerah tujuan wisata . \n" +
                "\t</p>\n" +
                "</body>\n" +
                "</html>";
        web_2.loadData(view,"text/html",null);
    }
}
