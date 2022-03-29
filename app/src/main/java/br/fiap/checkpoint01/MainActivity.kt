package br.fiap.checkpoint01

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCalculadora.setOnClickListener { view: View? ->
            var intentResultado = Intent(this, CalculadoraActivity::class.java)
            startActivity(intentResultado)
        }

        btnContaTelefonica.setOnClickListener { view: View? ->
            var intentResultado = Intent(this, ContaTelefonicaActivity::class.java);
            startActivity(intentResultado)
        }

        btnIntegrantes.setOnClickListener {
            mostraAlertDialog()
        }
    }

    fun criaAlertDialog(): AlertDialog.Builder {
        val mensagem = """  |Ricardo Costa
                            |Emanuelle Pereira
                            |Yury Silva
            """.trimMargin("|");

        val dialog = AlertDialog.Builder(this);
        dialog
            .setTitle("Desenvolvido por:")
            .setMessage(mensagem)
            .setPositiveButton("OK", null)
        return dialog
    }

    fun mostraAlertDialog(){
        val dialog = criaAlertDialog()
        dialog.create().show()
    }
}