package com.example.android.diceroller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_dialog.*

class DialogActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dialog)

        // Dialog confirmation
        btn_dialog.setOnClickListener {
            val fragment = ConfirmDeleteDialogFragment()
            fragment.show(supportFragmentManager, "confirm delete")
        }
    }
}
