package com.sintutu.dailyponderance;

import com.getcapacitor.BridgeActivity;
import android.util.Log;

public class MainActivity extends BridgeActivity {
    @Override
    public void onStart() {
        super.onStart();
        Log.d("Capacitor", "App started successfully");
    }
}
