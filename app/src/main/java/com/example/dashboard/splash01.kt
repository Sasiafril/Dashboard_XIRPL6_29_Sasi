package com.example.dashboard

import android.app.ActivityOptions
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.TextView

class splash01 : AppCompatActivity() {

    private lateinit var splashtext: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash01)

        val fadeAnimation = AnimationUtils.loadAnimation(this, R.anim.stb)


        splashtext = findViewById(R.id.splashtext)

        splashtext.startAnimation(fadeAnimation)

        val splashTo = 3000
        val homeIntent = Intent(this, MainActivity::class.java)

        Handler().postDelayed({
            startActivity(homeIntent)
            finish()
        }, splashTo.toLong())
    }
}