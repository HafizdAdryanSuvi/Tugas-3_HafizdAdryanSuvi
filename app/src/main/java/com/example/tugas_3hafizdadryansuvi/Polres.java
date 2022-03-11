package com.example.tugas_3hafizdadryansuvi;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Polres extends ListActivity {
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
                String tel = "tel:076121110";
                a = new Intent(Intent.ACTION_DIAL, Uri.parse(tel));
            } else if (pilihan.equals("Message")) {
                String msg = "Hafizd Adryan Suvi";
                a = new Intent(Intent.ACTION_VIEW);
                a.setData(Uri.parse("sms:076121110"));
                a.putExtra("sms_body", msg);
            } else if (pilihan.equals("Direction")) {
                String dir = "https://www.google.com/maps/place/Polresta+Pekanbaru/@0.5335484,101.4411265,17z/data=!3m1!4b1!4m5!3m4!1s0x31d5ac0e5898027d:0xf09dd0c61bcb93e3!8m2!3d0.5335557!4d101.443234";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(dir));
            } else if (pilihan.equals("Website")) {
                String web = "https://www.polrestapekanbaru.com/";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(web));
            } else if (pilihan.equals("Google Info")) {
                String inf = "https://www.google.com/search?gs_ssp=eJzj4tVP1zc0TEpOMzUwTi8zYLRSNagwNkwxTUw2SDW1sLQwMDJPsTKoSDOwTEkxSDYDqkyyNE419hIqyM8pSi0uSVQoSM1OzEtKLCoFAAmsFoU&q=polresta+pekanbaru&oq=polres&aqs=chrome.3.69i57j35i39l2j46i20i175i199i263i512j46i175i199i512l3j0i512j46i175i199i512j0i512.3733j0j7&sourceid=chrome&ie=UTF-8";
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
