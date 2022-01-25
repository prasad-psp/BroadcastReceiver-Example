package com.psp.broadcastreceiver_example;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "PSP "+intent.getAction(), Toast.LENGTH_SHORT).show();
    }
}