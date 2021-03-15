package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    var scor=0
    var contor: Int=0
    var rNumber=(1..3).random()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar!!.hide()
        binding.greenButton.setOnClickListener{pressedButton(1)}
        binding.redButton.setOnClickListener{pressedButton(2)}
        binding.blueButton.setOnClickListener{pressedButton(3)}
    }

    fun pressedButton(nr: Int){
        if(nr==rNumber){
            scor++
            rNumber=(1..3).random()
        }
        contor++
        if(contor>4){
            transfer()
            finish()
        }
        val prop="SCORE:$scor"
        binding.score.text=prop

    }

    fun transfer(){
        val intent= Intent(this@MainActivity,Greetings::class.java)
        intent.putExtra("EXTRA_SCORE",scor)
        startActivity(intent)

    }

}