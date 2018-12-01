package com.example.jose_victor.receitas

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_receitas.*

class ReceitasActivity : AppCompatActivity() {
    internal lateinit var nomeReceitaTV: TextView
    internal lateinit var ingredientesTV: TextView
    internal lateinit var modoPreparoTV: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receitas)

        nomeReceitaTV = findViewById(R.id.nomeReceitaTV);
        ingredientesTV = findViewById(R.id.ingredientesTV);
        modoPreparoTV = findViewById(R.id.modoPreparoTV);


        val it = intent

        val id = it.getStringExtra("id")
        val nomeReceita = it.getStringExtra("nomeReceita")
        val ingredientes = it.getStringExtra("ingredientes")
        val modoPreparo = it.getStringExtra("modoPreparo")

        setImage(id.toInt())
        SetnomeReceita(nomeReceita)
        setIngredientes(ingredientes)
        setModoPreparo(modoPreparo)

    }

    fun setImage(id: Int){

        if(id == 0)
            fotoReceita.setImageResource(R.drawable.macarraoacarbonara)
        else if(id == 1)
            fotoReceita.setImageResource(R.drawable.macarraosalsicha)
        else if(id == 2)
            fotoReceita.setImageResource(R.drawable.macarraolegumes)
        else if(id == 3)
            fotoReceita.setImageResource(R.drawable.macarraosardinha)
        else if(id == 4)
            fotoReceita.setImageResource(R.drawable.macarroalhoeoleo)
    }

    fun SetnomeReceita(nomeReceita: String) {
        nomeReceitaTV.setText(nomeReceita)
    }


    fun setIngredientes(ingredientes: String) {
        ingredientesTV.setText(ingredientes)
    }

    fun setModoPreparo(modoPreparo: String) {
        modoPreparoTV.setText(modoPreparo)
    }
}
