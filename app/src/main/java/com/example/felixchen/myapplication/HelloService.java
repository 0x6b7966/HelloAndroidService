package com.example.felixchen.myapplication;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by FelixChen on 1/13/15.
 */
public class HelloService extends Service {
    private final static String LOG_TAG = HelloService.class.getSimpleName();

    public HelloService() {

    }

    public class LocalBinder extends Binder {
        HelloService getService() {
            return HelloService.this;
        }
    }

    private final IBinder mBinder = new LocalBinder();



    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        Log.d(LOG_TAG, "onCreate()");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        Log.d(LOG_TAG, "onDestroy()");
    }
}
