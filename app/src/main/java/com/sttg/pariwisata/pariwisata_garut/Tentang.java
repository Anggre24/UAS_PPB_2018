package com.sttg.pariwisata.pariwisata_garut;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

/**
 * Created by NOGIZAKA46 on 1/12/2018.
 */

public class Tentang extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tentang);
        WebView view = (WebView)findViewById(R.id.webview);
        String WEB = "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "\t<title></title>\n" +
                "</head>\n" +
                "<body>\n" +
                "\t<p>Aplikasi Infomasi Pariwisata Kab.Garut</p>\n" +
                "\t<p>Aplikasi ini adalah aplikasi tentang</p>\n" +
                "\t<p>Pariwisata di Kab.Garut</p>\n" +
                "\t<br/>\n" +
                "\t<p>Anggota Kelompok :</p>\n" +
                "\t<br>\n" +
                "\t<p>Raden Nazar Labani\t(1406096)</p>\n" +
                "\t<p>Toni Nugraha \t\t(1406127)</p>\n" +
                "\t<p>Annisa Utami Luthfi \t(1406018)</p>\n" +
                "</body>\n" +
                "</html>";
        view.loadData(WEB,"text/html",null);
    }
}
