package com.example.gscalculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends ActionBarActivity {

	EditText input;
	Button button_zero,button_one,button_two,button_three,button_four,button_five,button_six,button_seven,button_eight,button_nine,button_equal,button_plus,button_minus,button_mult,button_div,button_c,button_del,button_dot,button_negative;
	public double num;
	public boolean plus= false;
	public boolean minus = false;
	public boolean mult = false;
	public boolean div = false;
	public boolean enter = false;
	public boolean clear = false;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		input = (EditText) findViewById(R.id.editText1);
		input.setEnabled(false);
		button_zero = (Button) findViewById(R.id.button10);
		button_one = (Button) findViewById(R.id.button6);
		button_two = (Button) findViewById(R.id.button3);
		button_three = (Button) findViewById(R.id.button7);
		button_four = (Button) findViewById(R.id.button4);
		button_five = (Button) findViewById(R.id.button2);
		button_six= (Button) findViewById(R.id.button5);
		button_seven= (Button) findViewById(R.id.button8);
		button_eight= (Button) findViewById(R.id.button1);
		button_nine= (Button) findViewById(R.id.button9);
		button_equal= (Button) findViewById(R.id.button12);
		button_plus= (Button) findViewById(R.id.button17);
		button_minus= (Button) findViewById(R.id.button18);
		button_mult= (Button) findViewById(R.id.button15);
		button_div= (Button) findViewById(R.id.button16);
		button_c= (Button) findViewById(R.id.button13);
		button_del= (Button) findViewById(R.id.button14);
		button_dot= (Button) findViewById(R.id.button11);
		button_negative= (Button) findViewById(R.id.button19);
		button_zero.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(v==button_zero)
				{
					if(enter)
					{
						enter = false;
						input.setText("");
					}
					CharSequence text = "0";
					input.append(text);
				}
			}
		});
		button_one.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(v==button_one)
				{
					if(!plus&&!minus&&!mult&&!div)
					{
						num=0;
					}
					if(enter)
					{
						enter = false;
						input.setText("");
					}
					CharSequence text = "1";
					input.append(text);
				}
			}
		});
		button_two.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(v==button_two)
				{
					if(!plus&&!minus&&!mult&&!div)
					{
						num=0;
					}
					if(enter)
					{
						enter = false;
						input.setText("");
					}
					CharSequence text = "2";
					input.append(text);
				}
			}
		});	
		button_three.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(v==button_three)
				{
					if(!plus&&!minus&&!mult&&!div)
					{
						num=0;
					}
					if(enter)
					{
						enter = false;
						input.setText("");
					}
					CharSequence text = "3";
					input.append(text);
				}
			}
		});	
		button_four.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(v==button_four)
				{
					if(!plus&&!minus&&!mult&&!div)
					{
						num=0;
					}
					if(enter)
					{
						enter = false;
						input.setText("");
					}
					CharSequence text = "4";
					input.append(text);
				}
			}
		});	
		button_five.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(v==button_five)
				{
					if(!plus&&!minus&&!mult&&!div)
					{
						num=0;
					}
					if(enter)
					{
						enter = false;
						input.setText("");
					}
					CharSequence text = "5";
					input.append(text);
				}
			}
		});	
		button_six.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(v==button_six)
				{
					if(!plus&&!minus&&!mult&&!div)
					{
						num=0;
					}
					if(enter)
					{
						enter = false;
						input.setText("");
					}
					CharSequence text = "6";
					input.append(text);
				}
			}
		});	
		button_seven.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(v==button_seven)
				{
					if(!plus&&!minus&&!mult&&!div)
					{
						num=0;
					}
					if(enter)
					{
						enter = false;
						input.setText("");
					}
					CharSequence text = "7";
					input.append(text);
				}
			}
		});	
		button_eight.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(v==button_eight)
				{
					if(!plus&&!minus&&!mult&&!div)
					{
						num=0;
					}
					if(enter)
					{
						enter = false;
						input.setText("");
					}
					CharSequence text = "8";
					input.append(text);
				}
			}
		});	
		button_nine.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(v==button_nine)
				{
					if(!plus&&!minus&&!mult&&!div)
					{
						num=0;
					}
					if(enter)
					{
						enter = false;
						input.setText("");
					}
					CharSequence text = "9";
					input.append(text);
				}
			}
		});	
		button_equal.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(v==button_equal)
				{
					if(plus)
					{
						plus= false;
						double numstring = Double.parseDouble(input.getText().toString().trim());
						num =num+numstring;
						input.setText(Double.toString(num));
					}
					else if(minus)
					{
						minus = false;
						double numstring = Double.parseDouble(input.getText().toString().trim());
						num =num-numstring;
						input.setText(Double.toString(num));
					}
					else if(mult)
					{
						mult = false;
						double numstring = Double.parseDouble(input.getText().toString().trim());
						num =num * numstring;
						input.setText(Double.toString(num));
					}
					else if(div)
					{
						div = false;
						double numstring = Double.parseDouble(input.getText().toString().trim());
						num =num/numstring;
						input.setText(Double.toString(num));
					}
					enter = true;
				}
			}
		});	
		button_plus.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(v==button_plus)
				{
					clear = false;
					if(plus)
					{
						double numstring = Double.parseDouble(input.getText().toString().trim());
						num =num+numstring;
						input.setText(Double.toString(num));
					}
					else if(minus)
					{
						double numstring = Double.parseDouble(input.getText().toString().trim());
						num =num-numstring;
						input.setText(Double.toString(num));
						minus=false;
					}
					else if(mult)
					{
						double numstring = Double.parseDouble(input.getText().toString().trim());
						num =num * numstring;
						input.setText(Double.toString(num));
						mult=false;
					}
					else if(div)
					{
						double numstring = Double.parseDouble(input.getText().toString().trim());
						num =num/numstring;
						input.setText(Double.toString(num));
						div=false;
					}
					else
					{
						String str = input.getText().toString().trim();
						if(str.length()!=0)
						{
							double numstring = Double.parseDouble(input.getText().toString().trim());
							if(num==0)
							{
								num = numstring;
								enter = true;
							}
						}
						else
							clear = true;
						
					}
					if(!clear)
					{
						plus=true;
						enter = true;
					};
					
				}
			}
		});	
		button_minus.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(v==button_minus)
				{
					clear = false;
					if(plus)
					{
						double numstring = Double.parseDouble(input.getText().toString().trim());
						num =num+numstring;
						input.setText(Double.toString(num));
						plus=false;
					}
					else if(minus)
					{
						double numstring = Double.parseDouble(input.getText().toString().trim());
						num =num-numstring;
						input.setText(Double.toString(num));
					}
					else if(mult)
					{
						double numstring = Double.parseDouble(input.getText().toString().trim());
						num =num * numstring;
						input.setText(Double.toString(num));
						mult=false;
					}
					else if(div)
					{
						double numstring = Double.parseDouble(input.getText().toString().trim());
						num =num/numstring;
						input.setText(Double.toString(num));
						div=false;
					}
					else
					{
						String str = input.getText().toString().trim();
						if(str.length()!=0)
						{
							double numstring = Double.parseDouble(input.getText().toString().trim());
							if(num==0)
							{
								num = numstring;
								enter = true;
							}
						}
						else
							clear = true;
						
					}
					if(!clear)
					{
						minus=true;
						enter = true;
					}
				}
			}
		});	
		button_mult.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(v==button_mult)
				{
					clear = false;
					if(plus)
					{
						double numstring = Double.parseDouble(input.getText().toString().trim());
						num =num+numstring;
						input.setText(Double.toString(num));
						plus=false;
					}
					else if(minus)
					{
						double numstring = Double.parseDouble(input.getText().toString().trim());
						num =num-numstring;
						input.setText(Double.toString(num));
						minus=false;
					}
					else if(mult)
					{
						double numstring = Double.parseDouble(input.getText().toString().trim());
						num =num * numstring;
						input.setText(Double.toString(num));
					}
					else if(div)
					{
						double numstring = Double.parseDouble(input.getText().toString().trim());
						num =num/numstring;
						input.setText(Double.toString(num));
						div=false;
					}
					else
					{
						String str = input.getText().toString().trim();
						if(str.length()!=0)
						{
							double numstring = Double.parseDouble(input.getText().toString().trim());
							if(num==0)
							{
								num = numstring;
								enter = true;
							}
						}
						else
							clear = true;
						
					}
					if(!clear)
					{
						mult=true;
						enter = true;
					}
					
				}
			}
		});	
		button_div.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(v==button_div)
				{
					clear = false;
					if(plus)
					{
						double numstring = Double.parseDouble(input.getText().toString().trim());
						num =num+numstring;
						input.setText(Double.toString(num));
						plus=false;
					}
					else if(minus)
					{
						double numstring = Double.parseDouble(input.getText().toString().trim());
						num =num-numstring;
						input.setText(Double.toString(num));
						minus=false;
					}
					else if(mult)
					{
						double numstring = Double.parseDouble(input.getText().toString().trim());
						num =num * numstring;
						input.setText(Double.toString(num));
						mult=false;
					}
					else if(div)
					{
						double numstring = Double.parseDouble(input.getText().toString().trim());
						num =num/numstring;
						input.setText(Double.toString(num));
					}
					else
					{
						String str = input.getText().toString().trim();
						if(str.length()!=0)
						{
							double numstring = Double.parseDouble(input.getText().toString().trim());
							if(num==0)
							{
								num = numstring;
								enter = true;
							}
						}
						else
							clear = true;
						
					}
					if(!clear)
					{
						div=true;
						enter = true;
					}
					
				}
			}
		});	
		button_c.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(v==button_c)
				{
					input.setText("");
					num = 0;
					plus = false;
					minus = false;
					mult = false;
					div = false;
					enter = false;
					
				}
			}
		});	
		button_del.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(v==button_del)
				{
					String str = input.getText().toString().trim();
					if(str.length()!=0)
					{
					   str  = str.substring( 0, str.length() - 1 ); 
					   input.setText (str);
					}
				}
			}
		});	
		button_dot.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(v==button_dot)
				{
					if(!plus&&!minus&&!mult&&!div)
					{
						num=0;
					}
					if(enter)
					{
						enter = false;
						input.setText("");
					}
					CharSequence text = ".";
					input.append(text);
				}
			}
		});
		button_negative.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(v==button_negative)
				{
					String str = input.getText().toString().trim();
					if((str.length()==0)||(enter))
					{
						if(enter)
						{
							enter = false;
							input.setText("");
						}
					   CharSequence text = "-";
					   input.append(text);
					}
				}
			}
		});	
		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
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
