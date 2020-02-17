package edu.temple.colorpicker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ConstraintLayout constraintLayout = findViewById(R.id.constraintLayout);

        Spinner spinner = findViewById(R.id.spinner);
        final String[] colorList = {"white", "red", "blue", "green", "magenta", "aqua", "fuchsia", "lime", "purple", "teal"};
        final ColorAdapter colorAdapter = new ColorAdapter(this, colorList);
        spinner.setAdapter(colorAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                constraintLayout.setBackgroundColor(Color.parseColor(colorList[position]));
                colorAdapter.selectedPos = position;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                constraintLayout.setBackgroundColor(Color.WHITE);
            }
        });
    }

}
