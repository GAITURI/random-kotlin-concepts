package com.example.empty

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class AirplaneModeChangeReceiver:BroadcastReceiver() {
    // this function will be executed when the user changes to airplane mode
    override fun onReceive(context: Context?, intent: Intent?) {

val isAirplaneModeEnabled = intent?.getBooleanExtra("state",false)?: return
//using what if expressions to check if airplane mode is on or off
        if (isAirplaneModeEnabled){
            //use toasts to share messages
            Toast.makeText(context,"AIRPLANE MODE ENGAGED", Toast.LENGTH_LONG).show()
        }else{
            Toast.makeText(context,"AIRPLANE MODE Disabled", Toast.LENGTH_LONG).show()
        }









    }
}