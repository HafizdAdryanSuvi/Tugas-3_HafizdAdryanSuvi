package com.example.tugas_3hafizdadryansuvi;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Man extends ListActivity {
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
                String tel = "tel:076123242";
                a = new Intent(Intent.ACTION_DIAL, Uri.parse(tel));
            } else if (pilihan.equals("Message")) {
                String msg = "Hafizd Adryan Suvi";
                a = new Intent(Intent.ACTION_VIEW);
                a.setData(Uri.parse("sms:076123242"));
                a.putExtra("sms_body", msg);
            } else if (pilihan.equals("Direction")) {
                String dir = "https://www.google.com/maps/place/Islamic+Senior+High+School+of+2+Model+Pekanbaru/@0.510848,101.4503591,17z/data=!3m1!4b1!4m5!3m4!1s0x31d5aea3d35b9fef:0x48e68f36d75fa9e!8m2!3d0.510848!4d101.4525478";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(dir));
            } else if (pilihan.equals("Website")) {
                String web = "https://m2mpekanbaru.sch.id/MAN2/";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(web));
            } else if (pilihan.equals("Google Info")) {
                String inf = "https://www.google.com/search?q=man+2+pekanbaru&sxsrf=APq-WBs1g0XDYWKIsjOHmoIV00gblVpPYQ%3A1646982810555&ei=mvYqYuC9Ieig4t4Phs2BuA8&gs_ssp=eJzj4tVP1zc0TCpPyUtKKSozYLRSMagwNkwxTUxNNE4xNk2yTEtNszKoMLFINbNIMzZLMTdNS7RM9eLPTcxTMFIoSM1OzEtKLCoFAO2dFaM&oq=man+2&gs_lcp=Cgdnd3Mtd2l6EAEYADIQCC4QgAQQhwIQxwEQrwEQFDIFCAAQywEyCwguEMcBEK8BEMsBMgsILhDHARCvARDLATIFCAAQywEyCwguEMcBEK8BEMsBMgsILhDHARCvARDLATILCC4QxwEQrwEQywEyCwguEMcBEK8BEMsBMgUIABDLAToNCC4QxwEQrwEQ6gIQJzoHCCMQ6gIQJzoECCMQJzoHCAAQsQMQQzoFCC4QsQM6CAgAELEDEIMBOggIABCABBCxAzoFCAAQgAQ6CwgAEIAEELEDEIMBOgUILhCRAjoICAAQsQMQkQI6BAgAEEM6BAguEEM6BQguEIAEOgUIABCRAjoICC4QgAQQsQM6DgguEIAEELEDEIMBENQCOg4ILhCABBCxAxDHARCjAjoOCC4QsQMQgwEQ1AIQkQI6CAguELEDEJECOgsILhCABBDHARCvAToOCC4QgAQQxwEQrwEQ1AJKBAhBGABKBAhGGABQ6AdYpRpguypoAXABeACAAY0BiAGWBJIBAzMuMpgBAKABAbABCsABAQ&sclient=gws-wiz";
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
