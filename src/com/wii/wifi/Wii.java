/*
@author: Siddhartha Dimania
*/

package com.wii.wifi;

import android.app.Activity;
import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Wii extends Activity {

	private Button btnSubmit;
	private Button btnSubmit2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_wii);
		btnSubmit=(Button) findViewById(R.id.button1);
		btnSubmit2=(Button) findViewById(R.id.button2);
		
		addListenerOnButton();
	}
	public void addListenerOnButton() {
			btnSubmit.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				WifiManager wifi = (WifiManager) getSystemService(Context.WIFI_SERVICE);
				wifi.setWifiEnabled(true);
	               
	                    }
	            
	     });
		
			btnSubmit2.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					WifiManager wifi = (WifiManager) getSystemService(Context.WIFI_SERVICE);
					wifi.setWifiEnabled(false);
		               
		                    }
		            
		     });	
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_wii, menu);
		return true;
	}

}
