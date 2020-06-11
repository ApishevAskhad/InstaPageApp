package ru.apishev.askhad.instapageapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.ac_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ac_main)

        val items = listOf(Model("Alex"), Model("John"))

        with(mainRecyclerView) {
            layoutManager = LinearLayoutManager(context)
            adapter = CustomAdapter(items)
        }
    }
}