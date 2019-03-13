package com.example.sanjeevkumar.gymapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_link.*

class linkActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_link)
        facebook.setOnClickListener {
            Toast.makeText(this, "YOU HAVE SUCESSFULLY SIGNED UP", Toast.LENGTH_LONG).show()
        }
        google.setOnClickListener {
            Toast.makeText(this, "YOU HAVE SUCESSFULLY SIGNED UP", Toast.LENGTH_LONG).show()
        }
        signup.setOnClickListener {
            Toast.makeText(this, "YOU HAVE SUCESSFULLY SIGNED UP", Toast.LENGTH_LONG).show()
        }
    }
}
