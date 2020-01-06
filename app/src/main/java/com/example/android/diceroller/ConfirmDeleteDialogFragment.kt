package com.example.android.diceroller

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.DialogFragment

class ConfirmDeleteDialogFragment : DialogFragment() {
    val TAG = ConfirmDeleteDialogFragment::class.java.simpleName

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        // Patern Builder
        val builder = AlertDialog.Builder(activity)
        builder.setMessage("Delete all phone content ?")
            .setPositiveButton(
                "Oh Yes",
                object : DialogInterface.OnClickListener {  // anonymous class
                    override fun onClick(dialog: DialogInterface?, id: Int) {
                        Log.i(TAG, "Yeah we will break everything")
                    }
                })
            .setNegativeButton("Euh ... No", DialogInterface.OnClickListener { dialog, id ->
                Log.i(TAG, "Maybe next time !!")
            })

        return builder.create()
    }
}