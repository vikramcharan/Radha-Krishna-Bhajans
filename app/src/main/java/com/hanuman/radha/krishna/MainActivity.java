package com.hanuman.radha.krishna;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.analytics.FirebaseAnalytics;

/**
 * RadhaKrishna
 */
public class MainActivity extends AppCompatActivity {
    static Button sharingButton;
    private FirebaseAnalytics mFirebaseAnalytics;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);
        sharingButton= (Button) findViewById(R.id.btn2);
        sharingButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                shareIt();
            }
        });
    }
    public void buttonClickMantras(View v)
    {
        Intent intent3 = new Intent(getApplicationContext(), MantraList.class);
        startActivity(intent3);
    }
    public void buttonBhagavadGita(View v)
    {
        Intent intent3 = new Intent(getApplicationContext(), BhagavadGita.class);
        startActivity(intent3);
    }
    private void shareIt() {
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        String shareBody = "Hey! Check out this awesome Radha Krishna bhajans app - https://play.google.com/store/apps/details?id=com.hanuman.radha.krishna";
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
        startActivity(Intent.createChooser(sharingIntent, "Share via"));
    }


}
