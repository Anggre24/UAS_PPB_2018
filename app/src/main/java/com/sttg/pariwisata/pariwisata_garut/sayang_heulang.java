package com.sttg.pariwisata.pariwisata_garut;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

/**
 * Created by NOGIZAKA46 on 1/13/2018.
 */

public class sayang_heulang extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pantai_sayang_heulang);
        WebView web = (WebView)findViewById(R.id.web_6);
        String view_2 = "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "\t<title></title>\n" +
                "</head>\n" +
                "<body>\n" +
                "\t<p style=\"text-align: justify;\">\n" +
                "\t\tPantai Sayang heulang merupakan pantai berkarang yang bisa anda temukan di salah satu sisi pulau santolo. Keunikan dari pantai sayang heulang ini adalah adanya bentang karang yang menjorok jauh ke laut di sepanjang garis pantai. Di saat surut anda bisa berjalan di sepanajng bentang karang ini bahkan sampai ke sisi laut langsung. Anda bisa menemukan banyak ikan kecil berwarna warni yang terjebak di antara karang.</p>\n" +
                "</body>\n" +
                "</html>";
        web.loadData(view_2,"text/html",null);
    }
}
