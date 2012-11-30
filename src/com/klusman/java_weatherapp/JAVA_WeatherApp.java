package com.klusman.java_weatherapp;

import com.klusman.lib.TemperatureTypes;
import com.klusman.lib.formLayouts;


import ColorFile.colors;
import android.R.color;
import android.os.Bundle;
import android.app.Activity;
import android.text.method.HideReturnsTransformationMethod;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
//import android.widget.TableLayout;
import android.widget.TextView;

public class JAVA_WeatherApp extends Activity {

	LinearLayout ll;
	LinearLayout.LayoutParams lp;
	LinearLayout myLine1;
	LinearLayout myLine2;
	LinearLayout myLine3;

	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        
        ll = new LinearLayout(this);
        ll.setOrientation(LinearLayout.VERTICAL);
        lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
        ll.setLayoutParams(lp);
        ll.setBackgroundColor(0xFF00FF00);
        
        
        
        myLine1 = formLayouts.myTextView(this);
        TextView myDay1 = (TextView) myLine1.findViewById(1);
        myDay1.setText(this.getString(R.string.day1) + "\r\n" + "Max Temp: " + this.getString(R.string.maxTemp) + TemperatureTypes.FAHRENHEIT + "\r\n" + "Min Temp: " + this.getString(R.string.minTemp) + TemperatureTypes.FAHRENHEIT + "\r\n" + "Wind Speed: " + this.getString(R.string.windSpeed));
        myLine1.setBackgroundColor(0xFF00CC00);
        
        myLine2 = formLayouts.myTextView(this);
        TextView my2 = (TextView) myLine2.findViewById(1);
        my2.setText(this.getString(R.string.day2) + "\r\n" + "Max Temp: " + this.getString(R.string.maxTemp2) + TemperatureTypes.FAHRENHEIT + "\r\n" + "Min Temp: " + this.getString(R.string.minTemp2) + TemperatureTypes.FAHRENHEIT + "\r\n" + "Wind Speed: " + this.getString(R.string.windSpeed2));
        myLine2.setBackgroundColor(0xFF00CCFF);
        
        myLine3 = formLayouts.myTextView(this);
        TextView my3 = (TextView) myLine3.findViewById(1);
        my3.setText(this.getString(R.string.day3) + "\r\n" + "Max Temp: " + this.getString(R.string.maxTemp3) + TemperatureTypes.FAHRENHEIT + "\r\n" + "Min Temp: " + this.getString(R.string.minTemp3) + TemperatureTypes.FAHRENHEIT + "\r\n" + "Wind Speed: " + this.getString(R.string.windSpeed3));
        myLine3.setBackgroundColor(0xFF00CCCC);
        

        
        LinearLayout entryBox = formLayouts.entryLinePlusButton(this, "Enter Zip Code", "Go");
        Button goBtn = (Button) entryBox.findViewById(2);
        
        goBtn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				EditText areaCode = (EditText) v.getTag();
				
				if(areaCode.getText().toString().compareTo("") == 1)   // Testing to see if "areaCode" is (not blank)
				{
					Log.i("Button Clicked :", areaCode.getText().toString());  //test line
				

				}
			}
		});

        
        
        
        
        //TableLayout myTable = formLayouts.table(this);
        
        
        ll.addView(entryBox);

        ll.addView(myLine1);
        ll.addView(myLine2);
        ll.addView(myLine3);

       
        setContentView(ll);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_java__weather_app, menu);
        return true;
    }
    

    
}
