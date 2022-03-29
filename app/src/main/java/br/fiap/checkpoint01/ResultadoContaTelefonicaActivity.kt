package br.fiap.checkpoint01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_resultado_conta_telefonica.*

class ResultadoContaTelefonicaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_conta_telefonica)

        textViewResultado.text = intent.getStringExtra("msg")
    }
}