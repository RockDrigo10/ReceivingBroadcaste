package com.example.admin.receivingbroadcaste;

import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    MyDynamicBroadcast dynamicBroadcast;
    IntentFilter intentFilter;
    TextView tvText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvText = (TextView) findViewById(R.id.tvText);
        dynamicBroadcast= new MyDynamicBroadcast( tvText);
    }
    @Override
    protected void onStart() {
        super.onStart();
        intentFilter =  new IntentFilter();
        intentFilter.addAction("doSomething");
        registerReceiver(dynamicBroadcast,intentFilter);
    }

    @Override
    protected void onStop() {
        super.onStop();
        //unregisterReceiver(dynamicBroadcast);
    }
}
