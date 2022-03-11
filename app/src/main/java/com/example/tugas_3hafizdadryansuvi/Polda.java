package com.example.tugas_3hafizdadryansuvi;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Polda extends ListActivity {
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
                String tel = "tel:110";
                a = new Intent(Intent.ACTION_DIAL, Uri.parse(tel));
            } else if (pilihan.equals("Message")) {
                String msg = "Hafizd Adryan Suvi/L";
                a = new Intent(Intent.ACTION_VIEW);
                a.setData(Uri.parse("sms:110"));
                a.putExtra("sms_body", msg);
            } else if (pilihan.equals("Direction")) {
                String dir = "https://www.google.com/maps/dir/0.4342532,101.3017898/Polda+Riau,+Jl.+Pattimura+No.13,+Cinta+Raja,+Sail,+Pekanbaru+City,+Riau+28127/@0.4705671,101.3097548,12z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x31d5aec14333e6f1:0xbcbc6a819ea27901!2m2!1d101.4578011!2d0.5105346";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(dir));
            } else if (pilihan.equals("Website")) {
                String web = "http://pidpoldariau.com/";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(web));
            } else if (pilihan.equals("Google Info")) {
                String inf = "https://www.google.com/search?sxsrf=APq-WBu8rG25vUEpkIeiHaiByX4eBbPK-w:1646973215257&q=polda%20riau&sa=X&ved=2ahUKEwjTtcyrnb32AhXxSWwGHRsEBcEQvS56BAgiEFY&biw=767&bih=784&dpr=1.25&tbs=lf:1,lf_ui:2&tbm=lcl&rflfq=1&num=10&rldimm=13599862079696828673&lqi=Cgpwb2xkYSByaWF1SO7a9fPlgICACFoWEAAYABgBIgpwb2xkYSByaWF1MgJpZJIBDnBvbGljZV9zdGF0aW9umgEkQ2hkRFNVaE5NRzluUzBWSlEwRm5TVVJyTjNNMlZtbEJSUkFCqgENEAEqCSIFcG9sZGEoJg&rlst=f#rlfi=hd:;si:13599862079696828673,l,Cgpwb2xkYSByaWF1SO7a9fPlgICACFoWEAAYABgBIgpwb2xkYSByaWF1MgJpZJIBDnBvbGljZV9zdGF0aW9umgEkQ2hkRFNVaE5NRzluUzBWSlEwRm5TVVJyTjNNMlZtbEJSUkFCqgENEAEqCSIFcG9sZGEoJg;mv:[[0.5505736,101.4692104],[0.39117599999999997,101.2562367]];tbs:lrf:!1m4!1u3!2m2!3m1!1e1!1m4!1u2!2m2!2m1!1e1!2m1!1e2!2m1!1e3!3sIAE,lf:1,lf_ui:2";
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
