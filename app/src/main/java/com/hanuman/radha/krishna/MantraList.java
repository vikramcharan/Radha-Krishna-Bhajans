package com.hanuman.radha.krishna;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.google.firebase.analytics.FirebaseAnalytics;

/**
 * RadhaKrishna
 */

public class MantraList extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView list;
    private FirebaseAnalytics mFirebaseAnalytics;
    String[] itemname = {
            "Hare Krishna Hare Krishna\n"+
                    "Krishna Krishna Hare Hare\n" +
                    "Hare Rama Hare Rama\n" +
                    "Rama Rama Hare Hare",
            "Maiya Mori \nMain Nahi Maakhan Khaayo",
            "Govind Mero Hai\nGopal Mero Hai",
            "Om Mantra\nAum",
            "Aarti Kunj Bihari Ki",
            "Bada Natkhat Hai Krishna Kanhaiya",
            "Choti Choti Gaiya Chotay Chotay Gwaal",
            "Yashomati Maiya Se Bole Nandlala",
            "Mera Aapki Kripa se Sab Kaam ho raha hai",
            "Achyutam Keshavam",
//            "Sai Baba Mantra\nOm Shri Sainathaya Namaha"


    };
    Integer[] imgid = {
            R.drawable.krishna1,
            R.drawable.krishna3,
            R.drawable.krishna2,
            R.drawable.om,
            R.drawable.krishna5,
            R.drawable.krishna4,
            R.drawable.krishna6,
            R.drawable.krishna7,
            R.drawable.krishna8,
            R.drawable.krishna9,
//            R.drawable.list11
    };

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.mantra_list);

        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);


        //ListView listView = (ListView) findViewById(R.id.sites_list);
        //listView.setOnItemClickListener(this);
        CustomListAdapter adapter = new CustomListAdapter(this, itemname, imgid);
        list = (ListView) findViewById(R.id.mantras_list);
        list.setAdapter(adapter);

        list.setOnItemClickListener(this);


    }

    @Override
    public void onItemClick(AdapterView<?> l, View v, int position, long id) {


        Intent intent = new Intent();


        switch (position) {
            case 0:
                intent.setClass(this, MahaMantra.class);
                startActivity(intent);

                break;
            case 1:
                intent.setClass(this, MaiyaMoriMain.class);
                startActivity(intent);

                break;
            case 2:
                intent.setClass(this, HaiGopalMeroHai.class);
                startActivity(intent);

                break;
            case 3:
                intent.setClass(this, OmMantra.class);
                startActivity(intent);

                break;
            case 4:
                intent.setClass(this, AartiKunjBihariKi.class);
                startActivity(intent);

                break;
            case 5:
                intent.setClass(this, BadaNatkhatHaiKrishnaKanhaiya.class);
                startActivity(intent);

                break;
            case 6:
                intent.setClass(this, ChotiChotiGaiya.class);
                startActivity(intent);

                break;
            case 7:
                intent.setClass(this, YashomatiMaiyaSeBoleNandlala.class);
                startActivity(intent);

                break;
            case 8:
                intent.setClass(this, MeraAapkiKripaSe.class);
                startActivity(intent);

                break;
            case 9:
                intent.setClass(this, AchyutamKeshavam.class);
                startActivity(intent);


                break;
//            case 10:
//                intent.setClass(this, SaiBabaMantra.class);
//                startActivity(intent);
//
//
//                break;
            default:
                intent.setClass(this, MahaMantra.class);
                startActivity(intent);

                break;
        }
    }

}
