package com.example.tugas_3hafizdadryansuvi;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Pla extends ListActivity {
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
                String tel = "tel:0761674087";
                a = new Intent(Intent.ACTION_DIAL, Uri.parse(tel));
            } else if (pilihan.equals("Message")) {
                String msg = "Hafizd Adryan Suvi";
                a = new Intent(Intent.ACTION_VIEW);
                a.setData(Uri.parse("sms:0761674087"));
                a.putExtra("sms_body", msg);
            } else if (pilihan.equals("Direction")) {
                String dir = "https://www.google.com/maps/place/Planet+Swalayan+Marpoyan/@0.4418352,101.3789717,12z/data=!4m9!1m2!2m1!1splanet+swalayan+pekanbaru!3m5!1s0x31d5af58eb6749a7:0x5e16ca63dc66492d!8m2!3d0.4418631!4d101.4489437!15sChlwbGFuZXQgc3dhbGF5YW4gcGVrYW5iYXJ1WhsiGXBsYW5ldCBzd2FsYXlhbiBwZWthbmJhcnWSAQtzdXBlcm1hcmtldJoBJENoZERTVWhOTUc5blMwVkpRMEZuU1VSeFoxbGxXRzFuUlJBQg";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(dir));
            } else if (pilihan.equals("Website")) {
                String web = "https://www.facebook.com/planetswalayan/";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(web));
            } else if (pilihan.equals("Google Info")) {
                String inf = "https://www.google.com/search?q=planet+swalayan+pekanbaru&sxsrf=APq-WBs0upCK_ec9jMUJjlnDjjKT4xa_ow%3A1646985362579&ei=kgArYtmAI7Paz7sPi-ujyAI&oq=plnet+sw&gs_lcp=Cgdnd3Mtd2l6EAMYATIECAAQDTIECAAQDTIKCC4QxwEQrwEQDTIKCC4QxwEQrwEQDTIECAAQDTIECAAQDTIECAAQDTIECAAQDTIECAAQDTIECAAQDToNCC4QxwEQowIQ6gIQJzoHCCMQ6gIQJzoNCC4QxwEQrwEQ6gIQJzoECCMQJzoKCC4QxwEQrwEQJzoFCAAQkQI6CAgAELEDEJECOgUIABCABDoICAAQgAQQsQM6CwgAEIAEELEDEIMBOgsILhCABBDHARCjAjoECAAQQzoLCC4QsQMQxwEQrwE6BwgAEMkDEEM6DgguEIAEELEDEMcBEK8BOgoIABCABBCHAhAUOggIABCxAxCDAToKCC4QxwEQrwEQQzoKCC4QxwEQowIQQzoHCAAQgAQQCjoKCAAQsQMQgwEQCjoHCAAQsQMQCjoECAAQCjoHCAAQChDLAToKCC4QxwEQrwEQCkoECEEYAEoECEYYAFCVBliLK2CJR2gCcAF4AIABnQGIAe0GkgEDNS40mAEAoAEBsAEKwAEB&sclient=gws-wiz";
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
