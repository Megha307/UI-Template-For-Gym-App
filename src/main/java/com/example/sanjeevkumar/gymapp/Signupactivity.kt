package com.example.sanjeevkumar.gymapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_signupactivity.*

class Signupactivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signupactivity)
        submitbtn.setOnClickListener {
            var intent = Intent(this, weightlossacivity::class.java)
            startActivity(intent)
        }
    }
fun male(v:View) {
    user.setImageResource(R.drawable.man)
}


        fun female(v:View) {
            user.setImageResource(R.drawable.girl)
        }



}
