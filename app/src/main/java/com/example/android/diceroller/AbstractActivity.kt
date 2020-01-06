package com.example.android.diceroller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class AbstractActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_abstract)
    }



    fun definition(){
        /**
         * Elle se comporte comme toutes les classes:
         *      elle a des variables membres,
         *      des méthodes qui lui sont attachées.
         *      La seule différence c'est qu' ****  elle ne peut pas être instanciée ****
         *
         *Une classe Abstraite définit une idée abstraite qui sera implémentée par des classes enfants.
         * Elle existe uniquement pour être dérivée par des classes enfants.
         *
         *
         * Voir la classe véhicule dans HeritageActivity
         */




    }
}
