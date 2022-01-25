package com.psp.broadcastreceiver_example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

//    MyReceiver receiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
        Note: As part of the Android 8.0 (API level 26) Background Execution Limits,
        apps that target the API level 26 or higher can no longer register broadcast receivers for implicit broadcasts
        in their manifest. However, several broadcasts are currently exempted from these limitations.
        Apps can continue to register listeners for the following broadcasts, no matter what API level the apps target.
         */

        /*

        receiver = new MyReceiver();

        // Programmatically register broadcast receiver
        IntentFilter intentFilter = new IntentFilter("My_Action");
        registerReceiver(receiver,intentFilter);

        // Send action
        Intent i = new Intent("My_Action");
        i.putExtra("Data","hello world");
        sendBroadcast(i);

        */
    }
}