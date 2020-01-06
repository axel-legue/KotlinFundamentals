package com.example.android.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var rollButton: Button
    private lateinit var countUpButton: Button
    private lateinit var resetButton: Button
    private lateinit var resultText: TextView
    private var diceNumber = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rollButton = findViewById(R.id.roll_button)
        countUpButton = findViewById(R.id.count_button)
        resetButton = findViewById(R.id.reset_button)
        resultText = findViewById(R.id.result_text)
        rollButton.setOnClickListener { rollDice() }
        countUpButton.setOnClickListener { countUp() }
        resetButton.setOnClickListener { resetDice() }
    }

    private fun rollDice() {

        diceNumber = Random().nextInt(6) + 1
        resultText.text = diceNumber.toString()
    }

    private fun resetDice() {
        diceNumber = 0
        resultText.text = diceNumber.toString()
    }

    private fun countUp() {
        if (diceNumber == 6) {
            // Do nothing
        } else {
            diceNumber += 1
        }
        resultText.text = diceNumber.toString()
    }

}
