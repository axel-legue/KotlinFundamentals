package com.example.android.diceroller

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var rollButton: Button
    private lateinit var countUpButton: Button
    private lateinit var resetButton: Button
    private lateinit var diceImage: ImageView
    private var diceNumber = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        rollButton = findViewById(R.id.roll_button)
        countUpButton = findViewById(R.id.count_button)
        resetButton = findViewById(R.id.reset_button)
        diceImage = findViewById(R.id.dice_img)
        rollButton.setOnClickListener { rollDice() }
        countUpButton.setOnClickListener { countUp() }
        resetButton.setOnClickListener { resetDice() }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        return when (item?.itemId) {
            R.id.action_add -> {
                Toast.makeText(this, "Ajouter", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.action_delete -> {
                Toast.makeText(this, "Delete", Toast.LENGTH_SHORT).show()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun rollDice() {
        diceNumber = Random().nextInt(6) + 1
        pickDiceImage(diceNumber)
    }

    private fun resetDice() {
        diceNumber = 0
        pickDiceImage(diceNumber)
    }

    private fun countUp() {
        if (diceNumber == 6) {
            // Do nothing
        } else {
            diceNumber += 1
            pickDiceImage(diceNumber)
        }
    }

    private fun pickDiceImage(value: Int) {
        when (value) {
            1 -> diceImage.setImageResource(R.drawable.dice_1)
            2 -> diceImage.setImageResource(R.drawable.dice_2)
            3 -> diceImage.setImageResource(R.drawable.dice_3)
            4 -> diceImage.setImageResource(R.drawable.dice_4)
            5 -> diceImage.setImageResource(R.drawable.dice_5)
            6 -> diceImage.setImageResource(R.drawable.dice_6)
            else -> { // Note the block
                diceImage.setImageResource(R.drawable.empty_dice)
            }
        }

    }

}
