package com.android.p01_thorat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    EditText dist;
    RadioButton toCm;
    RadioButton toMm;
    RadioButton toM;
    RadioButton toKm;
    RadioButton fromMtoCm;
    RadioButton fromKmtoCm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dist = (EditText)findViewById(R.id.enterNumberEditText);
        toCm = (RadioButton)findViewById(R.id.toCmRadioButton);
        toMm = (RadioButton)findViewById(R.id.toMmRadioButton);
        toM = (RadioButton)findViewById(R.id.toMRadioButton);
        toKm = (RadioButton)findViewById(R.id.toKmRadioButton);
        fromMtoCm = (RadioButton)findViewById(R.id.formMtoCmRadioButton);
        fromKmtoCm = (RadioButton)findViewById(R.id.fromKmtoCmRradioButton);
    }

    public void convert(View v){

        double value = new Double(dist.getText().toString());

        if(toCm.isChecked())
            value = UnitConverter.millimeter_to_centimeter(value);
        else if(toMm.isChecked())
            value = UnitConverter.centimeter_to_millimeter(value);
        else if(toM.isChecked())
            value = UnitConverter.centimeter_to_meter(value);
        else if(toKm.isChecked())
            value = UnitConverter.centimeter_to_kilometer(value);
        else if(fromMtoCm.isChecked())
            value = UnitConverter.meter_to_centimeter(value);
        else
            value = UnitConverter.kilometer_to_centimeter(value);

        dist.setText(new Double(value).toString());


    }
}

