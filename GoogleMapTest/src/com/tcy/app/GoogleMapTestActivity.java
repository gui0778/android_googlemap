package com.tcy.app;

import com.google.android.gms.maps.GoogleMap;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class GoogleMapTestActivity extends FragmentActivity {
    /** Called when the activity is first created. */
	private GoogleMap googlemap;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
}