package com.rabor.customtitlebar;

import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Joy on 6/20/2016.
 */
public class FormActivity extends MainActivity
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        TextView tvHeading = (TextView) findViewById(R.id.titleHeading);
        tvHeading.setText("Add New Transaction");
    }
}