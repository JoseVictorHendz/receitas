package com.example.jose_victor.receitas

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Spinner
import android.widget.ArrayAdapter





class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinner = findViewById<View>(R.id.instantaneas)  as Spinner
        createAdapterCategorias(spinner)

    }

    fun createAdapterCategorias(spinner: Spinner) {
        val adapter = ArrayAdapter.createFromResource(this,
                R.array.instantaneas_array, android.R.layout.simple_spinner_item)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        spinner.adapter = adapter
    }
}
