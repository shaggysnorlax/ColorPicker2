package edu.temple.colorpicker;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;


public class CanvasActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.canvas_activity);

        Intent incomingPackage = getIntent();
        String color = incomingPackage.getStringExtra("Color");
        final ConstraintLayout constraintLayout = findViewById(R.id.canvas_activity);
        constraintLayout.setBackgroundColor(Color.parseColor(color));
        ((TextView)findViewById(R.id.colorText)).setText(color);

    }
}
