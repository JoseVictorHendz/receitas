package com.example.jose_victor.receitas

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_instantaneo.*

class InstantaneoActivity : AppCompatActivity() {

    internal lateinit var macarraocarbonaraBtn: Button
    internal lateinit var macarraoSalsichaBtn: Button
    internal lateinit var macarraoLegumesBtn: Button
    internal lateinit var macarraoSardinhasBtn: Button
    internal lateinit var macarraoAlhoOlhoBtn: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_instantaneo)

        macarraocarbonaraBtn = findViewById(R.id.macarraocarbonaraBtn)
        macarraoSalsichaBtn = findViewById(R.id.macarraoSalsichaBtn)
        macarraoLegumesBtn = findViewById(R.id.macarraoLegumesBtn)
        macarraoSardinhasBtn = findViewById(R.id.macarraoSardinhasBtn)
        macarraoAlhoOlhoBtn = findViewById(R.id.macarraoAlhoOlhoBtn)

        macarraocarbonaraBtn.setOnClickListener {
            intent = Intent(this, ReceitasActivity::class.java)
            var id = 0
            intent.putExtra("id", id.toString())
            intent.putExtra("nomeReceita", nomeReceita(id))
            intent.putExtra("ingredientes", ingredientes(id))
            intent.putExtra("modoPreparo", modoPreparo(id))

            alternActivity(intent)
        }

        macarraoSalsichaBtn.setOnClickListener {
            intent = Intent(this, ReceitasActivity::class.java)
            var id = 1
            intent.putExtra("id", id.toString())
            intent.putExtra("nomeReceita", nomeReceita(id))
            intent.putExtra("ingredientes", ingredientes(id))
            intent.putExtra("modoPreparo", modoPreparo(id))

            alternActivity(intent)
        }

        macarraoLegumesBtn.setOnClickListener {
            intent = Intent(this, ReceitasActivity::class.java)
            var id = 2
            intent.putExtra("id", id.toString())
            intent.putExtra("nomeReceita", nomeReceita(id))
            intent.putExtra("ingredientes", ingredientes(id))
            intent.putExtra("modoPreparo", modoPreparo(id))

            alternActivity(intent)
        }

        macarraoSardinhasBtn.setOnClickListener {
            intent = Intent(this, ReceitasActivity::class.java)
            var id = 3
            intent.putExtra("id", id.toString())
            intent.putExtra("nomeReceita", nomeReceita(id))
            intent.putExtra("ingredientes", ingredientes(id))
            intent.putExtra("modoPreparo", modoPreparo(id))

            alternActivity(intent)
        }

        macarraoAlhoOlhoBtn.setOnClickListener {
            intent = Intent(this, ReceitasActivity::class.java)
            var id = 4
            intent.putExtra("id", id.toString())
            intent.putExtra("nomeReceita", nomeReceita(id))
            intent.putExtra("ingredientes", ingredientes(id))
            intent.putExtra("modoPreparo", modoPreparo(id))

            alternActivity(intent)
        }
    }

    fun alternActivity(intent: Intent) {
        startActivity(intent)
    }

    fun nomeReceita(id: Int): String {
        var nomeReceita = "Macarrão "

        if(id == 0)
            nomeReceita += "à carbonara"
        else if(id == 1)
            nomeReceita += "salsicha e tomate"
        else if(id == 2)
            nomeReceita += "legumes"
        else if(id == 3)
            nomeReceita += "sardinha"
        else if(id == 4)
            nomeReceita += "alho e olho"

        return nomeReceita
    }

    fun ingredientes(id: Int): String {
        var ingredientes = "Macarrão, "

        if(id == 0)
            ingredientes += "bacon, presunto picado, queijo ralado, ovos, cebolinha e pimenta-do-reino"
        else if(id == 1)
            ingredientes += "salsicha e tomate"
        else if(id == 2)
            ingredientes += "brócolis, repolho e tomate"
        else if(id == 3)
            ingredientes += "sardinha, molho de tomate, creme de leite e requeijão"
        else if(id == 4)
            ingredientes += "óleo, alho, cebola, orégano e queijo parmesão ralado"

        return ingredientes
    }

    fun modoPreparo(id: Int): String {
        var modoPreparo = ""

        if(id == 0)
            modoPreparo = "Basta preparar o macarrão normalmente, escorrer toda a água e, com ele ainda quente, colocar na " +
                    "frigideira com azeite e adicionar a mistura de ovos batidos com os demais ingredientes, de forma com que " +
                    "os ovos cozinhem com o calor da massa"
        else if(id == 1)
            modoPreparo = "Basta preparar o macarrão normalmente, escorrer toda a " +
                    "água e, com ele ainda quente, colocar na frigideira a " +
                    "salsicha e o tomate"
        else if(id == 2)
            modoPreparo = "Basta preparar o macarrão normalmente, escorrer toda a " +
                    "água e, com ele ainda quente, colocar na frigideira a " +
                    "brócolis, repolho e tomate"
        else if(id == 3)
            modoPreparo = "Basta preparar o macarrão normalmente, escorrer toda a " +
                    "água e, com ele ainda quente, colocar na frigideira a " +
                    "sardinha, molho de tomate, creme de leite e requeijão"
        else if(id == 4)
            modoPreparo = "Basta preparar o macarrão normalmente, escorrer toda a " +
                    "água e, com ele ainda quente, colocar na frigideira a " +
                    "óleo, alho, cebola, orégano e queijo parmesão ralado"

        return modoPreparo
    }
}
