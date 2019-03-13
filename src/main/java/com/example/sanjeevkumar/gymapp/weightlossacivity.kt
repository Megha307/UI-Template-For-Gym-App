package com.example.sanjeevkumar.gymapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat.startActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_link.*
import kotlinx.android.synthetic.main.activity_weightlossacivity.*

class weightlossacivity : AppCompatActivity()  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weightlossacivity)

musclegain.setOnClickListener {
    var intent=Intent(this,linkActivity::class.java)
    startActivity(intent)
}
        fatloss.setOnClickListener {
            var intent=Intent(this,linkActivity::class.java)
            startActivity(intent)
        }

        hlthy.setOnClickListener {
            var intent=Intent(this,linkActivity::class.java)
            startActivity(intent)
        }

    }



    }