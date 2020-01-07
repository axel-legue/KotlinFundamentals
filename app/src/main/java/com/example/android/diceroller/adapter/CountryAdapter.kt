package com.example.android.diceroller.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.android.diceroller.R
import kotlinx.android.synthetic.main.item_country.view.*

class CountryAdapter(val countries: Array<String>, val itemClickListener: View.OnClickListener) :
    RecyclerView.Adapter<CountryAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val icon = itemView.icon
        val name = itemView.name
        val cardview = itemView.cardview
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val viewItem =
            LayoutInflater.from(parent.context).inflate(R.layout.item_country, parent, false)
        return ViewHolder(viewItem)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val country = countries[position]

        holder.name.text = country
        holder.icon.setImageResource(R.mipmap.ic_launcher_round)
        holder.cardview.setOnClickListener(itemClickListener)
        // Every View in Android has an attribute "tag"
        holder.cardview.tag = position
    }

    override fun getItemCount(): Int {
        return countries.size
    }

}