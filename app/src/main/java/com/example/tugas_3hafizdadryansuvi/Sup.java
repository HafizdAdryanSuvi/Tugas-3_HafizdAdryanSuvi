package com.example.tugas_3hafizdadryansuvi;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Sup extends ListActivity {
    protected void onCreate (Bundle icicle) {
        super.onCreate(icicle);
        String[] listHos = new String[] {"Indomaret", "Alfamart", "Planet Swalayan", "Pesona Swalayan"};
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
            if (pilihan.equals("Indomaret")) {
                a = new Intent(this, Ind.class);
            } else if (pilihan.equals("Alfamart")) {
                a = new Intent(this, Alf.class);
            } else if (pilihan.equals("Planet Swalayan")) {
                a = new Intent(this, Pla.class);
            } else if (pilihan.equals("Pesona Swalayan")) {
                a = new Intent(this, Pes.class);
            }
            startActivity(a);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
