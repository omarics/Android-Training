package com.example.uipart1;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener{
	
	private TextView helloTV;
	private Button changeBT;
	private ImageView im;
	private EditText nameET;
	private CheckBox hideCB;
	private RadioButton radioYes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        helloTV = (TextView) findViewById(R.id.helloTV);
        
        helloTV.setTextColor(0xffff0000);
        
        changeBT = (Button) findViewById(R.id.changeBT);
        
        changeBT.setOnClickListener(this);
        
        im = (ImageView) findViewById(R.id.imageView1);
        
        im.setOnClickListener(this);
        
        
        hideCB = (CheckBox)findViewById(R.id.hideCB);
        hideCB.setOnClickListener(this);
        
        nameET = (EditText)findViewById(R.id.nameET);
        
        radioYes = (RadioButton)findViewById(R.id.radioYes);
    }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v.getId() == R.id.changeBT){
			helloTV.setText(getString(R.string.another_string));
		} 
		else if(v.getId() == R.id.imageView1){
			if (radioYes.isChecked()) {
				helloTV.setText(nameET.getText().toString());
			}
		}
		else if(v.getId() == R.id.hideCB){
			if (hideCB.isChecked()) {
				im.setVisibility(View.VISIBLE);
			} else
			{
				im.setVisibility(View.INVISIBLE);
			}
		}
	}
    
}
