package com.example.jose_victor.receitas

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import android.widget.AdapterView




class MainActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinner = findViewById<View>(R.id.categorias)  as Spinner
        createAdapterCategorias(spinner)

    }

    fun createAdapterCategorias(spinner: Spinner) {
        val adapter = ArrayAdapter.createFromResource(this,
                R.array.categorias_array, android.R.layout.simple_spinner_item)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        spinner.adapter = adapter
        spinner.onItemSelectedListener = this

    }

    fun alternActivity(intent: Intent) {
        startActivity(intent)
    }


    override fun onItemSelected(parent: AdapterView<*>, view: View,
                                pos: Int, id: Long) {
        val intent: Intent
        if(id.toInt() == 1) {
            intent = Intent(this, InstantaneoActivity::class.java)
            alternActivity(intent)

        } else if(id.toInt() == 2) {
            intent = Intent(this, BoloActivity::class.java)
            alternActivity(intent)


        } else if(id.toInt() != 0){
            intent = Intent(this, PizzaActivity::class.java)
            alternActivity(intent)

        }
    }

    override fun onNothingSelected(parent: AdapterView<*>) {
        // Another interface callback
    }

}
