package com.example.bdtrainposition;


import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.TextView;


public class RequestReceived extends ActionBarActivity {

	
	TextView rqstReceived;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_request_received);
		
		rqstReceived=(TextView) findViewById(R.id.rqstmsg);
		
	}

	


}
