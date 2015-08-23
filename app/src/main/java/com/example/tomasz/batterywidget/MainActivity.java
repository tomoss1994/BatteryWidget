package com.example.tomasz.batterywidget;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.view.Menu;


import java.util.List;
import java.util.Vector;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;






public class MainActivity extends FragmentActivity  {


    //kod



    private PagerAdapter mPagerAdapter;

    //kod



/*

    private TextView batteryInfo;
    private ProgressBar batteryLevel;
    private EditText batteryCharge;
    /** Called when the activity is first created. */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.viewpager_layout);
//kod
        initialisePaging();
     //kod
/*
        batteryInfo = (TextView) findViewById(R.id.TextView);
        batteryLevel = (ProgressBar) findViewById(R.id.progressWheel);
        batteryCharge = (EditText) findViewById(R.id.editText);


        this.registerReceiver(this.batteryInfoReceiver, new IntentFilter(Intent.ACTION_BATTERY_CHANGED));
*/
    }

    private void initialisePaging() {
        // TODO Auto-generated method stub
        List<Fragment> fragments = new Vector<Fragment>();
     //   fragments.add(Fragment.instantiate(this, MainActivity.class.getName()));
        fragments.add(Fragment.instantiate(this,Fragment1.class.getName()));
        fragments.add(Fragment.instantiate(this,Fragment2.class.getName()));
        fragments.add(Fragment.instantiate(this,Fragment3.class.getName()));
        mPagerAdapter =new PagerAdapter(this.getSupportFragmentManager(), fragments);

         ViewPager pager = (ViewPager) findViewById(R.id.viewpager);
        pager.setAdapter(mPagerAdapter);

    }








/*

    private BroadcastReceiver batteryInfoReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {

            int  health= intent.getIntExtra(BatteryManager.EXTRA_HEALTH,0);
            int  icon_small= intent.getIntExtra(BatteryManager.EXTRA_ICON_SMALL,0);
            int  level= intent.getIntExtra(BatteryManager.EXTRA_LEVEL,0);
            int  plugged= intent.getIntExtra(BatteryManager.EXTRA_PLUGGED,0);
            boolean  present= intent.getExtras().getBoolean(BatteryManager.EXTRA_PRESENT);
            int  scale= intent.getIntExtra(BatteryManager.EXTRA_SCALE, 0);
            int  status= intent.getIntExtra(BatteryManager.EXTRA_STATUS,0);
            String  technology= intent.getExtras().getString(BatteryManager.EXTRA_TECHNOLOGY);
            int  temperature= intent.getIntExtra(BatteryManager.EXTRA_TEMPERATURE, 0);
            int  voltage= intent.getIntExtra(BatteryManager.EXTRA_VOLTAGE,0);
            boolean isCharging = status == BatteryManager.BATTERY_STATUS_CHARGING ||
                    status == BatteryManager.BATTERY_STATUS_FULL;
            if (isCharging)
            {
                batteryCharge.setText("Ladowanie");
            }
            else
            {
                batteryCharge.setText("Nie laduje sie");
            }

            batteryLevel.setProgress(level);
            batteryInfo.setText(level+"%");

        }
    };


    */


    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


}


