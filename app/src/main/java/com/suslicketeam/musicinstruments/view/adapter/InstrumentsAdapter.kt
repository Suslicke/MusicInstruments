package com.suslicketeam.musicinstruments

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.suslicketeam.musicinstruments.model.Instrument
import java.text.NumberFormat

class InstrumentsAdapter(var instruments: List<Instrument>) :
    RecyclerView.Adapter<InstrumentsAdapter.ViewHolder>() {

    class ViewHolder(itemView: android.view.View) : RecyclerView.ViewHolder(itemView) {
        val nameTextView: TextView = itemView.findViewById(R.id.nameTextView)
        val descriptionTextView: TextView = itemView.findViewById(R.id.descriptionTextView)
        val typeTextView: TextView = itemView.findViewById(R.id.typeTextView)
        val priceTextView: TextView = itemView.findViewById(R.id.priceTextView)
        val buyButton: Button = itemView.findViewById(R.id.buyButton) // Added
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.instrument_item, parent, false)
        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int = instruments.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val instrument = instruments[position]
        holder.nameTextView.text = instrument.name
        holder.descriptionTextView.text = instrument.description
        holder.typeTextView.text = instrument.type

        val numberFormat = NumberFormat.getCurrencyInstance()
        holder.priceTextView.text = numberFormat.format(instrument.price)

        holder.buyButton.setOnClickListener {
            Toast.makeText(it.context, "Покупка успешно совершена!", Toast.LENGTH_SHORT).show()
        }
    }

}
