package com.klusman.lib;

import android.content.Context;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;

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
	
}
