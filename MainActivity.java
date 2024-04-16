package com.example.broadcastreceiverapplication;


import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        MyReceiver broadcastReceiver = new MyReceiver ();
//        IntentFilter filter = new IntentFilter("com.myapplication.BOOT");
//        registerReceiver(broadcastReceiver, filter);
//
//    }
//
//    @Override
//    protected void onDestroy() {
//        unregisterReceiver(broadcastReceiver);
//        super.onDestroy();
//    }
//}

    BroadcastReceiver br;
    IntentFilter filter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        br = new MyReceiver();

        filter= new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION);
        filter.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED);


    }



    public void broadcastIntent(View view){
        Intent intent = new Intent();
        intent.setAction("com.myapplication.TIMEZONE_CHANGED");
        sendBroadcast(intent);
        this.registerReceiver(br, filter);
    }
}