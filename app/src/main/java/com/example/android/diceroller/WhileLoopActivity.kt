package com.example.android.diceroller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
class WhileLoopActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_while_loop)

//        while (true) {
//            // action 1
//            if (false) {
//                break
//            }
//            // action 2
//        }

        var unreadEmailCount = 3
        val notificationEnabled: Boolean = false

        do {
            println("Verification des emails en cours ... ")
            if (!notificationEnabled) {
                break
            }
            println("Vous avez $unreadEmailCount non lus")
            unreadEmailCount--
        } while (unreadEmailCount > 0)

    }
}
