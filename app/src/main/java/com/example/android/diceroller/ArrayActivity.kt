package com.example.android.diceroller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class ArrayActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        /**
         * Constructeur d'array
         *  val tableau = Array<Type>(taille) { valeur }
         */

        val ages = Array<Int>(10) { 0 }


        /**
         * Factory function pour array
         * val tableau = arrayOf(valeur1, valeur2, ..... )
         */
        val sizes = arrayOf(10, 12, 14, 16)

        /**
         * Récupérer/ Assigner une valeur d'un tableau
         * ages.get(index) ou ages[index]
         */
        ages.get(0)
        ages[0]
        ages.set(0,12)
        ages[0] = 12

    }
}
