package com.example.felixchen.myapplication;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

import static android.widget.Toast.*;

/**
 * Created by FelixChen on 1/13/15.
 */
public class HelloService extends Service {
    private final static String LOG_TAG = HelloService.class.getSimpleName();

    public HelloService() {

    }

    @Override
    public IBinder onBind(Intent intent) {
        // the system calls this method when another component wants to bind with the service
        // (such as to perform RPC), by calling bindService()
        // if a component calls bindService() to create the service, then the service runs only
        // as long as the component is bound to it, Once the service is unbound from all clients
        // the system destroys it.
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(this, "service starting", Toast.LENGTH_LONG).show();

        Log.d(LOG_TAG, "onStartCommand()");

        return START_STICKY;
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
