package com.example.empty

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder
import android.provider.Settings

class CustomService : Service() {
    //initializing the media player object
    private lateinit var player: MediaPlayer
//EXECUTION OF SERVICE WILL START
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
      player = MediaPlayer.create(this,Settings.System.DEFAULT_RINGTONE_URI)
   player.isLooping
   player.start()
    return START_STICKY


    }

    override fun onDestroy() {
        super.onDestroy()
        player.stop()
    }



    override fun onBind(intent: Intent?): IBinder? {

return null



    }

}