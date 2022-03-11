package com.example.tugas_3hafizdadryansuvi;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Pes extends ListActivity {
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
                String tel = "tel:085270009487";
                a = new Intent(Intent.ACTION_DIAL, Uri.parse(tel));
            } else if (pilihan.equals("Message")) {
                String msg = "Hafizd Adryan Suvi";
                a = new Intent(Intent.ACTION_VIEW);
                a.setData(Uri.parse("sms:085270009487"));
                a.putExtra("sms_body", msg);
            } else if (pilihan.equals("Direction")) {
                String dir = "https://www.google.com/maps/place/Pesona+Swalayan/@0.467294,101.3647476,17z/data=!3m1!4b1!4m5!3m4!1s0x31d5a9caacbeb7eb:0x43508d1a56ea687a!8m2!3d0.467294!4d101.3669363";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(dir));
            } else if (pilihan.equals("Website")) {
                String web = "https://www.instagram.com/explore/locations/751511176/indonesia/pekanbaru/pesona-swalayan-jlgaruda-sakti-panam-pekanbaru/";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(web));
            } else if (pilihan.equals("Google Info")) {
                String inf = "https://www.google.com/search?q=pesona+swalayan&sxsrf=APq-WBsA7_SMGYMmbIgYscc5htz056ORHg%3A1646986710657&ei=1gUrYqncJ5LDz7sP6c2j-Ao&gs_ssp=eJzj4tFP1zcsqCpKtzQqKzBgtFI1qDA2TDFNtExOTExOSk0yT02yMqgwMTY1sEgxTDQ1S000szBP9OIvSC3Oz0tUKC5PzEmsTMwDAPEmFhE&oq=pesona&gs_lcp=Cgdnd3Mtd2l6EAEYADIQCC4QgAQQhwIQxwEQrwEQFDIFCAAQkQIyDQguEMcBEK8BEAoQywEyBQgAEMsBMgUIABDLATIFCAAQywEyBQgAEMsBMgUIABDLATILCC4QxwEQrwEQywEyBQguEMsBOgcIIxDqAhAnOg0ILhDHARCjAhDqAhAnOg0ILhDHARCvARDqAhAnOgQIIxAnOgoILhDHARCjAhBDOggIABCABBCxAzoFCAAQgAQ6CwgAEIAEELEDEIMBOgQILhAnOg4ILhDHARDRAxDUAhCRAjoLCC4QxwEQrwEQkQI6BAgAEEM6CAguELEDEIMBOggIABDJAxCRAjoFCAAQkgM6CAguEIAEELEDOgUILhCxAzoLCC4QgAQQxwEQrwE6BQguEIAESgQIQRgASgQIRhgAUNQFWJkMYIQbaAFwAHgAgAGzAogBmwiSAQcxLjMuMS4xmAEAoAEBsAEKwAEB&sclient=gws-wiz";
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
