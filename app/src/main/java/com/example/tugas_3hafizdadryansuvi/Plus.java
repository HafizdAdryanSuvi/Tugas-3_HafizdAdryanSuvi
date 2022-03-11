package com.example.tugas_3hafizdadryansuvi;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Plus extends ListActivity {
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
                String tel = "tel:076141700";
                a = new Intent(Intent.ACTION_DIAL, Uri.parse(tel));
            } else if (pilihan.equals("Message")) {
                String msg = "Hafizd Adryan Suvi";
                a = new Intent(Intent.ACTION_VIEW);
                a.setData(Uri.parse("sms:076141700"));
                a.putExtra("sms_body", msg);
            } else if (pilihan.equals("Direction")) {
                String dir = "https://www.google.com/maps/place/SMAN+Plus+Riau/@0.4124173,101.3998254,17z/data=!3m1!4b1!4m5!3m4!1s0x31d5a873ae3de173:0x6596574a06800d8d!8m2!3d0.4124173!4d101.4020141";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(dir));
            } else if (pilihan.equals("Website")) {
                String web = "https://smanplus-provriau.sch.id/";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(web));
            } else if (pilihan.equals("Google Info")) {
                String inf = "https://www.google.com/search?q=smanplus+provinsi+riau&sxsrf=APq-WBsVfFIlw0jz9pC1QORxVEwPKQk3ew%3A1646974337459&ei=gdUqYq3XG6uWseMP4JSG6Ac&gs_ssp=eJzj4tVP1zc0TEo2L0pPKSo0YLRSNagwNkwxTbQwN05MNU5JNTQ3tjKoMDO1NDM1N0k0MLMwMEixSPESK85NzCvIKS1WKCjKL8vMK85UKMpMLAUAcrUX6Q&oq=smanp&gs_lcp=Cgdnd3Mtd2l6EAEYADIQCC4QgAQQhwIQxwEQrwEQFDIHCAAQChDLATIFCAAQywEyBQgAEMsBMgUIABDLATILCC4QxwEQrwEQywEyBwgAEAoQywEyCwguEIAEEMcBEK8BMgsILhDHARCvARDLATILCC4QxwEQrwEQywE6BwgjEOoCECc6DQguEMcBEK8BEOoCECc6BQgAEJECOhEILhCxAxDHARDRAxDUAhCRAjoFCAAQgAQ6DgguEIAEELEDEMcBENEDOggIABCxAxCDAToLCAAQgAQQsQMQgwE6CAgAEIAEELEDOgQIIxAnOggIABCxAxCRAjoOCC4QgAQQsQMQxwEQowI6BQguEIAEOgcIIxCxAhAnOg4ILhCABBCxAxDHARCvAUoECEEYAEoECEYYAFCvC1jHEGD5HmgBcAB4AIABcIgB5AOSAQMzLjKYAQCgAQGwAQrAAQE&sclient=gws-wiz";
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
