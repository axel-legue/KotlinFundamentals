package com.example.android.diceroller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

// Open c'est le mot clé pour permettre d'hériter de cette classe
abstract class Vehicule(val wheelsCount: Int) {
    fun showWheels() {
        println("Nombre de roues : ${wheelsCount}")
    }

    // le mot clé Asbtract ici oblige les enfants à définir le comportement de cette méthode
    abstract fun honk()
}

class Car : Vehicule(4) {
    override fun honk() {
        println("Pouet !")
    }
}

class Motorcycle : Vehicule(2) {
    override fun honk() {
        println("Tsouin!")
    }
}

class HeritageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_heritage)

        val car = Car()
        car.showWheels()
        val motorcycle = Motorcycle()
        motorcycle.showWheels()

        // Erreur car classe abstraite
        // var v = Vehicule()

        var vehicule: Vehicule = Car()
        vehicule.showWheels()
        vehicule.honk()

        vehicule = Motorcycle()
        vehicule.showWheels()
        vehicule.honk()


    }
}
