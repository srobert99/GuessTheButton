package com.example.myapplication

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class Greetings : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greetings)
        supportActionBar!!.hide()

        var intent=intent
        val fScore=intent.getIntExtra("EXTRA_SCORE",0)
        val finalscreen=findViewById<TextView>(R.id.final_score)
        val finalSen="FINAL SCORE:$fScore"

        finalscreen.text=finalSen



    }
}