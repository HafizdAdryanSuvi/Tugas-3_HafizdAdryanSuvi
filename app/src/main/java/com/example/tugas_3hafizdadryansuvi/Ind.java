package com.example.tugas_3hafizdadryansuvi;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Ind extends ListActivity {
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
                String tel = "tel:02150897400";
                a = new Intent(Intent.ACTION_DIAL, Uri.parse(tel));
            } else if (pilihan.equals("Message")) {
                String msg = "Hafizd Adryan Suvi";
                a = new Intent(Intent.ACTION_VIEW);
                a.setData(Uri.parse("sms:02150897400"));
                a.putExtra("sms_body", msg);
            } else if (pilihan.equals("Direction")) {
                String dir = "https://www.google.com/maps/place/indomaret/@0.4608828,101.3253996,13z/data=!4m9!1m2!2m1!1sindomaret!3m5!1s0x31d5a8161c7d9739:0x1d85c4f3b265910f!8m2!3d0.4608273!4d101.3604486!15sCglpbmRvbWFyZXQiA4gBAVoLIglpbmRvbWFyZXSSAQ1ncm9jZXJ5X3N0b3Jl";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(dir));
            } else if (pilihan.equals("Website")) {
                String web = "https://indomaret.co.id/";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(web));
            } else if (pilihan.equals("Google Info")) {
                String inf = "https://www.google.com/search?gs_ssp=eJzj4tLP1TeoSjctsjBWYDRgdGDw4szMS8nPTSxKLQEAYsoHqw&q=indomaret&oq=indo&aqs=chrome.5.69i57j35i39j46i67i433j46i199i433i465i512j46i199i291i433i512l2j69i65j69i60.4342j0j7&sourceid=chrome&ie=UTF-8";
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
