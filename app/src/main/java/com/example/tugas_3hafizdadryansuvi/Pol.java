package com.example.tugas_3hafizdadryansuvi;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Pol extends ListActivity {
    protected void onCreate (Bundle icicle) {
        super.onCreate(icicle);
        String[] listHos = new String[] {"Polda Riau", "Polresta Pekanbaru", "Polsek Tampan"};
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
            if (pilihan.equals("Polda Riau")) {
                a = new Intent(this, Polda.class);
            } else if (pilihan.equals("Polresta Pekanbaru")) {
                a = new Intent(this, Polres.class);
            } else if (pilihan.equals("Polsek Tampan")) {
                a = new Intent(this, Polsek.class);
            }
            startActivity(a);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
