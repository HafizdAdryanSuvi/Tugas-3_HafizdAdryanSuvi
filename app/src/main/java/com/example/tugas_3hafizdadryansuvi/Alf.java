package com.example.tugas_3hafizdadryansuvi;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Alf extends ListActivity {
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        String[] listAct = new String[]{"Call Center", "Message", "Direction", "Website", "Google Info", "Exit"};
        this.setListAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listAct));
    }

    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampilkan(pilihan);
    }

    private void tampilkan(String pilihan) {
        try {
            Intent a = null;
            if (pilihan.equals("Call Center")) {
                String tel = "tel:02180821555";
                a = new Intent(Intent.ACTION_DIAL, Uri.parse(tel));
            } else if (pilihan.equals("Message")) {
                String msg = "Hafizd Adryan Suvi";
                a = new Intent(Intent.ACTION_VIEW);
                a.setData(Uri.parse("sms:02180821555"));
                a.putExtra("sms_body", msg);
            } else if (pilihan.equals("Direction")) {
                String dir = "https://www.google.com/maps/place/Alfamart/@0.4322464,101.2477885,12z/data=!4m9!1m2!2m1!1salfa+mart!3m5!1s0x31d5a9b66d37deab:0xe3b52ff14220c10a!8m2!3d0.4581716!4d101.3552793!15sCglhbGZhIG1hcnQiA4gBAVoLIglhbGZhIG1hcnSSARFjb252ZW5pZW5jZV9zdG9yZQ";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(dir));
            } else if (pilihan.equals("Website")) {
                String web = "https://alfamart.co.id/";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(web));
            } else if (pilihan.equals("Google Info")) {
                String inf = "https://www.google.com/search?gs_ssp=eJzj4tVP1zc0TCpPya3IrTJWYDRgdGDw4kzMSUtUyE0sKgEAhfsIyA&q=alfa+mart&oq=a&aqs=chrome.1.69i59j46i39i199i291j69i59l2j0i67j69i60l3.1037j0j7&sourceid=chrome&ie=UTF-8";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(inf));
            } else if (pilihan.equals("Exit")) {
                finish();
            }
            startActivity(a);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
