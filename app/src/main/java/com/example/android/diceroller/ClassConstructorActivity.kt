package com.example.android.diceroller

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity


class Quad(val wheelCount: Int = 4) {
    fun honk() {
        //   Log.d("wheelCount", "Pouet !")
    }

    fun honkForWheels() {
        // Log.d("wheelCount", "Honking for wheels ")
        for (i in 0..wheelCount) {
            honk()
        }
    }
}

class User(
    val name: String,
    val age: Int,
    val height: Float
) {

    val canPlayBasketBall: Boolean = age > 5 && height > 1.50f

    init {
        val basketString = when (canPlayBasketBall) {
            true -> "Peut jouer au basket"
            false -> "Ne peut pas jouer au basket"
        }
        Log.d("wheelCount", "Info User : $name , $age, $basketString")
    }

    constructor(name: String) : this(name, 5, 1.20f)
}

class ClassConstructorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_poo)

        val car = Quad(4)
        Log.d("wheelCount", "Nombre de roues de la voiture: ${car.wheelCount}")
        car.honk()
        car.honkForWheels()

        val paul = User("Paul", 15, 1.8F)
        val Logan = User("Logan")
    }

    fun explications() {
        // Constructeur primaire de classe
        class MyClass(val a: Int, b: String)

        // Bloc d'initalisation
        class MyClass2(val a: Int, var b: Int) {
            init {
                if (a > 0) {
                    b = 5
                }
            }
        }

        // Constructeur secondaire
        class MyClass3(val a: Int, var b: Int) {
            constructor(a: Int) : this(a, 10)
            constructor() : this(0, 10)
        }

    }
}
