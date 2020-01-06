package com.example.android.diceroller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

open class Account() {
    //Protected permet d'accéder a la variable dans les classes enfants, private ne l'aurai pas permis
    protected var balance: Int = 0

    // Fonction ouverte a sa surcharge == changement de comportement
    open fun deposit(value: Int) {
        balance += value
        val prefix = if (value >= 0) "+" else ""
        println(" $prefix $value € sur le compte, nouveau solde : $balance €")
    }
}

// Classe héritant de Account
class PositiveAccount() : Account() {
    // surcharge de la methode deposit de la classe parent Account
    override fun deposit(value: Int) {
        if (!isValidDeposit(value)) {
            println("Opération négative interdite sur un Positive Account")
            return
        }
        super.deposit(value)
    }

    // Méthode disponible uniquement au sein de la classe Positive Account
    private fun isValidDeposit(value: Int): Boolean {
        return balance + value >= 0
    }
}

class EncapsulationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ecapnsulation)


        println("Compte normal")
        val account = Account()
        account.deposit(50)

        println("Compte psoitif")
        val positiveAccount = PositiveAccount()
        positiveAccount.deposit(50)
        positiveAccount.deposit(-100)
        positiveAccount.deposit(-10)

    }
}
