package com.example.addition;

import android.R.id;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AdditionActivity extends ActionBarActivity {

	
	// Variable Declaration
	
	EditText firstNumber;
	EditText secondNumber;
	TextView addResult;
	Button btnAdd;
	
	double num1,num2,sum;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_addition);
		
		firstNumber = (EditText)findViewById(R.id.txtNumber1);
		secondNumber = (EditText)findViewById(R.id.txtNumber2);
		addResult = (TextView)findViewById(R.id.txtResult);
		btnAdd = (Button)findViewById(R.id.btnAdd);
		
		btnAdd.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				num1 = Double.parseDouble(firstNumber.getText().toString());
				num2 = Double.parseDouble(secondNumber.getText().toString());
				sum = num1 + num2;
				addResult.setText(Double.toString(sum));
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.addition, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
