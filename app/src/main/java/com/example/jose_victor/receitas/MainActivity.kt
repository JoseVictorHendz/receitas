package com.example.jose_victor.receitas

import android.content.Context
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


    override fun onItemSelected(parent: AdapterView<*>, view: View,
                                pos: Int, id: Long) {

    }

    override fun onNothingSelected(parent: AdapterView<*>) {
        // Another interface callback
    }

}
