package ru.apishev.askhad.instapageapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

data class Model(val name: String)

class CustomAdapter(private val items: List<Model>) : RecyclerView.Adapter<CustomViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        return CustomViewHolder(
            LayoutInflater
                .from(parent.context)
                .inflate(R.layout.item_model, parent, false)
        )
    }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.bind(items[position])
    }
}