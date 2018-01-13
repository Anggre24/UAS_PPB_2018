package com.sttg.pariwisata.pariwisata_garut;
import android.app.Activity;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Context;
import org.w3c.dom.Text;
/**
 * Created by NOGIZAKA46 on 1/12/2018.
 */

public class CostumeListAdapter extends ArrayAdapter<String>{
    private final Activity context;
    private final String[] menuItem;
    private final Integer[] menuGambar;

    public CostumeListAdapter(Activity context, String[] menuItem, Integer[] menuGambar){
        super(context, R.layout.activity_list,menuItem);
        this.context=context;
        this.menuItem=menuItem;
        this.menuGambar=menuGambar;
    }

    public View getView(int position,View view, ViewGroup parent){
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.activity_list,null, true);
        TextView textMenu = (TextView)rowView.findViewById(R.id.item_menu);
        ImageView imgMenu = (ImageView)rowView.findViewById(R.id.gambar);
        textMenu.setText(menuItem[position]);
        imgMenu.setImageResource(menuGambar[position]);

        return rowView;

    }


}

