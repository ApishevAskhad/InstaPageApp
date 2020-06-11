package ru.apishev.askhad.instapageapp

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_model.view.*

class CustomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bind(model: Model) {
        with(itemView) {
            nameTextView.text = model.name
        }
    }
}