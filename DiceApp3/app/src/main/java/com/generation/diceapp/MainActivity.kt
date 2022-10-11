package com.generation.diceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonD6 = findViewById<Button>(R.id.buttonD6)

        buttonD6.setOnClickListener {
            Toast.makeText(this, "Botão clicado", Toast.LENGTH_LONG).show()
            rolarDado1(6)

        }
        val buttonD12 = findViewById<Button>(R.id.buttonD12)

            buttonD12.setOnClickListener {
                Toast.makeText(this, "Botão clicado", Toast.LENGTH_LONG).show()
                rolarDado2(12)

            }
        val buttonD20 = findViewById<Button>(R.id.buttonD20)

                buttonD20.setOnClickListener {
                Toast.makeText(this, "Botão clicado", Toast.LENGTH_LONG).show()
                    rolarDado3(20)

                }
            }

            fun rolarDado1(lados: Int) {
                val rolagem = (1..lados).random()

                val textDado = findViewById<TextView>(R.id.textDado)

                textDado.text = rolagem.toString()
            }

        fun rolarDado2(lados: Int) {
            val rolagem = (1..lados).random()

            val textDado = findViewById<TextView>(R.id.textDado)

            textDado.text = rolagem.toString()
        }

        fun rolarDado3(lados: Int) {
            val rolagem = (1..lados).random()

            val textDado = findViewById<TextView>(R.id.textDado)

        textDado.text = rolagem.toString()
    }
}
