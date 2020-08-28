package com.example.whichnumberisbigger2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    var game = BiggerNumberGame(0, 100)
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //construct a new BiggerNumberObject
        //in Java: Square s = new Square()
        //in Kotlin: don't need new or to declare the type either

        textView_main_score.text = "Score: ${game.score}"
        button_main_left.text = game.leftNumber.toString()
        button_main_right.text = game.rightNumber.toString()
    }

    fun updateButtons() {
        game.generateRandomNumbers()
        textView_main_score.text = "Score: ${game.score}"
        button_main_left.text = game.leftNumber.toString()
        button_main_right.text = game.rightNumber.toString()
    }

    fun onLeftClick(view: View) {
        val message = game.checkAnswer(button_main_left.text.toString().toInt())
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
        updateButtons()
    }

    fun onRightClick(view: View) {
        val message = game.checkAnswer(button_main_right.text.toString().toInt())
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
        updateButtons()
    }
}

