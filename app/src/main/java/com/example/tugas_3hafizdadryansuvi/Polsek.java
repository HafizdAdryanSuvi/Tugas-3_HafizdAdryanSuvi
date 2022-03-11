package com.example.tugas_3hafizdadryansuvi;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Polsek extends ListActivity {
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
                String tel = "tel:076164110";
                a = new Intent(Intent.ACTION_DIAL, Uri.parse(tel));
            } else if (pilihan.equals("Message")) {
                String msg = "Hafizd Adryan Suvi";
                a = new Intent(Intent.ACTION_VIEW);
                a.setData(Uri.parse("sms:076164110"));
                a.putExtra("sms_body", msg);
            } else if (pilihan.equals("Direction")) {
                String dir = "https://www.google.com/maps/place/Tampan+Sectoral+Police/@0.4651175,101.3857481,17z/data=!3m1!4b1!4m5!3m4!1s0x31d5a858af8f27d3:0x4ce4c9be814dedc4!8m2!3d0.465117!4d101.3879482";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(dir));
            } else if (pilihan.equals("Website")) {
                String web = "https://www.google.com/search?gs_ssp=eJzj4tFP1zc0yrVMSjNPqjRgtFI1qDA2TDFNtDC1SEyzSDMyTzG2MqgwSU41SbZMSrUwNElJTUk28eItyM8pTs1WKEnMLUjMAwCd5xS7&q=polsek+tampan&oq=polsek+&aqs=chrome.3.69i57j35i39j46i175i199i512j46i20i175i199i263i512j46i175i199i512l3j0i512l3.4265j0j7&sourceid=chrome&ie=UTF-8";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(web));
            } else if (pilihan.equals("Google Info")) {
                String inf = "https://www.google.com/search?gs_ssp=eJzj4tFP1zc0yrVMSjNPqjRgtFI1qDA2TDFNtDC1SEyzSDMyTzG2MqgwSU41SbZMSrUwNElJTUk28eItyM8pTs1WKEnMLUjMAwCd5xS7&q=polsek+tampan&oq=polsek+&aqs=chrome.3.69i57j35i39j46i175i199i512j46i20i175i199i263i512j46i175i199i512l3j0i512l3.4265j0j7&sourceid=chrome&ie=UTF-8";
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
