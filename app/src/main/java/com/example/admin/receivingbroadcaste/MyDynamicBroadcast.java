package com.example.admin.receivingbroadcaste;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.TextView;

/**
 * Created by Admin on 8/15/2017.
 */

public class MyDynamicBroadcast extends BroadcastReceiver{
    TextView txt;

    public MyDynamicBroadcast(TextView txt) {
        this.txt = txt;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        txt.setText(intent.getStringExtra("send"));
    }
}
