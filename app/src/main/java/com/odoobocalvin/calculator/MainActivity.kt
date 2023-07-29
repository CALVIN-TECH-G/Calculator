package com.odoobocalvin.calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {
    private val  splash_time_out =3000L
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Handler().postDelayed({
            val i = Intent(this,calac2::class.java)
            startActivity(i)
            finish()
        },splash_time_out
        )
    }
}