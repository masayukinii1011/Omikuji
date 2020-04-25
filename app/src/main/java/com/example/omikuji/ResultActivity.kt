package com.example.omikuji

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val reslutTextView : TextView = findViewById(R.id.reslut_text_view)

        var unsei = ""
        val random = Random
        when(random.nextInt(5)){
            0 -> unsei = "大吉"
            1 -> unsei = "吉"
            2 -> unsei = "中吉"
            3 -> unsei = "小吉"
            4 -> unsei = "末吉"
            5 -> unsei = "凶"
        }
        reslutTextView.text = unsei
    }
}