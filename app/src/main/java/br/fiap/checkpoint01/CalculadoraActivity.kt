package br.fiap.checkpoint01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_calculadora.*

class CalculadoraActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora)

        btnCalcularOperacao.setOnClickListener{ view : View ->
            val valor1 = findViewById<EditText>(R.id.editTextNumber1).text.toString().toDouble()
            val valor2 = findViewById<EditText>(R.id.editTextNumber2).text.toString().toDouble()

            if(rbSoma.isChecked){
                soma(valor1, valor2)
            }
            else if(rbSubtracao.isChecked){
               sub(valor1, valor2)
            }
            else if(rbMultiplicacao.isChecked){
                multi(valor1, valor2)
            }
            else if(rbDivisao.isChecked){
                div(valor1, valor2)
            }
        }
    }

    fun soma(valor1: Double, valor2: Double) {
        Toast.makeText(this,"Resultado: ${String.format("%.2f",valor1 + valor2)}", Toast.LENGTH_SHORT).show();
    }

    fun sub(valor1: Double, valor2: Double) {
        Toast.makeText(this,"Resultado: ${String.format("%.2f",valor1 - valor2)}", Toast.LENGTH_SHORT).show();
    }

    fun multi(valor1: Double, valor2: Double) {
        Toast.makeText(this,"Resultado: ${String.format("%.2f",valor1 * valor2)}", Toast.LENGTH_SHORT).show();
    }

    fun div(valor1: Double, valor2: Double) {
        Toast.makeText(this,"Resultado: ${String.format("%.2f",valor1 / valor2)}", Toast.LENGTH_SHORT).show();
    }
}