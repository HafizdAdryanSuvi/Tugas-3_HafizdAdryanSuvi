package com.example.tugas_3hafizdadryansuvi;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AwalBros extends ListActivity {
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
                String tel = "tel:08761586888";
                a = new Intent(Intent.ACTION_DIAL, Uri.parse(tel));
            } else if (pilihan.equals("Message")) {
                String msg = "Hafizd Adryan Suvi/L";
                a = new Intent(Intent.ACTION_VIEW);
                a.setData(Uri.parse("sms:08761586888"));
                a.putExtra("sms_body", msg);
            } else if (pilihan.equals("Direction")) {
                String dir = "https://www.google.com/maps/dir/0.4342532,101.3017898/RS+Awal+Bros+Panam,+Jl.+HR.+Soebrantas+No.88,+Sialangmunggu,+Tampan,+Pekanbaru+City,+Riau+28293/@0.4475269,101.2778856,12z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x31d5a8f5db0db97b:0x8f4c180a400c2d84!2m2!1d101.3903298!2d0.4632634";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(dir));
            } else if (pilihan.equals("Website")) {
                String web = "http://awalbros.com/";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(web));
            } else if (pilihan.equals("Google Info")) {
                String inf = "https://www.google.com/search?q=awal%20bros&sxsrf=APq-WBtMyGcfpE6JhgWtspE6_iGDfMfrgA:1646971859604&ei=ycsqYqHLD8ya4t4P89q28Aw&ved=2ahUKEwic7JWlmL32AhXV8XMBHS7XBRoQvS56BAgDEEo&uact=5&oq=awal+bros&gs_lcp=Cgdnd3Mtd2l6EAMyBAgjECcyCwguEIAEEMcBEK8BMgsILhDHARCvARDLATILCC4QgAQQxwEQrwEyBQgAEMsBMgUIABCABDIFCAAQgAQyBQgAEJECMgUIABCRAjIFCAAQywE6BwgAEEcQsAM6BggAEBYQHkoECEEYAEoECEYYAFCbC1jLEmD3FmgBcAF4AIABeogBkQWSAQMxLjWYAQCgAQHIAQjAAQE&sclient=gws-wiz&tbs=lrf:!1m4!1u3!2m2!3m1!1e1!1m4!1u2!2m2!2m1!1e1!2m1!1e2!2m1!1e3!3sIAE,lf:1,lf_ui:2&tbm=lcl&rflfq=1&num=10&rldimm=10325654477956984196&lqi=Cglhd2FsIGJyb3NIleGN4pmqgIAIWhcQABABGAAYASIJYXdhbCBicm9zMgJpZJIBEGdlbmVyYWxfaG9zcGl0YWw&rlst=f#rlfi=hd:;si:10325654477956984196,l,Cglhd2FsIGJyb3NIleGN4pmqgIAIWhcQABABGAAYASIJYXdhbCBicm9zMgJpZJIBEGdlbmVyYWxfaG9zcGl0YWw;mv:[[0.5423089,101.48708409999999],[0.4558857999999999,101.3848531]]";
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