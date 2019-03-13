package com.example.sanjeevkumar.gymapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_loginactivity.*

class Loginactivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loginactivity)
        jointheclub.setOnClickListener {
            var intent = Intent(this, Signupactivity::class.java)
            startActivity(intent)
        }
    }
}
