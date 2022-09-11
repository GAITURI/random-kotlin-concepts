package com.example.empty

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

 class Service : AppCompatActivity(), View.OnClickListener {
    //while working with buttons initalize first
    private var start:Button? = null
    private var stop:Button?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_service)



        start =findViewById<View>(R.id.startButton)  as Button
        stop =findViewById<View>(R.id.stopButton)  as Button


// declaring listeners for the buttons to make them respond  correctly according to the process
   start!!.setOnClickListener(this)
        stop!!.setOnClickListener(this)
    }

     override fun onClick(view: View?) {
         //when start button is clicked
         if (view === start){


             //start a service using intent
             startService(Intent(this, CustomService::class.java))
         }
         else if (view === stop){
             //stop service
             stopService(Intent(this, CustomService::class.java))
         }
     }


}