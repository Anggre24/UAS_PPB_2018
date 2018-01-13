package com.sttg.pariwisata.pariwisata_garut;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

/**
 * Created by NOGIZAKA46 on 1/13/2018.
 */

public class darajat extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pemandian_darajat);
        WebView web = (WebView)findViewById(R.id.web_4);
        String view_2 = "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "\t<title></title>\n" +
                "</head>\n" +
                "<body>\n" +
                "\t<p style=\"text-align: justify;\">\n" +
                "\t\tGunung Papandayan namanya mungin tidak asing lagi bagi kalian yang hobi hiking dan camping. Ya, Gunung Merapi yang statusnya masih aktif ini menawarkan keindahan alam yang memukau dan sayang untuk dilewati apabila sedang berlibur di Garut Jawa Barat. Salahsatu hal yang menjadi daya tarik dari Gunung papandayan adalah terdapat beberapa kawah yang terkenal yaitu Kawah Mas, Kawah Baru, Kawah Nangklak,Kawah Manuk. Kawah-kawah tersebut mengeluarkan uap dari sisi dalamnya.\n" +
                "</body>\n" +
                "</html>";
        web.loadData(view_2,"text/html",null);
    }
}