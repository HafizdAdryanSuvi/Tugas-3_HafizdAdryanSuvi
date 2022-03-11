package com.example.tugas_3hafizdadryansuvi;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Aulia extends ListActivity {
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
                String tel = "tel:7616700000";
                a = new Intent(Intent.ACTION_DIAL, Uri.parse(tel));
            } else if (pilihan.equals("Message")) {
                String msg = "Hafizd Adryan Suvi/L";
                a = new Intent(Intent.ACTION_VIEW);
                a.setData(Uri.parse("sms:07616700000"));
                a.putExtra("sms_body", msg);
            } else if (pilihan.equals("Direction")) {
                String dir = "https://www.google.com/maps/place/Rs.+Aulia+Hospital/@0.463024,101.385075,14z/data=!4m5!3m4!1s0x0:0x7ff1fa4c15fa0dcc!8m2!3d0.4630237!4d101.385075?hl=id";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(dir));
            } else if (pilihan.equals("Website")) {
                String web = "https://auliahospital.co.id/";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(web));
            } else if (pilihan.equals("Google Info")) {
                String inf = "shttps://www.google.com/search?gs_ssp=eJzj4tVP1zc0TM4uLCowMDU2YLRSNagwNkwxTbQwTU0xMLNMMTZKszKoME9LM0xLNEk2NE1LNEhJTvbiSyzNyUxUyMgvLsgsScwBAMX6FXU&q=aulia+hospital&oq=aulia&aqs=chrome.2.69i57j46i433i512j46i20i175i199i263i512j46i512j0i512j46i512j46i175i199i512j0i512l2.4804j0j7&sourceid=chrome&ie=UTF-8";
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
