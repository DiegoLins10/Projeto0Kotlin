package com.example.primeiroprojeto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtA = findViewById<TextView>(R.id.txt_A)
        val txtB = findViewById<TextView>(R.id.txt_B)
        val btn_Calcular = findViewById<Button>(R.id.btn_Calcular)
        val txt_Resultado = findViewById<TextView>(R.id.txt_Resultado)


        //btn_Calcular_onclick
        btn_Calcular.setOnClickListener{
            val A = txtA.text.toString().toInt()
            val B = txtB.text.toString().toInt()
            var resultado = A + B

            txt_Resultado.text = "Resultado: $resultado"

        }
    }
}