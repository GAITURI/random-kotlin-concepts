package com.example.empty

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
//here we are registering the receiver in the main activity in order to receive updates of broadcasts events
    lateinit var receiver:AirplaneModeChangeReceiver
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        receiver= AirplaneModeChangeReceiver()

//use of intents
        IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED).also {
         //registering the receiver
            //it parameter which is passed in registerReceiver
            //is the intent filter that we have just created
            registerReceiver(receiver,it)
        }






    }

    override fun onStop() {
        super.onStop()
        unregisterReceiver(receiver)
    }
}