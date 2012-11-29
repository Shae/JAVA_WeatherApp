package com.klusman.lib;

import android.content.Context;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class formLayouts {
	// Building a layout template for a text field with a button on the right
	
	
	
	public static LinearLayout entryLinePlusButton(Context context, String hint, String buttonText){
		LinearLayout ll = new LinearLayout(context);
		LayoutParams lp = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
		ll.setLayoutParams(lp);
		
		EditText et = new EditText(context);
		lp = new LayoutParams(0, LayoutParams.WRAP_CONTENT, 1.0f);
		et.setHint(hint);
		et.setLayoutParams(lp);
		et.setId(1);
		
		Button btn = new Button(context);
		btn.setText(buttonText);
		btn.setId(2);
		btn.setTag(et);
		
		ll.addView(et);
		ll.addView(btn);
		
		return ll;
		
	}
	
	public static TableLayout table(Context context) {
		String[] testData = {"test 1", "test 2", "Test 3", "Test 4"};
		int testDataSize = testData.length;
		int loopCount;
		
		LayoutParams params=new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.WRAP_CONTENT); 
		TableLayout tbl = new TableLayout(context);
		TableRow tr = new TableRow(context);
		tr.setLayoutParams(params);
		
		TextView tv = new TextView(context);
		
		tv.setText("text 1");  
		tr.addView(tv);
		tbl.addView(tr);
		
		return tbl;
	}
	
	
	
	
	
}
