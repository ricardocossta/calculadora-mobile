package br.fiap.checkpoint01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_conta_telefonica.*

class ContaTelefonicaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_conta_telefonica)
        btnCalcularMinutosChamada.setOnClickListener { view: View? ->
            var assinatura = findViewById<EditText>(R.id.editTextAssinatura).text.toString().toDouble()
            var minLocal = findViewById<EditText>(R.id.editTextMinutosChamadaLocal).text.toString().toDouble()
            var minCelular = findViewById<EditText>(R.id.editTextMinutosChamadaCelular).text.toString().toDouble()

            var msg: String = calcularFaturaTelefonicaERetornaMensagem(
                assinatura,
                minLocal,
                minCelular
            )

            var intentResultado = Intent(this, ResultadoContaTelefonicaActivity::class.java)
            intentResultado.putExtra("msg", msg)
            startActivity(intentResultado)
        }
    }

    fun calcularFaturaTelefonicaERetornaMensagem(assinatura : Double, minutosLocal: Double, minutosCelular : Double): String {
        var valorLocal = minutosLocal * 0.04
        var valorCelular = minutosCelular * 0.20
        var total = assinatura + valorCelular + valorLocal

        return """Assinatura : R$${String.format("%.2f",assinatura)}
                            |Chamada Local : R$${String.format("%.2f",valorLocal)}
                            |Chamada Celular : R$${String.format("%.2f",valorCelular)}
                            |
                            |Valor Total : R$${total}
            """.trimMargin("|");
    }
}