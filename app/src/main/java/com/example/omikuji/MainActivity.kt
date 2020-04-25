package com.example.omikuji

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val omikujiButton : Button = findViewById(R.id.omikuji_button)

        omikujiButton.setOnClickListener{
            /*
            var unsei =""
            val random = Random
            when(random.nextInt(5)){
                0 -> unsei = "大吉"
                1 -> unsei = "吉"
                2 -> unsei = "中吉"
                3 -> unsei = "小吉"
                4 -> unsei = "末吉"
                5 -> unsei = "凶"
            }
            Toast.makeText(applicationContext, unsei, Toast.LENGTH_SHORT).show()
             */
            val intent = Intent(this, ResultActivity::class.java)
            startActivity(intent)
        }
    }
}
