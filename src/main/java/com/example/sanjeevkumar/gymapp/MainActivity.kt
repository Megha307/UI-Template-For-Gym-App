package com.example.sanjeevkumar.gymapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {
    val DELAY_MILLISECONDS = 2000L
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var handler = Handler()
        var run = Runnable {
            var intent = Intent(this@MainActivity, Loginactivity :: class.java)
            startActivity(intent)
            finish()
        }
        handler.postDelayed(run, DELAY_MILLISECONDS)


    }
}
