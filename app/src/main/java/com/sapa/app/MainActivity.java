package com.sapa.app;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setBackgroundColor(Color.WHITE);

        TextView logo = new TextView(this);
        logo.setText("S");
        logo.setTextSize(64);
        logo.setTextColor(Color.rgb(0, 150, 136));
        logo.setTypeface(Typeface.DEFAULT_BOLD);
        logo.setGravity(Gravity.CENTER);

        TextView title = new TextView(this);
        title.setText("SAPA");
        title.setTextSize(32);
        title.setTextColor(Color.rgb(0, 105, 92));
        title.setTypeface(Typeface.DEFAULT_BOLD);
        title.setGravity(Gravity.CENTER);

        TextView subtitle = new TextView(this);
        subtitle.setText("Terhubung. Berbicara. Bersama.");
        subtitle.setTextSize(16);
        subtitle.setTextColor(Color.DKGRAY);
        subtitle.setGravity(Gravity.CENTER);

        layout.addView(logo);
        layout.addView(title);
        layout.addView(subtitle);

        setContentView(layout);
    }
}
