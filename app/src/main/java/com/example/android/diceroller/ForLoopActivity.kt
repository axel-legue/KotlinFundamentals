package com.example.android.diceroller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class ForLoopActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_for)

        val ages = arrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
        val names = arrayOf("Pau", "Toulouse", "Paris", "Lyon")
        /**
         * Boucle for sur un range "simple"
         */
        for (i in 1..5) {
          //  println(i)
        }

        for (i in 5 downTo 1) {
         //   println(i)
        }

        /**
         * Boucle for sur un range "step"
         */
        for (i in 1..5 step 2) {
         //   println(i)
        }

        for (i in 5 downTo 1 step 2) {
          //  println(i)
        }

        /**
         * Boucle Collection
         * for (item in collection) {}
         */
        for (item in names) {
          //  println(item)
        }
        // Pour ignorer un element dans une boucle "for" on utilise le mot clé "cotinue"
        for (item in names) {
            if (item == "Paris") {
                continue
            }
            //println(item)
        }

        // Pour ignorer un element dans une boucle "for" on utilise le mot clé "cotinue"
        for ((index, ville) in names.withIndex()) {
            println("$ville est a l'index $index")
        }

    }
}
