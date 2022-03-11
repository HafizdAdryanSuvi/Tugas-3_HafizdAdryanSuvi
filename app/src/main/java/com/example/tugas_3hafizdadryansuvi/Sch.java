package com.example.tugas_3hafizdadryansuvi;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Sch extends ListActivity {
    protected void onCreate (Bundle icicle) {
        super.onCreate(icicle);
        String[] listHos = new String[] {"SMAN Plus Provinsi Riau", "SMAN 8 Pekanbaru", "MAN 2 Pekanbaru", "SMAS Darma Yudha"};
        this.setListAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listHos));
    }

    protected void onListItemClick (ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampilkan(pilihan);
    }

    private void tampilkan(String pilihan) {
        try {
            Intent a = null;
            if (pilihan.equals("SMAN Plus Provinsi Riau")) {
                a = new Intent(this, Plus.class);
            } else if (pilihan.equals("SMAN 8 Pekanbaru")) {
                a = new Intent(this, Del.class);
            } else if (pilihan.equals("MAN 2 Pekanbaru")) {
                a = new Intent(this, Man.class);
            } else if (pilihan.equals("SMAS Darma Yudha")) {
                a = new Intent(this, Dar.class);
            }
            startActivity(a);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
