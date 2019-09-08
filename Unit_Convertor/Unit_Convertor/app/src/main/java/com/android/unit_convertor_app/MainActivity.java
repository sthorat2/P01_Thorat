package com.android.unit_convertor_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    EditText dist;
    RadioButton toCm;
    RadioButton toMm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dist = (EditText)findViewById(R.id.enterNumberEditText);
        toCm = (RadioButton)findViewById(R.id.toCmRadioButton);
        toMm = (RadioButton)findViewById(R.id.toMmRadioButton);
    }

    public void convert(View v){

        double value = new Double(dist.getText().toString());

        if(toCm.isChecked())
            value = Unit_Converter.millimeter_to_centimeter(value);
        else
            value = Unit_Converter.centimeter_to_millimeter(value);

        dist.setText(new Double(value).toString());


    }
}
