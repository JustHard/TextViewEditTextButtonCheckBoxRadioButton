package com.example.mymsi.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        TextView textView = (TextView) findViewById(R.id.textView);
        switch (view.getId()) {
            case R.id.checkBox1:
                if (checked) {
                    Toast.makeText(this, "选择小米", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(this, "取消选择小米", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.checkBox2:
                if (checked) {
                    Toast.makeText(this, "选择华为", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(this, "取消选择华为", Toast.LENGTH_LONG).show();
                }
            case R.id.checkBox3:
                if (checked) {
                    Toast.makeText(this, "选择苹果", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(this, "取消选择苹果", Toast.LENGTH_LONG).show();
                }
            case R.id.checkBox4:
                if (checked) {
                    Toast.makeText(this, "选择vivo", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(this, "取消选择vivo", Toast.LENGTH_LONG).show();
                }
        }
    }
    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        TextView textView=(TextView)findViewById(R.id.textView3);
        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radioButton:
                if (checked)
                    textView.setText("你的性别为男");
                break;
            case R.id.radioButton1:
                if (checked)
                    textView.setText("你的性别为女");
                break;
        }
    }
}

