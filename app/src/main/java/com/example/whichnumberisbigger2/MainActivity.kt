package com.example.whichnumberisbigger2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    private var score = 0
    private var randomLeft = (Math.random()*100 + 1).toInt()
    private var randomRight = (Math.random()*100 + 1).toInt()

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        while(randomLeft == randomRight){
            randomRight = (Math.random()*100 + 1).toInt()
        }
        textView_main_score.text = "Score: $score"
        button_main_left.text = randomLeft.toString()
        button_main_right.text = randomRight.toString()
    }

    fun onLeftClick(view: View){
        if(randomLeft > randomRight){
            score++
            Toast.makeText(this, "Good job :)", Toast.LENGTH_LONG).show()
            textView_main_score.text = "Score: $score"
        }
        else{
            score--
            Toast.makeText(this, "Wrong choice :(", Toast.LENGTH_LONG).show()
            textView_main_score.text = "Score: $score"
        }
        randomLeft = (Math.random()*100 + 1).toInt()
        randomRight = (Math.random()*100 + 1).toInt()
        while(randomLeft == randomRight) {
            randomRight = (Math.random() * 100 + 1).toInt()
        }
        button_main_left.text = randomLeft.toString()
        button_main_right.text = randomRight.toString()
    }

    fun onRightClick(view: View){
        if(randomRight > randomLeft){
            score++
            Toast.makeText(this, "Good job :)", Toast.LENGTH_LONG).show()
            textView_main_score.text = "Score: $score"
        }
        else{
            score--
            Toast.makeText(this, "Wrong choice :(", Toast.LENGTH_LONG).show()
            textView_main_score.text = "Score: $score"
        }
        randomLeft = (Math.random()*100 + 1).toInt()
        randomRight = (Math.random()*100 + 1).toInt()
        while(randomLeft == randomRight) {
            randomRight = (Math.random() * 100 + 1).toInt()
        }
        button_main_left.text = randomLeft.toString()
        button_main_right.text = randomRight.toString()
    }
}

