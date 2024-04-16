package com.example.broadcastreceiverapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {
    private static final String TAG="MyReceiver";

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Intent Detected.", Toast.LENGTH_LONG).show();
//        String actionString=intent.getAction();
//        Toast.makeText(context, actionString, Toast.LENGTH_LONG).show();
//        String timeZone=intent.getStringExtra("time-zone");
//        Log.d(TAG,"onReceive"+timeZone);
    }
}
