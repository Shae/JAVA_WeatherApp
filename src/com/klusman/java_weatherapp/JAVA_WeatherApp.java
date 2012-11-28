package com.klusman.java_weatherapp;

import com.klusman.lib.formLayouts;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.LinearLayout;

public class JAVA_WeatherApp extends Activity {

	LinearLayout ll;
	LinearLayout.LayoutParams lp;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ll = new LinearLayout(this);
        ll.setOrientation(LinearLayout.VERTICAL);
        lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
        ll.setLayoutParams(lp);
        
        LinearLayout entryBox = formLayouts.entryLinePlusButton(this, "Enter Zip Code", "Go");
        ll.addView(entryBox);
        setContentView(ll);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_java__weather_app, menu);
        return true;
    }
    
}
