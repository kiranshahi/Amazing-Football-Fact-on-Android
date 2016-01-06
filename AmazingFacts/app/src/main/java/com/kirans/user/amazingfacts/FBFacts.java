package com.kirans.user.amazingfacts;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;


import java.util.Random;


public class FBFacts extends Activity {

    private  FactBook mFactBook = new FactBook();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //AdView mAdView = (AdView) findViewById(R.id.AdView);
        AdRequest adRequest = new AdRequest.Builder().build();
      //  mAdView.loadAd(adRequest);

        //Declare our view variables and assign the vews from the layout file
        final TextView factsLabel =(TextView) findViewById(R.id.amazingTextView);
        Button showFactButton = (Button) findViewById(R.id.nextFactButton);
        View.OnClickListener Listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            //Update the label with our dynamic fact
                String fact = mFactBook.fact();

                factsLabel.setText(fact);



            }
        };
        showFactButton.setOnClickListener(Listener);
    }
}
