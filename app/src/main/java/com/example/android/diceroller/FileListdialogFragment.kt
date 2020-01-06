package com.example.android.diceroller

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment

class FileListdialogFragment : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(activity)

        val inflater = activity?.layoutInflater

        builder.setView(inflater?.inflate(R.layout.dialog_file_list, null))
            .setPositiveButton("Delete", null)
            .setNegativeButton("Cancel", null)
            .setTitle("Content deleted :")
        return builder.create()
    }

}