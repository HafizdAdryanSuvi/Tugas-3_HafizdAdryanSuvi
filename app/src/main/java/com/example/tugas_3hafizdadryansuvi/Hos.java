package com.example.tugas_3hafizdadryansuvi;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Hos extends ListActivity {
    protected void onCreate (Bundle icicle) {
        super.onCreate(icicle);
        String[] listHos = new String[] {"RS Awal Bros", "RS Eka Hospital", "RSJ Tampan", "RS Aulia Hospital"};
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
            if (pilihan.equals("RS Awal Bros")) {
                a = new Intent(this, AwalBros.class);
            } else if (pilihan.equals("RS Eka Hospital")) {
                a = new Intent(this, EkaHos.class);
            } else if (pilihan.equals("RSJ Tampan")) {
                a = new Intent(this, Tampan.class);
            } else if (pilihan.equals("RS Aulia Hospital")) {
                a = new Intent(this, Aulia.class);
            }
            startActivity(a);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
