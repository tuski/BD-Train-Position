package com.example.bdtrainposition;





import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.telephony.SmsManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	Button silkcity1,silkcity2,padma1,padma2,dhumketu1,dhumketu2;

	SmsManager manager = SmsManager.getDefault();
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
        silkcity1=(Button) findViewById(R.id.silkcity_btn1);
        silkcity2=(Button) findViewById(R.id.silkcity_btn2);
        padma1=(Button) findViewById(R.id.padma_btn1);
        padma2=(Button) findViewById(R.id.padma_btn2);
        dhumketu1=(Button) findViewById(R.id.dhumketu_btn1);
        dhumketu2=(Button) findViewById(R.id.dhumketu_btn2);
        
        
        silkcity1.setOnClickListener(new OnClickListener(){
        
        	

    		@Override
    		public void onClick(View v) {
    			
    				
            	//manager.sendTextMessage("16318", null, "TR 753",null, null);
            	
    			Intent intent = new Intent(MainActivity.this,RequestReceived.class);
            	startActivity(intent);
            	
    		}
        	
        });
        
    
    

    silkcity2.setOnClickListener(new OnClickListener(){
    
    	

		@Override
		public void onClick(View v) {
			
				
        	//manager.sendTextMessage("16318", null, "TR 754",null, null);
        	
			Intent intent = new Intent(MainActivity.this,RequestReceived.class);
        	startActivity(intent);
        	
		}
    	
    });
    
    padma1.setOnClickListener(new OnClickListener(){
        
    	

    		@Override
    		public void onClick(View v) {
    			
    				
            	//manager.sendTextMessage("16318", null, "TR 759",null, null);
            	
    			Intent intent = new Intent(MainActivity.this,RequestReceived.class);
            	startActivity(intent);
            	
    		}
        	
        });
    
    padma2.setOnClickListener(new OnClickListener(){
        
    	

    		@Override
    		public void onClick(View v) {
    			
    				
            	//manager.sendTextMessage("16318", null, "TR 760",null, null);
            	
    			Intent intent = new Intent(MainActivity.this,RequestReceived.class);
            	startActivity(intent);
            	
    		}
        	
        });
        
    dhumketu1.setOnClickListener(new OnClickListener(){
        
    	

    		@Override
    		public void onClick(View v) {
    			
    				
            	//manager.sendTextMessage("16318", null, "TR 769",null, null);
            	
    			Intent intent = new Intent(MainActivity.this,RequestReceived.class);
            	startActivity(intent);
            	
    		}
        	
        });
    dhumketu2.setOnClickListener(new OnClickListener(){
        
    	

    		@Override
    		public void onClick(View v) {
    			
    				
            	//manager.sendTextMessage("16318", null, "TR 770",null, null);
            	
    			Intent intent = new Intent(MainActivity.this,RequestReceived.class);
            	startActivity(intent);
            	
    		}
        	
        });
        
        
        
}
        
    
    }
			
	

	
	
	

