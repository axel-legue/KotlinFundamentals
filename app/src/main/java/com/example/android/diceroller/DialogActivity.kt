package com.example.android.diceroller

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_dialog.*

class DialogActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dialog)

        // Dialog confirmation
        btn_dialog.setOnClickListener {
            val fragment = ConfirmDeleteDialogFragment()
            fragment.listener = object : ConfirmDeleteDialogFragment.ConfirmDeleteListener {
                override fun onDialogPositiveClick() {
                    Log.i("DialogActivity", "onDialogPositiveClick()")
                }

                override fun onDialogNegativeClick() {
                    Log.i("DialogActivity", "onDialogNegativeClick()")
                }

            }
            fragment.show(supportFragmentManager, "confirm delete")
        }
    }
}
