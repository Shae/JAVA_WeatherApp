package com.klusman.java_weatherapp;

import com.klusman.lib.formLayouts;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TableLayout;

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
        Button goBtn = (Button) entryBox.findViewById(2);
        
        goBtn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				EditText areaCode = (EditText) v.getTag();
				Log.i("Button Clicked :", areaCode.getText().toString());
				
			}
		});
        
        TableLayout myTable = formLayouts.table(this);
        
        
        ll.addView(entryBox);
        ll.addView(myTable);
        setContentView(ll);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_java__weather_app, menu);
        return true;
    }
    
}
