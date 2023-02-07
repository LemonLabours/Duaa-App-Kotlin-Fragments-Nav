package com.alyousefcode.duaafragmentswithnav

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class Splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var handler: Handler
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)


        handler= Handler()
        handler.postDelayed({
            val intent3= Intent( this, MainActivity::class.java)
            startActivity(intent3)
            finish()
        }, 3000)
    }
}