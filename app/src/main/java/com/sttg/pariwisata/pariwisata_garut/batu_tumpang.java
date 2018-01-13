package com.sttg.pariwisata.pariwisata_garut;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

/**
 * Created by NOGIZAKA46 on 1/13/2018.
 */

public class batu_tumpang extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.batu_tumpang);
        WebView web = (WebView) findViewById(R.id.web_5);
        String view_2 = "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "\t<title></title>\n" +
                "</head>\n" +
                "<body>\n" +
                "\t<p style=\"text-align: justify;\">\n" +
                "\t\tKawasan Batu Tumpang atau yang biasa disebut batu numpang itu merupakan kawasan perkebunan teh yang merupakan jalan menuju kawasan pantai selatan Garut jika diakses melalui rute Cikajang-Cisompet. Daya tarik dari tempat ini adalah kehadiran tebing batu berukuran super besar yang terletak tepat di samping jalan. Tebing batu itu memiliki ketinggian sekitar 150 meter dengan lebar sekitar 100 meter.</p>\n" +
                "</body>\n" +
                "</html>";
        web.loadData(view_2, "text/html", null);
    }
}
