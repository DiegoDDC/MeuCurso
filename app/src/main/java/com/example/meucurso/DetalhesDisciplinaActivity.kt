package com.example.meucurso

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetalhesDisciplinaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes_disciplina)

        val nome = intent.getStringExtra("NOME_DISCIPLINA") ?: "Disciplina"
        val cargaHoraria = intent.getStringExtra("CARGA_HORARIA") ?: "-"
        val modalidade = intent.getStringExtra("MODALIDADE") ?: "-"
        val descricao = intent.getStringExtra("DESCRICAO") ?: "-"
        val professor = intent.getStringExtra("PROFESSOR") ?: "-"
        val preRequisito = intent.getStringExtra("PRE_REQUISITO") ?: "-"

        findViewById<TextView>(R.id.txtNomeDisciplina).text = nome
        findViewById<TextView>(R.id.txtCargaHoraria).text = "Carga horária: $cargaHoraria"
        findViewById<TextView>(R.id.txtModalidade).text = "Modalidade: $modalidade"
        findViewById<TextView>(R.id.txtDescricaoDisciplina).text = "Descrição:\n$descricao"
        findViewById<TextView>(R.id.txtProfessor).text = "Professor: $professor"
        findViewById<TextView>(R.id.txtPreRequisito).text = "Pré-requisito: $preRequisito"

        val btnVoltar = findViewById<Button>(R.id.btnVoltar)
        btnVoltar.setOnClickListener {
            finish()
        }

        val btnCompartilhar = findViewById<Button>(R.id.btnCompartilhar)
        btnCompartilhar.setOnClickListener {
            val textoCompartilhado = "Estou estudando $nome ($cargaHoraria) no curso Meu Curso!"

            val intentCompartilhar = Intent(Intent.ACTION_SEND)
            intentCompartilhar.type = "text/plain"
            intentCompartilhar.putExtra(Intent.EXTRA_TEXT, textoCompartilhado)

            startActivity(Intent.createChooser(intentCompartilhar, "Compartilhar disciplina via"))
        }
    }
}
