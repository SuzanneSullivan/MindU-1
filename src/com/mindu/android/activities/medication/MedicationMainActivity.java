package com.mindu.android.activities.medication;

import com.mindu.android.medication.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.view.View;


public class MedicationMainActivity extends Activity {
	
	Button btn;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); 
        setContentView(R.layout.main); 
        btn = (Button)findViewById(R.id.btnAddMedication);
        btn.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View arg0) {
			Intent intent = new Intent();
			intent.setClass(getBaseContext(), MedicationAddActivity.class);
			startActivity(intent);
			}
        });             
    }   
}